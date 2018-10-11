package uk.co.thomasc.steamkit.steam3.handlers.steamunifiedmessages;

import com.google.protobuf.GeneratedMessageV3;

import static uk.co.thomasc.steamkit.base.generated.unified.SteamMsgCredentials.CCredentials_GetSteamGuardDetails_Request;
import static uk.co.thomasc.steamkit.base.generated.unified.SteamMsgCredentials.CCredentials_GetSteamGuardDetails_Response;
import static uk.co.thomasc.steamkit.base.generated.unified.SteamMsgEcon.CEcon_GetTradeOfferAccessToken_Request;
import static uk.co.thomasc.steamkit.base.generated.unified.SteamMsgEcon.CEcon_GetTradeOfferAccessToken_Response;
import static uk.co.thomasc.steamkit.base.generated.unified.SteamMsgPublishedFile.CPublishedFile_GetDetails_Request;
import static uk.co.thomasc.steamkit.base.generated.unified.SteamMsgPublishedFile.CPublishedFile_GetDetails_Response;

public enum UnifiedProtobufMethod {

    PUBLISHED_FILE_GET_DETAILS_REQUEST("PublishedFile.GetDetails#1",
            CPublishedFile_GetDetails_Request.class),

    PUBLISHED_FILE_GET_DETAILS_RESPONSE("PublishedFile.GetDetails#1_Response",
            CPublishedFile_GetDetails_Response.class),

    GET_STEAM_GUARD_DETAILS_REQUEST("Credentials.GetSteamGuardDetails#1",
            CCredentials_GetSteamGuardDetails_Request.class),

    GET_STEAM_GUARD_DETAILS_RESPONSE("Credentials.GetSteamGuardDetails#1_Response",
            CCredentials_GetSteamGuardDetails_Response.class),

    GET_TRADE_OFFER_ACCESS_TOKEN_REQUEST("Econ.GetTradeOfferAccessToken#1",
            CEcon_GetTradeOfferAccessToken_Request.class),

    GET_TRADE_OFFER_ACCESS_TOKEN_RESPONSE("Econ.GetTradeOfferAccessToken#1_Response",
            CEcon_GetTradeOfferAccessToken_Response.class);

    private final String name;

    private final Class<? extends com.google.protobuf.GeneratedMessageV3> message;

    UnifiedProtobufMethod(String name,
                          Class<? extends com.google.protobuf.GeneratedMessageV3> message) {
        this.name = name;
        this.message = message;
    }

    public static UnifiedProtobufMethod byMethodName(String methodName) {
        for (UnifiedProtobufMethod unifiedProtobufMethod : values()) {
            if (unifiedProtobufMethod.getName().equalsIgnoreCase(methodName)) {
                return unifiedProtobufMethod;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public Class<? extends GeneratedMessageV3> getMessage() {
        return message;
    }
}
