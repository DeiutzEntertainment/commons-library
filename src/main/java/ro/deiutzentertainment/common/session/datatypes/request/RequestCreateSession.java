package ro.deiutzentertainment.common.session.datatypes.request;

import lombok.Getter;
import ro.deiutzentertainment.common.session.consts.SessionEventType;
import ro.deiutzentertainment.common.session.datatypes.BaseEvent;


@Getter
public class RequestCreateSession extends BaseEvent {

    private final int sessionID;
    private final String owner;

    public RequestCreateSession(String span_id, SessionEventType messageType, int sessionID, String owner) {
        super(span_id, messageType);
        this.sessionID = sessionID;
        this.owner = owner;

    }
}
