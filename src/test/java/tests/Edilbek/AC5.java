package tests.Edilbek;

import base.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import java.util.concurrent.TimeUnit;

public class AC5 extends TestBase {
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

        testsPage.quoteText.click();

        /*
        In the TestsPage, I have located element,
        now I need to switch the frames in order to sendKeys();
        To switch frames you can use Index and WebElement (of the frame)
        Ex: driver.switchTo().frame(0);
         */
        driver.switchTo().frame(testsPage.iFrame);
        testsPage.inputQuoteText.sendKeys("“A person who never made a mistake never tried anything new.” – Albert Einstein");

        driver.switchTo().defaultContent();
        testsPage.submitBttn5.click();

    }
}
