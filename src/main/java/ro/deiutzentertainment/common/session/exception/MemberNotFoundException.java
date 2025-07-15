package ro.deiutzentertainment.common.session.exception;

public class MemberNotFoundException extends RuntimeException{
    public MemberNotFoundException(String msg){
        super(msg);
    }
}
