package h_objects;

public class TestBrowser {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get();
        driver.close();
    }
}
