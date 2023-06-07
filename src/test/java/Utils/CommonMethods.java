package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static void sendText(String text, WebElement element) {
        element.clear();
        element.sendKeys(text);
    }
    public static void selectDropDown1(String value, WebElement dropdown) {
        Select choose = new Select(dropdown);
        choose.selectByValue(value);
    }

    public static void selectDropDown2(String visibleText, WebElement dropdown) {
        Select choose = new Select(dropdown);
        choose.selectByVisibleText(visibleText);
    }

    public static void selectDropDown3(Integer index, WebElement dropdown) {
        Select choose = new Select(dropdown);
        choose.selectByIndex(index);
    }
}
