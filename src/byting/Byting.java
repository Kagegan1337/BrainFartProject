package byting;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.time.*;


public class Byting {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        LocalDate local = LocalDate.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(time, ZoneId.systemDefault());
        System.out.println(ZoneId.systemDefault());
        System.out.println(local.atStartOfDay(ZoneId.systemDefault()).toEpochSecond());
        System.out.println(Instant.from(zonedDateTime).getEpochSecond());
        System.out.println(Instant.now().getEpochSecond());
    }

    private static byte[] longToByteArray(final long i) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(bos);
        dos.writeLong(i);
        dos.flush();
        return bos.toByteArray();
    }
}
