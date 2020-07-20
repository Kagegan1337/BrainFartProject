package SystemTimeManipulation;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;

public class SystemMainManipulation {

    public static void main(String[] args) {
        System.out.println(Instant.now());
        System.out.println(Instant.now(Clock.fixed(
                Instant.parse("2018-08-22T10:00:00Z"),
                ZoneOffset.UTC)).getEpochSecond());
    }
}
