package ro.deiutzentertainment.common.session.datatypes.response;

import lombok.Getter;
import lombok.ToString;
import ro.deiutzentertainment.common.session.consts.StatusConstants;
import ro.deiutzentertainment.common.session.datatypes.BaseEvent;
import ro.deiutzentertainment.datatypes.Location;

import java.util.List;


@Getter
@ToString(callSuper = true)
public class ResponseLocationUpdateSession extends BaseEvent {

    private final int sessionID;

    private final StatusConstants status;

    private final List<String> members;

    private final float topSpeed;

    private final Location location;

    public ResponseLocationUpdateSession(int sessionID, StatusConstants status, List<String> members, float topSpeed,Location location) {
        super();
        this.sessionID = sessionID;
        this.status = status;
        this.members = members;
        this.topSpeed = topSpeed;
        this.location=location;
    }
}
