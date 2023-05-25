package class04HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
    Go to facebook.com
    Click on create account and select your date of birth using select class.
 */
public class HW2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="https://facebook.com";
        String browser="chrome";
        openBrowserAndLaunchSite(url, browser);
        WebElement createNewAcct = driver.findElement(By.xpath("//a[contains(@data-testid, 'open')]"));
        createNewAcct.click();
        Thread.sleep(2000);
        WebElement dropDownMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select selectMonth = new Select(dropDownMonth);
        selectMonth.selectByVisibleText("Jan");
        Thread.sleep(2000);
        WebElement dropDownDay = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select selectDay = new Select(dropDownDay);
        selectDay.selectByValue("1");
        Thread.sleep(2000);
        WebElement dropDownYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select selectYear = new Select(dropDownYear);
        selectYear.selectByIndex(5);
        Thread.sleep(2000);
    }
}
