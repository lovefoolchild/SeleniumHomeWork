package class01HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

    /* Navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        Fill out the form
        Close the browser
        Note: use name or id as locators
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("John");
        driver.findElement(By.id("customer.lastName")).sendKeys("Doe");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Example St");
        driver.findElement(By.id("customer.address.city")).sendKeys("Palm Beach");
        driver.findElement(By.id("customer.address.state")).sendKeys("Florida");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("35642");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("212-432-0155");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-4567-890");
        driver.findElement(By.id("customer.username")).sendKeys("doejohn@alphabet.com");
        driver.findElement(By.name("customer.password")).sendKeys("987@654!321$");
        driver.findElement(By.name("repeatedPassword")).sendKeys("987@654!321$");
        Thread.sleep(5000);
        driver.close();
    }
}
