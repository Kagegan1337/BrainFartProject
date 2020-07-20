package RegExLogging;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class LogEntryParser {
    public static void main(String[] args) {
        Map<String, Integer> result = new HashMap<>();
        File f = new File("temp/");
        try {
            BufferedWriter wr = new BufferedWriter(new FileWriter("anaylse.csv"));
            if (f.isDirectory()) {
                for (final File file : f.listFiles()) {
                    System.out.println(file.getName());
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String line;
                    while ((line = br.readLine()) != null) {
                        if (line.contains("add [1] article")) {
                            int start = line.indexOf("([article-") + 2;
                            int end = line.indexOf("]) - [");
                            String article = line.substring(start, end);
                            if (result.containsKey(article)) {
                                int current = result.get(article);
                                current++;
                                result.put(article, current);
                            } else {
                                result.put(article, 1);
                            }
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    for (Map.Entry<String, Integer> entry : result.entrySet()) {
                        stringBuilder.append(entry.getKey()).append(";").append(entry.getValue()).append("\n");
                    }
                    wr.write(stringBuilder.toString());
                    wr.flush();
                }
                wr.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
