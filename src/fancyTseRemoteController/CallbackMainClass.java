package fancyTseRemoteController;

import fancyTseRemoteController.callback.TseUserCallback;
import fancyTseRemoteController.models.TseUser;

public class CallbackMainClass {

    public static void main(String[] args) {
        RemoteController rmc = new RemoteController();

        TseUser admin = new TseUser(TseUser.Role.ADMIN);

        TseUser tAdmin = new TseUser(TseUser.Role.TIMEADMIN);

        TseUser guest = new TseUser(TseUser.Role.GUEST);

        System.out.println("test 1: Login Admin \n");
        System.out.println(rmc.transport(new TseUserCallback(true, admin)).isBoolReturn());

        System.out.println("test 2: Login Admin again \n");
        System.out.println(rmc.transport(new TseUserCallback(true, admin)).isBoolReturn());

        System.out.println("test 3: Logut Admin \n");
        System.out.println(rmc.transport(new TseUserCallback(false, admin)).isBoolReturn());
    }
}
