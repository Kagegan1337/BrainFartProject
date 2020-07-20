package userlogs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegParser {

    private Pattern amount = Pattern.compile("[\\d]");

    public Article parse(String line) {
        Matcher m = amount.matcher(line);
        boolean i = m.find();
        int amount = Integer.parseInt(m.group());
        String desc = line.substring(line.indexOf("]["));
        return new Article(amount,desc);
    }
}
