package tests.Edilbek;

import base.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import java.util.concurrent.TimeUnit;

public class AC4 extends TestBase {

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

        wait.until(ExpectedConditions.elementToBeClickable(testsPage.insertVideo));
        testsPage.insertVideo.click();

        wait.until(ExpectedConditions.elementToBeClickable(testsPage.inputVideoBox));
        testsPage.inputVideoBox.click();


        /**
         * Need to find out with Marufjon. When I perform manual testing, providing URL it finds.
         * But when I automate, the video can not be found. Bitrix is showing error:
         *  - [SOCKET] Socket connection error.;
         *  - [FVID404] The video was not found;
         */
        testsPage.inputVideoBox.sendKeys("https://www.youtube.com/watch?v=fvCdLmxnkj0");

        wait.until(ExpectedConditions.visibilityOf(testsPage.videoTitle));


        Thread.sleep(4000);


    }
}
