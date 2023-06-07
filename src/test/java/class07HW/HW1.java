package class07HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/*
Go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
Login
Click on PIM
From the table choose any ID and print out the row number of that id
Please make sure that ur code is dynamic enough to cater if another row gets deleted, it still prints the row correctly
 */
public class HW1 extends CommonMethods {
    public static void main(String[] args) {
        // Go to website
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser =  "chrome";
        openBrowserAndLaunchSite(url, browser);
        // Login
        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
        // Click on PIM
        WebElement pimButton = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimButton.click();
        // Choose an ID: 53710A and print the row number of the chosen ID
        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        for (int i = 0; i < allIDs.size(); i++) {
            String id = allIDs.get(i).getText();
            if (id.equals("53710A")){
                System.out.println("ID: 53710A is in row "+(i+1)+".");
            }
        }
    }
}
