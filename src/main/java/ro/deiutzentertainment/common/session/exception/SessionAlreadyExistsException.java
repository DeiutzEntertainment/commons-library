package ro.deiutzentertainment.common.session.exception;

public class SessionAlreadyExistsException extends RuntimeException{
    public SessionAlreadyExistsException(String msg){
        super(msg);
    }
}
