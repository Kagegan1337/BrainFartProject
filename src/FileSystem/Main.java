package FileSystem;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File f = new File("temp\\info.txt");
        if(!f.getParentFile().mkdirs()) {

        }
        byte[] b = "THIS IS SPARTA".getBytes();
        InputStream is = new ByteArrayInputStream(b);
        try {
            FileOutputStream br  = new FileOutputStream(f,true);
            byte[] buffer = new byte[is.available()];
            is.read(buffer);
            br.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
