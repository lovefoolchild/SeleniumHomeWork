package class04HW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
    Go to http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
    Select: Tuesday, Thursday and Friday one by one
 */
public class HW1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchSite(url, browser);
        WebElement selectDayDropdown = driver.findElement(By.xpath("//select[@id='select-demo']"));
        selectDayDropdown.click();
        Thread.sleep(2000);
        Select select = new Select(selectDayDropdown);
        select.selectByValue("Tuesday");
        Thread.sleep(2000);
        select.selectByVisibleText("Thursday");
        Thread.sleep(2000);
        select.selectByIndex(6);
        Thread.sleep(2000);
    }
}
