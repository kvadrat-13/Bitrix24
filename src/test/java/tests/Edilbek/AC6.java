package tests.Edilbek;

import base.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import java.util.concurrent.TimeUnit;

public class AC6 extends TestBase {

    @Test
    public void test() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.getProperty("url"));

        // Here I have overloaded two methods in LoginPage class, in order to simplify the code.
        loginPage.login("helpdesk");

        wait.until(ExpectedConditions.titleContains("Portal"));

        wait.until(ExpectedConditions.elementToBeClickable(testsPage.moreBttn));
        testsPage.moreBttn.click();

        wait.until(ExpectedConditions.elementToBeClickable(testsPage.announcementBttn));
        testsPage.announcementBttn.click();

        testsPage.addMention.click();
        testsPage.contact11.click();

        testsPage.addMention.click();
        testsPage.contact77.click();

        testsPage.submitBttn6.click();



    }
}
