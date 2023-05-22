package class02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /* HW  (only use XPATH)
        Navigate to fb.com
        Click on create new account
        Fill up all the text boxes
        Close the popup
        Close the browser
        Note : In order for your code to work you have to put Thread.sleep(2000) after clicking on Create new account.
        What is the reason, will discuss in next lecture
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Taco");
        driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Belle");
        driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("taco.belle@msn.com");
        driver.findElement(By.xpath("//input[@aria-label='Re-enter email']")).sendKeys("taco.belle@msn.com");
        driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("Woof!woof!@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@aria-label='Month']")).sendKeys("May");
        driver.findElement(By.xpath("//select[@aria-label='Day']")).sendKeys("1");
        driver.findElement(By.xpath("//select[@aria-label='Year']")).sendKeys("1988");
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
