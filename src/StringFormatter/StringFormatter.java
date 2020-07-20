package StringFormatter;

import java.util.Formatter;

public class StringFormatter {

    public static void main(String[] args) {
        System.out.println(stringFormatter("abde", "NOPQRSTUVWXYZ123456789abcdefgh"));
    }


    private static String stringFormatter(String exampleString, String toFormat) {
        String result = "";
        int length = exampleString.length();
        for(int i  = 0; i < toFormat.length() ;i++) {
            if(i%length == 0) {
                result += "\n";
            }
            result += toFormat.charAt(i);
        }
        return result;
    }

    private void StringFormatter() {
        String format = "%44s \n";
        String result = "";
        String longText = "!C!abcdefghijkalmnopqrstuvwxyz123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789abcdefghijklmnopqrstuvwxyz123456789ABCDEFGHIJKLMNOPQRSTUVXYZ";
        for(int i = 0 ; i< longText.length(); i++) {
            if((i>0) && ((i%22)==0)) {
                result += "\n!C!";
            }
            result += longText.charAt(i);
        }
        System.out.println(result);
    }
}
