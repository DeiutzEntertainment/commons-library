package ro.deiutzentertainment.web;

import lombok.Getter;

public enum ServerType {

    FCUH(8000, "/FCUH/"),
    FCIS(8001, "/FCIS/"),
    FCSessionManager(8002,"/FCSM/");


    @Getter
    private int port;
    @Getter
    private String root;

    ServerType(int defaultPort, String root) {
        this.port = defaultPort;
        this.root = root;
    }
}
