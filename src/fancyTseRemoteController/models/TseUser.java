package fancyTseRemoteController.models;

public class TseUser {

    public enum Role {
        ADMIN,
        TIMEADMIN,
        GUEST;
    }

    private Role role;

    private boolean login = false;

    public TseUser(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }
}
