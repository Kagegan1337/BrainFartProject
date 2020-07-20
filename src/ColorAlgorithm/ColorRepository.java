package ColorAlgorithm;

import ColorAlgorithm.Model.User;

import java.awt.*;
import java.util.HashMap;
import java.util.List;

public class ColorRepository {

    private List<User> users;
    private HashMap<User, Color> userColorMap;

    public ColorRepository(List<User> users) {
        this.users = users;
        fillHashMap();
    }

    private void fillHashMap() {
        int maxColor = users.size();
    }

}
