package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        String test = "D://";
        String test1 = "d://";
        String test2 = "s//D://";

        Pattern p = Pattern.compile("[a-zA-Z]\\+");
        Matcher m = p.matcher(test);
        Matcher m1 = p.matcher(test1);
        Matcher m2 = p.matcher(test2);
    }
}
