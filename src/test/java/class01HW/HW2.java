package class01HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

    /* Navigate to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
        Enter the username "Tester"
        Enter the password "test"
        Get the title of the webPage and confirm that it is  "Web Orders Login"
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        Thread.sleep(2000);
        String title = driver.getTitle();
        if (title.equals("Web Orders Login")){
            System.out.println("Title of webpage is: "+title);
        } else {
            System.out.println("Incorrect webpage title");
        }
    }
}
