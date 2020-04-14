package tests.Edilbek;

import base.TestBase;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import java.util.concurrent.TimeUnit;

public class AC3 extends TestBase {

    /**
     * 3. User should be able to attach link by clicking on the link icon.
     */

    @Test
    public void test() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.getProperty("url"));

        // Here I have overloaded two methods in LoginPage class, in order to simplify the code.
        loginPage.login("helpdesk");

        wait.until(ExpectedConditions.titleContains("Portal"));

        wait.until(ExpectedConditions.elementToBeClickable(testsPage.moreBttn));
        testsPage.moreBttn.click();

        wait.until(ExpectedConditions.elementToBeClickable(testsPage.announcementBttn));
        testsPage.announcementBttn.click();

        wait.until(ExpectedConditions.elementToBeClickable(testsPage.linkBttn));
        testsPage.linkBttn.click();

        // In same cases, it fails here because it cannot open download page. I used IMPLICIT AND EXPLICIT waits.
        // Thread sleep can be a solution, too.
        wait.until(ExpectedConditions.textToBePresentInElement(testsPage.linkText, "Link"));
        softAssert.assertEquals(testsPage.linkText.getText(), "Link", "Link text, did not match. Failed");

        testsPage.inputBoxLinkText.sendKeys("Apply to Cybertek! Join our Big Family! ''Batch 15'' <3");
        testsPage.inputBoxLinkUrl.sendKeys("https://cybertekschool.com/apply-now/");
        testsPage.submitBttn.click();

        wait.until(ExpectedConditions.elementToBeClickable(testsPage.sendBttn));
        testsPage.sendBttn.click();


    }
}
