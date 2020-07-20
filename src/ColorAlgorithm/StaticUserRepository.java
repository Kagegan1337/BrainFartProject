package ColorAlgorithm;

import ColorAlgorithm.Model.User;

import java.util.ArrayList;
import java.util.List;

public class StaticUserRepository {

    private List<User> users;

    public StaticUserRepository() {
        users = new ArrayList<>();
        fillUserList();
    }

    private void fillUserList() {
        for(int i = 0; i<=10; i++) {
            users.add(new User("john", "doe", String.valueOf(i)));
        }
    }

    public void addUser(User user) {
        users.add(user);
    }
}
