package ro.deiutzentertainment.common.session.datatypes.response;

import lombok.Getter;
import lombok.ToString;
import ro.deiutzentertainment.common.session.consts.StatusConstants;
import ro.deiutzentertainment.common.session.datatypes.BaseEvent;

import java.util.List;


@Getter
@ToString(callSuper = true)
public class ResponseJoinSession extends BaseEvent {

    private final int sessionID;

    private final StatusConstants status;

    private final String reason;

    private final List<String> members;

    public ResponseJoinSession( int sessionID, StatusConstants status, String reason, List<String> members) {
        super();
        this.sessionID = sessionID;
        this.status = status;
        this.reason = reason;
        this.members = members;
    }
}
