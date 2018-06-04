package uk.co.thomasc.steamkit.steam3.steamclient.configuration;

import uk.co.thomasc.steamkit.base.generated.enums.EClientPersonaStateFlag;
import uk.co.thomasc.steamkit.base.generated.enums.EUniverse;
import uk.co.thomasc.steamkit.networking.steam3.ProtocolType;
import uk.co.thomasc.steamkit.steam3.discovery.provider.IServerListProvider;
import uk.co.thomasc.steamkit.steam3.discovery.provider.NullServerListProvider;
import uk.co.thomasc.steamkit.steam3.webapi.WebAPI;

import java.util.EnumSet;

public class SteamConfigurationBuilder implements ISteamConfigurationBuilder {

    private SteamConfigurationState state;

    public SteamConfigurationBuilder() {
        state = createDefaultState();
    }

    public static SteamConfigurationState createDefaultState() {
        SteamConfigurationState state = new SteamConfigurationState();

        state.setAllowDirectoryFetch(true);
        state.setConnectionTimeout(5000L);
        state.setDefaultPersonaStateFlags(EnumSet.of(EClientPersonaStateFlag.PlayerName, EClientPersonaStateFlag.Presence,
                EClientPersonaStateFlag.SourceID, EClientPersonaStateFlag.GameExtraInfo, EClientPersonaStateFlag.LastSeen));
        state.setProtocolTypes(ProtocolType.TCP);
        state.setServerListProvider(new NullServerListProvider());
        state.setUniverse(EUniverse.Public);
        state.setWebAPIBaseAddress(WebAPI.API_ROOT);

        return state;
    }

    public SteamConfiguration build() {
        return new SteamConfiguration(state);
    }

    @Override
    public ISteamConfigurationBuilder withCellID(int cellID) {
        state.setCellID(cellID);
        return this;
    }

    @Override
    public ISteamConfigurationBuilder withConnectionTimeout(long connectionTimeout) {
        state.setConnectionTimeout(connectionTimeout);
        return this;
    }

    @Override
    public ISteamConfigurationBuilder withDefaultPersonaStateFlags(EnumSet<EClientPersonaStateFlag> personaStateFlags) {
        state.setDefaultPersonaStateFlags(personaStateFlags);
        return this;
    }

    @Override
    public ISteamConfigurationBuilder withDefaultPersonaStateFlags(EClientPersonaStateFlag personaStateFlags) {
        state.setDefaultPersonaStateFlags(personaStateFlags);
        return this;
    }

    @Override
    public ISteamConfigurationBuilder withDirectoryFetch(boolean allowDirectoryFetch) {
        state.setAllowDirectoryFetch(allowDirectoryFetch);
        return this;
    }

    @Override
    public ISteamConfigurationBuilder withProtocolTypes(EnumSet<ProtocolType> protocolTypes) {
        state.setProtocolTypes(protocolTypes);
        return this;
    }

    @Override
    public ISteamConfigurationBuilder withProtocolTypes(ProtocolType protocolTypes) {
        state.setProtocolTypes(protocolTypes);
        return this;
    }

    @Override
    public ISteamConfigurationBuilder withServerListProvider(IServerListProvider provider) {
        if (provider == null) {
            throw new IllegalArgumentException("provider is null");
        }
        state.setServerListProvider(provider);
        return this;
    }

    @Override
    public ISteamConfigurationBuilder withUniverse(EUniverse universe) {
        state.setUniverse(universe);
        return this;
    }

    @Override
    public ISteamConfigurationBuilder withWebAPIBaseAddress(String baseAddress) {
        if (baseAddress == null) {
            throw new IllegalArgumentException("baseAddress is null");
        }
        state.setWebAPIBaseAddress(baseAddress);
        return this;
    }

    @Override
    public ISteamConfigurationBuilder withWebAPIKey(String webApiKey) {
        if (webApiKey == null) {
            throw new IllegalArgumentException("webApiKey is null");
        }
        state.setWebAPIKey(webApiKey);
        return this;
    }
}
