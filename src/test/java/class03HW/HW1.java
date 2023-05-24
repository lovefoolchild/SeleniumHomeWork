package class03HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/* Use CSS and Xpath to do this:
    Open Chrome browser
    Go to “http://practice.syntaxtechs.net/input-form-demo.php”
    Fill in the complete form
 */
public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
        firstName.sendKeys("Lovely");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='last_name']"));
        lastName.sendKeys("Henson");
        WebElement email = driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']"));
        email.sendKeys("lovefool@protonmail.com");
        WebElement phoneNum = driver.findElement(By.xpath("//input[@data-bv-field='phone']"));
        phoneNum.sendKeys("432-932-4328");
        WebElement address = driver.findElement(By.xpath("//input[@data-bv-field='address']"));
        address.sendKeys("123 Example Street");
        WebElement city = driver.findElement(By.xpath("//input[@data-bv-field='city']"));
        city.sendKeys("Wonderland");
        WebElement state = driver.findElement(By.xpath("//select[@class='form-control selectpicker']"));
        Thread.sleep(1000);
        Select stateDropDown = new Select(state);
        stateDropDown.selectByVisibleText("Florida");
        Thread.sleep(1000);
        WebElement zipCode = driver.findElement(By.cssSelector("input[placeholder *= 'Zip Code']"));
        zipCode.sendKeys("11101");
        WebElement websiteOrDomain = driver.findElement(By.cssSelector("input[placeholder *= 'Website or']"));
        websiteOrDomain.sendKeys("lovelybakes.com");
        WebElement withHosting = driver.findElement(By.xpath(" //input[@value='yes']"));
        withHosting.click();
        WebElement projDesc = driver.findElement(By.cssSelector("textarea[placeholder *= 'Project']"));
        projDesc.sendKeys("Hobby baker");
        WebElement send = driver.findElement(By.cssSelector("button[class *= 'btn btn']"));
        send.click();
        Thread.sleep(1000);
    }
}
