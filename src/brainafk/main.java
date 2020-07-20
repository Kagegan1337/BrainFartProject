package brainafk;

public class main {

    public static void main(String[] args) {
        Integer x = null;
        try {
            x = x + 1;
        } catch (NullPointerException e) {
        }
        System.out.println("nothing happend");
    }
}
