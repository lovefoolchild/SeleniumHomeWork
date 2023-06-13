package class09HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class HW1 extends CommonMethods {
    public static void main(String[] args) throws IOException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchSite(url, browser);

        // Press the login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        // JSExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", loginBtn);

        // Take the screenshot
        takeScreenshot("Test Screenshot 1");
    }
}
