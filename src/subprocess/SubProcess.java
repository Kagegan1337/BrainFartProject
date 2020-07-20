package subprocess;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;

public class SubProcess {

    public static void main(String[] args) {
        String sep = System.getProperty("file.separator");
        File f = new File("tools" + sep + "factoryReset.jar");
        if (f.exists()) {
            System.out.println("starting factory reset");
            try {
                Process p = Runtime.getRuntime().exec("java -jar "+f.getPath());
                BufferedInputStream catOutput= new BufferedInputStream(p.getInputStream());
                int read = 0;
                byte[] output = new byte[1024];
                while ((read = catOutput.read(output)) != -1) {
                    System.out.println(output[read]);
                }
            } catch (IOException e) {
                System.out.println("an error occurred:");
                e.printStackTrace();
            }
        }
    }
}
