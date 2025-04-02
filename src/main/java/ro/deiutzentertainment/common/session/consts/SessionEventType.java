package ro.deiutzentertainment.common.session.consts;

import lombok.Getter;
import ro.deiutzentertainment.common.session.datatypes.request.RequestCreateSession;
import ro.deiutzentertainment.common.session.datatypes.response.ResponseCreateSession;
import ro.deiutzentertainment.common.session.exception.SessionMessageTypeNotFoundException;

import java.util.Arrays;

@Getter
public enum SessionEventType {

    CREATE(0,RequestCreateSession.class, ResponseCreateSession.class),
    /*JOIN,LOCATION_UPDATE,LEAVE,DISBAND*/;


    private final int index;
    private final Class<?>request,response;
    SessionEventType(int index, Class<?> request, Class<?> response) {
        this.index=index;
        this.request=request;
        this.response=response;
    }

    public static SessionEventType getByIndex(int index){

        return Arrays.stream(values()).filter((type) -> index ==
                type.getIndex()).findAny()
                .orElseThrow(() -> new SessionMessageTypeNotFoundException("Message type of "+ index + " not found!"));
    }



}
