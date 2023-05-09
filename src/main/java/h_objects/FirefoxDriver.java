package h_objects;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Jestem firefoxem. Wchodze na stronę");
    }

    @Override
    public void close() {
        System.out.println("Jestem firefoxem. Zamykam przeglądarkę");
    }
}
