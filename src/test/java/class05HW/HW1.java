package class05HW;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchSite(url, browser);

        // Click on the last alert button and send something
        WebElement alert3Btn = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3Btn.click();
        Alert confirmationAlert3 = driver.switchTo().alert();
        Thread.sleep(2000);
        confirmationAlert3.sendKeys("Lovely");
        Thread.sleep(2000);
        confirmationAlert3.accept();
    }
}
