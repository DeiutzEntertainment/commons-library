package ro.deiutzentertainment.common.session.datatypes.request;

import lombok.*;
import ro.deiutzentertainment.common.session.datatypes.BaseEvent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Getter
@ToString(callSuper = true)
public class RequestCreateSession extends BaseEvent {

    private final int sessionID;
    private final String owner;


    @JsonCreator
    public RequestCreateSession(
            @JsonProperty("sessionID") int sessionID,
            @JsonProperty("owner") String owner) {
        super();
        this.sessionID = sessionID;
        this.owner = owner;
    }
}
