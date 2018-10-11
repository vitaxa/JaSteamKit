package uk.co.thomasc.steamkit.steam3.handlers.steamunifiedmessages.callbacks;

import com.google.protobuf.GeneratedMessageV3;
import uk.co.thomasc.steamkit.base.generated.enums.EResult;
import uk.co.thomasc.steamkit.steam3.handlers.steamunifiedmessages.UnifiedProtobufMethod;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.util.logging.DebugLog;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientServiceMethodResponse;

public class ServiceMethodResponseCallback<R extends GeneratedMessageV3> extends CallbackMsg {

    /**
     * Result of the message
     */
    private final EResult result;

    /**
     * Raw binary response
     */
    private final byte[] responseRaw;

    /**
     * The full name of the service method
     */
    private final String methodName;

    public ServiceMethodResponseCallback(JobID jobID, int eResult, CMsgClientServiceMethodResponse.Builder msg) {
        setJobID(jobID);

        this.result = EResult.from(eResult);
        this.responseRaw = msg.getSerializedMethodResponse().toByteArray();
        this.methodName = msg.getMethodName();
    }

    public String getServiceName() {
        return methodName.split(".")[0];
    }

    public String getRpcName() {
        return methodName.substring(getServiceName().length() + 1).split("#")[0];
    }

    public EResult getResult() {
        return result;
    }

    public <TBuilder extends GeneratedMessageV3.Builder<TBuilder>> R getDeserializedResponse() {
        final UnifiedProtobufMethod unifiedProtobufMethod = UnifiedProtobufMethod.byMethodName(methodName + "_Response");
        if (unifiedProtobufMethod == null) {
            throw new IllegalStateException(String.format("Unknown method name %s", methodName + "_Response"));
        }
        try (final BinaryReader ms = new BinaryReader(new ByteArrayInputStream(responseRaw))) {
            final Method method = unifiedProtobufMethod.getMessage().getMethod("newBuilder");
            final TBuilder body = (TBuilder) method.invoke(null);

            return (R) body.mergeFrom(ms).build();
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | IOException e) {
            DebugLog.printStackTrace("ServiceMethodResponseCallback", e);
        }

        return null;
    }

    public byte[] getResponseRaw() {
        return responseRaw;
    }

    public String getMethodName() {
        return methodName;
    }
}
