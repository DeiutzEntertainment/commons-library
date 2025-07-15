package ro.deiutzentertainment.common.session.consts;

public enum StatusConstants {

    NONE(0),SUCCESS(200),FAILED(500);

    public final int status;
    StatusConstants(int status) {
        this.status=status;
    }


}
