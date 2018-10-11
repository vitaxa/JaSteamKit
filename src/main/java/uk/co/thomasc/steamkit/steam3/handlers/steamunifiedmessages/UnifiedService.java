//package uk.co.thomasc.steamkit.steam3.handlers.steamunifiedmessages;
//
//import uk.co.thomasc.steamkit.steam3.handlers.steamunifiedmessages.callbacks.ServiceMethodResponseCallback;
//import uk.co.thomasc.steamkit.types.AsyncJob;
//
//import java.util.function.Function;
//
//public class UnifiedService<TService> {
//
//    private final SteamUnifiedMessages steamUnifiedMessages;
//
//    private UnifiedService(SteamUnifiedMessages steamUnifiedMessages) {
//        this.steamUnifiedMessages = steamUnifiedMessages;
//    }
//
//    public <TResponse> TResponse sendMessage(Function<TService, TResponse> function) {
//        return sendMessage(function, false);
//    }
//
//    /**
//     * Sends a message
//     * Results are returned in a {@link ServiceMethodResponseCallback}
//     * The returned {@link AsyncJob} can also be awaited to retrieve the callback result
//     *
//     * @param function       RPC call expression, e.g. x => x.SomeMethodCall(message)
//     * @param isNotification Whether this message is a notification or not
//     * @param <TResponse>    The type of the protobuf object which is the response to the RPC call
//     * @return The JobID of the request. This can be used to find the appropriate {@link ServiceMethodResponseCallback}
//     */
//    public <TResponse> AsyncJob<ServiceMethodResponseCallback> sendMessage(Function<TService, TResponse> function,
//                                                                           boolean isNotification) {
//
//    }
//
//}
