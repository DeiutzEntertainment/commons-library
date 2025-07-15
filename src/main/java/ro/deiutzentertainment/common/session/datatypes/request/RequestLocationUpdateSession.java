package ro.deiutzentertainment.common.session.datatypes.request;

import lombok.Getter;
import lombok.ToString;
import ro.deiutzentertainment.common.session.datatypes.BaseEvent;
import ro.deiutzentertainment.datatypes.Location;


@Getter
@ToString(callSuper = true)
public class RequestLocationUpdateSession extends BaseEvent {

    private final String userId;
    private final Location location;

    public RequestLocationUpdateSession(Location location, String userId) {
        super();
        this.userId=userId;
        this.location=location;

    }
}
