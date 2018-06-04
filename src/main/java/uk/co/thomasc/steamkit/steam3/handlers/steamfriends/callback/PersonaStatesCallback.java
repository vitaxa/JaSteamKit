package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverFriends.CMsgClientPersonaState;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types.PersonaState;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;

import java.util.LinkedList;
import java.util.List;

/**
 * This callback is fired in response to someone changing their friend details over the network.
 */
public class PersonaStatesCallback extends CallbackMsg {

    private List<PersonaState> personaStates = new LinkedList<>();

    public PersonaStatesCallback(CMsgClientPersonaState.Builder body) {
        for (CMsgClientPersonaState.Friend friend : body.getFriendsList()) {
            personaStates.add(new PersonaState(friend));
        }
    }

    public List<PersonaState> getPersonaStates() {
        return personaStates;
    }
}
