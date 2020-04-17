package tests.Edilbek;

import base.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class AC7 extends TestBase {

    @Test
    public void test() throws InterruptedException {
        actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.getProperty("url"));

        // Here I have overloaded two methods in LoginPage class, in order to simplify the code.
        loginPage.login("helpdesk");

        wait.until(ExpectedConditions.titleContains("Portal"));

        wait.until(ExpectedConditions.elementToBeClickable(testsPage.moreBttn));
        testsPage.moreBttn.click();

        wait.until(ExpectedConditions.elementToBeClickable(testsPage.announcementBttn));
        testsPage.announcementBttn.click();

        testsPage.visualEditor.click();

        driver.switchTo().frame(0);

        // TODO: Need to find an answer, on jow to select the text using Selenium WebDriver

        testsPage.body.sendKeys("Hello, Cybertek People!!!");
        actions.doubleClick(testsPage.body).doubleClick().build().perform();
        Thread.sleep(5000);

    }
}
