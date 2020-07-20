package csv;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CSV {

    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new FileReader(new File("info.csv")))) {
            BufferedWriter wr = new BufferedWriter(new FileWriter(new File("output.csv")));
            String line;
            List<Integer> result = new ArrayList<>();
            while( (line = br.readLine()) != null) {
                String[] lines = line.split(",");
                lines[0] = lines[0].replace("\ufeff","");
                result.add(Integer.parseInt(lines[0]));
            }
            Collections.sort(result);
            StringBuilder b = new StringBuilder();
            for(int i : result) {
                b.append(i).append("\n");
            }
            wr.write(b.toString());
            wr.flush();
            wr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
