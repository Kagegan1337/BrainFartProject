package JodaDate;


import java.time.Instant;

public class JodaMain {

    public static void main(String[] args) {
        long epoch = Instant.now().getEpochSecond();
        System.out.println(epoch);
        System.out.println(Instant.ofEpochSecond(epoch));
    }
}
