package ro.deiutzentertainment.common.session.datatypes.request;

import lombok.Getter;
import lombok.ToString;
import ro.deiutzentertainment.common.session.datatypes.BaseEvent;

import java.util.List;


@Getter
@ToString(callSuper = true)
public class RequestJoinSession extends BaseEvent {

    private final int sessionID;
    private final String userId;

    public RequestJoinSession(int sessionID, String userId) {
        super();
        this.sessionID = sessionID;
        this.userId=userId;

    }
}
