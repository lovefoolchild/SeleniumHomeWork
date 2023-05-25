package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CommonMethods {
    public static WebDriver driver;
    public static void openBrowserAndLaunchSite(String url, String browser) {
        switch (browser) {
            case "chrome":
                driver=new ChromeDriver();
                break;

            case "firefox":
                driver=new FirefoxDriver();
                break;

            case  "safari":
                driver=new SafariDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.get(url);
    }
}
