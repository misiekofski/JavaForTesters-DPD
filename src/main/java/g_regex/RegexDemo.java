package g_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d{3}");
        String searchFor = "Find me three number 333 sequences 10";
        Matcher m = p.matcher(searchFor);

        System.out.println("Text searching: " + searchFor);
        System.out.println("Pattern: " + p);

        while (m.find()) {
            System.out.println("Found match: " + m.group());
        }
    }
}
