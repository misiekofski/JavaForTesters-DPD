package d_data_structures;

public class DriverFactory
{
    String driver = null;

    public static void main(String[] args) {
        String browserToRunTests = getDriver(BrowserType.Edge);
        System.out.println("Running test in: " + browserToRunTests);
    }

    public static String getDriver(BrowserType browserType)
    {
        switch (browserType)
        {
            case Chrome:
                return "Chrome";
            case Edge:
                return "Edge";
            case Firefox:
                return "Firefox";
            case Opera:
                return "Opera";
            default:
                return "Wrong browser";
        }
    }
}