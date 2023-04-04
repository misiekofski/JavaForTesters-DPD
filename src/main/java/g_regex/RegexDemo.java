package g_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d{3}");
        String searchFor = "Find me three 333 number sequences 123 10";
        Matcher m = p.matcher(searchFor);

        while (m.find()) {
            System.out.println("Found match: " + m.group());
        }
    }
}
