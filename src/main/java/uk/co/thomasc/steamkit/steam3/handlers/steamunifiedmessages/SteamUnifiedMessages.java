package uk.co.thomasc.steamkit.steam3.handlers.steamunifiedmessages;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageV3;
import uk.co.thomasc.steamkit.base.ClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.generated.enums.EMsg;
import uk.co.thomasc.steamkit.steam3.handlers.ClientMsgHandler;
import uk.co.thomasc.steamkit.steam3.handlers.steamunifiedmessages.callbacks.ServiceMethodResponseCallback;
import uk.co.thomasc.steamkit.types.AsyncJob;
import uk.co.thomasc.steamkit.types.SimpleAsyncJob;
import uk.co.thomasc.steamkit.util.logging.DebugLog;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientServiceMethod;
import static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientServiceMethodResponse;

public class SteamUnifiedMessages extends ClientMsgHandler {

    private Map<EMsg, Consumer<IPacketMsg>> dispatchMap;

    public SteamUnifiedMessages() {
        dispatchMap = new HashMap<>();

        dispatchMap.put(EMsg.ClientServiceMethodResponse, this::handleClientServiceMethodResponse);
        dispatchMap.put(EMsg.ServiceMethod, this::handleServiceMethod);
    }

    /**
     * Sends a message
     *
     * @param unifiedProtobufMethod Protobuf method. It contains name of the RPC endpoint
     * @param message               The message to send
     * @param isNotification        Whether this message is a notification or not
     * @param <T>                   The type of a protobuf object builder.
     * @param <R>                   The type of a returned protobuf message
     * @return protobuf response message
     */
    public <T extends GeneratedMessageV3.Builder<T>,
            R extends GeneratedMessageV3> AsyncJob<ServiceMethodResponseCallback<R>> sendMessage(UnifiedProtobufMethod unifiedProtobufMethod,
                                                                                                 T message,
                                                                                                 boolean isNotification) {
        return sendMessage(unifiedProtobufMethod.getName(), message, isNotification);
    }

    /**
     * Sends a message
     *
     * @param methodName     Name of the RPC endpoint. Takes the format ServiceName.RpcName
     * @param message        The message to send
     * @param isNotification Whether this message is a notification or not
     * @param <T>            The type of a protobuf object builder.
     * @param <R>            The type of a returned protobuf message
     * @return protobuf response message
     */
    public <T extends GeneratedMessageV3.Builder<T>,
            R extends GeneratedMessageV3> AsyncJob<ServiceMethodResponseCallback<R>> sendMessage(String methodName,
                                                                                                 T message,
                                                                                                 boolean isNotification) {
        final ClientMsgProtobuf<CMsgClientServiceMethod.Builder> msg
                = new ClientMsgProtobuf<>(CMsgClientServiceMethod.class, EMsg.ClientServiceMethod);
        msg.setSourceJobID(client.getNextJobID());
        final ByteArrayOutputStream baos = new ByteArrayOutputStream(0);
        try {
            if (message == null) {
                msg.getBody().setSerializedMethod(ByteString.EMPTY);
            } else {
                baos.write(message.build().toByteArray());
                msg.getBody().setSerializedMethod(ByteString.copyFrom(baos.toByteArray()));
            }
            msg.getBody().setMethodName(methodName);
            msg.getBody().setIsNotification(isNotification);
            client.send(msg);

            return new SimpleAsyncJob<ServiceMethodResponseCallback<R>>(client, msg.getSourceJobID());
        } catch (IOException e) {
            DebugLog.printStackTrace("SteamUnifiedMessages", e);
        }
        return null;
    }

    @Override
    public void handleMsg(IPacketMsg packetMsg) {
        if (packetMsg == null) {
            throw new IllegalArgumentException("packetMsg can't be null");
        }
        final Consumer<IPacketMsg> packetMsgConsumer = dispatchMap.get(packetMsg.getMsgType());
        if (packetMsgConsumer != null) {
            packetMsgConsumer.accept(packetMsg);
        }
    }

    private void handleClientServiceMethodResponse(IPacketMsg packetMsg) {
        final ClientMsgProtobuf<CMsgClientServiceMethodResponse.Builder> response
                = new ClientMsgProtobuf<>(CMsgClientServiceMethodResponse.class, packetMsg);
        final ServiceMethodResponseCallback callback = new ServiceMethodResponseCallback(response.getTargetJobID(),
                response.getProtoHeader().getEresult(), response.getBody());
        client.postCallback(callback);
    }

    private void handleServiceMethod(IPacketMsg packetMsg) {
        // TODO: Handle
//        final ClientMsgProtobuf<CMsgClientServiceMethod.Builder> notification
//                = new ClientMsgProtobuf<>(CMsgClientServiceMethod.class, packetMsg);
//        final String jobName = notification.getProtoHeader().getTargetJobName();
//        if (jobName != null && !jobName.isEmpty()) {
//            final String[] splitByDot = jobName.split(".");
//            final String[] splitByHash = splitByDot[1].split("#");
//            final String serviceName = splitByDot[0];
//            final String methodName = splitByHash[0];
//
//            System.out.println("SERVICE NAME: " + serviceName);
//
//            final String serviceInterfaceName = "uk.co.thomasc.steamkit.unified.I" + serviceName;
//            try {
//                final Class<?> serviceInterfaceClass = Class.forName(serviceInterfaceName);
//                //serviceInterfaceClass.getMethod(methodName, )
//            } catch (ClassNotFoundException e) {
//                DebugLog.printStackTrace("SteamUnifiedMessages", e);
//            }
//        }
    }

//    void HandleServiceMethod( IPacketMsg packetMsg )
//    {
//        var notification = new ClientMsgProtobuf( packetMsg );
//
//        var jobName = notification.Header.Proto.target_job_name;
//        if ( !string.IsNullOrEmpty( jobName ) )
//        {
//            var splitByDot = jobName.Split( '.' );
//            var splitByHash = splitByDot[1].Split( '#' );
//
//            var serviceName = splitByDot[0];
//            var methodName = splitByHash[0];
//
//            var serviceInterfaceName = "SteamKit2.Unified.Internal.I" + serviceName;
//            var serviceInterfaceType = Type.GetType( serviceInterfaceName );
//            if (serviceInterfaceType != null)
//            {
//                var method = serviceInterfaceType.GetMethod( methodName );
//                if ( method != null )
//                {
//                    var argumentType = method.GetParameters().Single().ParameterType;
//
//                    var callback = new ServiceMethodNotification( argumentType, packetMsg );
//                    Client.PostCallback( callback );
//                }
//            }
//        }
//    }
}
