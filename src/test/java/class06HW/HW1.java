package class06HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
Go to  http://practice.syntaxtechs.net/dynamic-elements-loading.php
Click on start
Print the text  "welcome syntax technologies" on the console
 */
public class HW1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser = "chrome";
        openBrowserAndLaunchSite(url, browser);

        // Click on start
        WebElement startBtn = driver.findElement(By.xpath("//button[@id='startButton']"));
        startBtn.click();


        // Print the text
        WebElement messageElement = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElement(messageElement, "Welcome Syntax Technologies"));
        System.out.println("The text after clicking start button is: "+ messageElement.getText());
        driver.close();
    }
}
