package h_objects;

public class ChromeDriver implements WebDriver {

    @Override
    public void get() {
        System.out.println("Jestem chromem. Wchodze na stronę");
    }

    @Override
    public void close() {
        System.out.println("Jestem chromem. Zamykam przeglądarkę");
    }
}
