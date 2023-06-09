package class08HW;

/*
Go to Syntax HRMS
Login
Click on Recruitment
Select a date on the calendar
 */

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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
        // Click on Recruitment
        WebElement recruitmentSection = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recruitmentSection.click();
        // Select a date on the calendar
        WebElement calendar = driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']"));
        calendar.click();
        // Select month: May
        WebElement monthDropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        monthDropdown.click();
        Select month = new Select(monthDropdown);
        month.selectByValue("4");
        // Select year: 2025
        WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        yearDropdown.click();
        Select year = new Select(yearDropdown);
        year.selectByValue("2025");
        // Select date: 15
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement date : allDates) {
            String currentDate = date.getText();
            if (currentDate.equals("15")) {
                date.click();
                break;
            }
        }
    }
}
