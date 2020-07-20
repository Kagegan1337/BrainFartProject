package fancyTseRemoteController.callback;

import fancyTseRemoteController.models.TransportReturn;
import fancyTseRemoteController.models.TseUser;

public class TseUserCallback implements TransportCallback {

    private boolean login = false;

    private TseUser tseUser;

    public TseUserCallback(boolean login, TseUser tseUser) {
        this.login = login;
        this.tseUser = tseUser;
    }

    @Override
    public TransportReturn doUrJob() {
        if(login) {
            return new TransportReturn(loginUser());
        } else {
            return new TransportReturn(logoutUser());
        }
    }

    private boolean loginUser() {
        if(tseUser.isLogin()) {
            return false;
        }
        System.out.println(" \t Login user" + tseUser.getRole() + "\n");
        tseUser.setLogin(true);
        return true;
    }

    private boolean logoutUser() {
        if(!tseUser.isLogin()) {
            return false;
        }
        System.out.println(" \t Logout user " + tseUser.getRole() + "\n");
        tseUser.setLogin(false);
        return true;
    }
}
