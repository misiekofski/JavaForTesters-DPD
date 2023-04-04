package g_regex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileDemo {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/textfiles/items.txt");

        List<String> fileLines = new ArrayList<>();

        try {
            fileLines.addAll(Files.readAllLines(path));
        } catch (IOException e) {
            System.out.println("File not found.");
        }

        Pattern patter = Pattern.compile(" [A-Z]\\w+");
        for (String line : fileLines) {
            // pattern matcher
            Matcher m = patter.matcher(line);
            while (m.find()) {
                if (!m.group().equals(" PLN")) {
                    System.out.println("Country found:" + m.group().strip());
                }
            }
        }

        Pattern amounts = Pattern.compile("[1-9][0-9,.]+");
        for (String line : fileLines) {
            // pattern matcher
            Matcher m = amounts.matcher(line);
            while (m.find()) {
                System.out.println("Amount found:" + m.group().strip());
            }
        }

        Pattern items = Pattern.compile("^[A-Z][a-z]* [a-z]* ");
        for (String line : fileLines) {
            // pattern matcher
            Matcher m = items.matcher(line);
            while (m.find()) {
                System.out.println("Item found:" + m.group().strip());
            }
        }
    }
}
