package userlogs;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class parser {
    public static void main(String[] args) {
        String pattern1 = "   - [";
        String pattern2 = "][";
        RegParser p = new RegParser();
        List<Article> list = new ArrayList<>();
        File folder = new File("temp/");
        if (folder.isDirectory()) {
            for (final File fileEntry : Objects.requireNonNull(folder.listFiles())) {
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(fileEntry));
                    StringBuilder builder = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.contains(pattern1) && line.contains(pattern2)) {
                            builder.append(line).append("\n");
                            list.add(p.parse(line));
                        }
                    }
                    BufferedWriter writer = new BufferedWriter(new FileWriter(new File("output.txt")));
                    writer.write(builder.toString());
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
