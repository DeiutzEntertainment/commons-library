package ro.deiutzentertainment.common.session.exception;

public class SessionNotFoundException extends RuntimeException{
    public SessionNotFoundException(String msg){
        super(msg);
    }
}
