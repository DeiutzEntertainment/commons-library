package ro.deiutzentertainment.web;

public abstract class URLs {

    public static final String HOSTNAME = "http://deiutz.go.ro";   //"http://host.docker.internal";
    /**====================FCIS============================*/

    public static final String GET_IMAGE = HOSTNAME + ":" + ServerType.FCIS.getPort() + ServerType.FCIS.getRoot() + "user/profil/image/id";
    public static final String PROFIL_IMAGE_POST = HOSTNAME + ":" + ServerType.FCIS.getPort() + ServerType.FCIS.getRoot() + "user/profil/image";

    /**====================FCUH============================*/

    public static final String LOGIN = HOSTNAME + ":" + ServerType.FCUH.getPort() + ServerType.FCUH.getRoot() + "login";
    public static final String REGISTER = HOSTNAME + ":" + ServerType.FCUH.getPort() + ServerType.FCUH.getRoot() + "register";
    public static final String CHANGE_NAME =  HOSTNAME + ":" + ServerType.FCUH.getPort() + ServerType.FCUH.getRoot() + "change_name";
    public static final String GET_NAME =  HOSTNAME + ":" + ServerType.FCUH.getPort() + ServerType.FCUH.getRoot() + "get_name";
    public static final String TOKEN_CHECK = HOSTNAME + ":" + ServerType.FCUH.getPort() + ServerType.FCUH.getRoot() + "checkToken";
    public static final String ID_CHECK_BY_TOKEN = HOSTNAME + ":" + ServerType.FCUH.getPort() + ServerType.FCUH.getRoot() + "getIdByToken";
    public static final String UPDATE_LOCATION = HOSTNAME + ":" + ServerType.FCUH.getPort()+ServerType.FCUH.getRoot()+"user/location/update";
    public static final String GET_LOCATION = HOSTNAME + ":" + ServerType.FCUH.getPort()+ServerType.FCUH.getRoot()+"user/location/get/";
    public static final String GET_TOP_SPEED = HOSTNAME + ":" + ServerType.FCUH.getPort()+ServerType.FCUH.getRoot()+"user/location/topspeed/";
    public static final String NEAR_USERs = HOSTNAME + ":" + ServerType.FCUH.getPort()+ServerType.FCUH.getRoot()+"user/location/near";
    public static final String DISCONNECT_USER = HOSTNAME + ":" + ServerType.FCUH.getPort()+ServerType.FCUH.getRoot()+"user/disconnect/";
    public static final String GET_FRIEND_LIST = HOSTNAME + ":" + ServerType.FCUH.getPort()+ServerType.FCUH.getRoot()+"get_friend_list";
    public static final String GET_NAME_ONLINE_BY_ID = HOSTNAME + ":" + ServerType.FCUH.getPort()+ServerType.FCUH.getRoot()+"user/data/name_online/";
    public static final String INVITE_FRIEND = HOSTNAME + ":" + ServerType.FCUH.getPort()+ServerType.FCUH.getRoot()+"insertRequest";
    public static final String FRIEND_REQUESTS_LIST = HOSTNAME + ":" + ServerType.FCUH.getPort()+ServerType.FCUH.getRoot()+"getFriendRequestsList";
    public static final String FRIEND_REQUEST_RESPONSE = HOSTNAME + ":" + ServerType.FCUH.getPort()+ServerType.FCUH.getRoot()+"friendRequestResponse";
    public static final String FRIEND_REMOVE = HOSTNAME + ":" + ServerType.FCUH.getPort()+ServerType.FCUH.getRoot()+"friendRemove";
    public static final String LOGOUT = HOSTNAME+":"+ServerType.FCUH.getPort()+ServerType.FCUH.getRoot()+"logout";
    public static final String IS_USER_ONLINE = HOSTNAME + ":" + ServerType.FCUH.getPort()+ServerType.FCUH.getRoot()+"user/data/isOnline/";


    /**====================FCSessionManager============================*/

    public static final String JOIN_SESSION = HOSTNAME + ":" + ServerType.FCSessionManager.getPort() + ServerType.FCSessionManager.getRoot() + "joinSession";
    public static final String LEAVE_SESSION = HOSTNAME + ":" + ServerType.FCSessionManager.getPort() + ServerType.FCSessionManager.getRoot() + "sessions/{sessionId}/members/{memberId}";
    public static final String GET_USER_SESSION = HOSTNAME + ":" + ServerType.FCSessionManager.getPort() + ServerType.FCSessionManager.getRoot() + "userSession/";
    public static final String UPDATE_LOCATION_SESSION = HOSTNAME + ":" + ServerType.FCSessionManager.getPort()+ServerType.FCSessionManager.getRoot()+"locationUpdate";
    public static final String GET_TOP_SPEED_BY_USER_IN_SESSION = HOSTNAME + ":" + ServerType.FCSessionManager.getPort()+ServerType.FCSessionManager.getRoot()+"topSpeed/";
}
