package ro.deiutzentertainment.common.session.datatypes;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.deiutzentertainment.common.session.consts.SessionEventType;

@Getter
@Setter
@AllArgsConstructor
public class BaseEvent {

    //TODO LIST of Timestamp and machine_name who processed this request (HISTORY OF IT).
    private final String span_id;
    private final SessionEventType messageType;

}
