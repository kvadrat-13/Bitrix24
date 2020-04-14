package tests.Edilbek;

import base.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import static org.testng.Assert.*;

public class AC1 extends TestBase {

    /**
     * 1. User should be able to click on upload files icon
     * to upload files and pictures from local disks,
     * download from external drive,
     * select documents from bixtrix24,
     * and create files to upload.
     */
    @Test
    public void test() throws InterruptedException {
        driver.get(ConfigurationReader.getProperty("url"));

        // Here I have overloaded two methods in LoginPage class, in order to simplify the code.
        loginPage.login("helpdesk");

        wait.until(ExpectedConditions.titleContains("Portal"));

        wait.until(ExpectedConditions.elementToBeClickable(testsPage.moreBttn));
        testsPage.moreBttn.click();

        wait.until(ExpectedConditions.elementToBeClickable(testsPage.announcementBttn));
        testsPage.announcementBttn.click();

        wait.until(ExpectedConditions.elementToBeClickable(testsPage.uploadIcon));
        testsPage.uploadIcon.click();

//        In this line I can upload a file from my Computer to Application, but I didnt get clear idea of AC1
//        testsPage.uploadFilesAndImages.sendKeys("/Users/EdilbekBrowne/Desktop/screenJava/Screen Shot 2020-04-05 at 12.40.57.png");

//        In this part I am checking whether user have these 4 option to upload a file
        assertTrue(testsPage.uploadFilesAndImages.isEnabled());
        assertEquals(testsPage.externalDrive.getText(), "Download from external drive");
        assertEquals(testsPage.selectDocument.getText(), "Select document from Bitrix24");
        assertEquals(testsPage.createDesktop.getText(), "Create using Desktop applications");


    }

}
