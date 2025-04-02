package ro.deiutzentertainment.common.session.datatypes.response;

import lombok.Getter;
import ro.deiutzentertainment.common.session.consts.SessionEventType;
import ro.deiutzentertainment.common.session.consts.StatusConstants;
import ro.deiutzentertainment.common.session.datatypes.BaseEvent;



@Getter
public class ResponseCreateSession extends BaseEvent {


    private final int sessionID;

    private final String owner;

    private final StatusConstants status;

    private final String reason;

    public ResponseCreateSession(String span_id, SessionEventType messageType, int sessionID, String owner, StatusConstants status, String reason) {
        super(span_id, messageType);
        this.sessionID = sessionID;
        this.owner = owner;
        this.status = status;
        this.reason = reason;
    }
}
