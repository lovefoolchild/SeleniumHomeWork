package class03HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
    Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
    Enter valid username
    Leave password field empty
    Click on login button
    Verify error message with text “Password cannot be empty” is displayed.
 */
public class HW2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName = driver.findElement(By.cssSelector("input[name *= 'txtUsername']"));
        userName.sendKeys("Admin");
        WebElement loginBtn = driver.findElement(By.cssSelector("input[id *= 'btnLogin']"));
        loginBtn.click();
    }
}
