package g_regex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/textfiles/materialy.txt");
        // wczytaj wszystkie linie z pliku do listy stringów
        List<String> read = Files.readAllLines(path);

        // napisz regexa dla kwot
        Pattern pattern = Pattern.compile("\\d\\p{all}*\\.");
        // dla każdej linijki w liście linii z pliku
        for (String line : read) {
            // znajdz dopasowanie
            Matcher m = pattern.matcher(line);
            // jeżeli znalazłeś to je wydrukuj
            if (m.find()) {
                System.out.println(m.group());
            }
        }

        // napisz regexa dla kwot
        Pattern patternCountry = Pattern.compile("w\\s[A-Z]+[a-z]*");
        // dla każdej linijki w liście linii z pliku
        for (String line : read) {
            // znajdz dopasowanie
            Matcher m = patternCountry.matcher(line);
            // jeżeli znalazłeś to je wydrukuj
            if (m.find()) {
                System.out.println(m.group());
            }
        }

        // napisz regexa dla przedmiotów
        Pattern itemPattern = Pattern.compile("\\p{all}+\\sw\\s");
        // dla każdej linijki w liście linii z pliku
        for (String line : read) {
            // znajdz dopasowanie
            Matcher m = itemPattern.matcher(line);
            // jeżeli znalazłeś to je wydrukuj
            if (m.find()) {
                String result = m.group();
                result = result.replace(" w ", "");
                System.out.println(result);
            }
        }


        System.out.println(read);
    }
}
