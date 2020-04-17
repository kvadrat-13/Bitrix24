package Abu_Tests;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import base.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*
  As a user, I should be able to send messages by clicking on Message tab under Active Stream.
   */
public class AC1 extends TestBase {

  @Test(description = "Login in, click on message then click upload files")
  public void test1(){
    test = report.createTest("Bitrix Message Upload Files Feature");
   driver.get(ConfigurationReader.getProperty("url"));

    test.info("Login as HelpDesk");
   loginPage.login("helpdesk");

   //waiting for page to load
   wait.until(ExpectedConditions.titleIs(Driver.getDriver().getTitle()));
   test.info("clicking in message icon");
   testPage.msgButton.click();
   //try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}

    wait.until(ExpectedConditions.elementToBeClickable(testPage.uploadFileIcon));
    test.info("Clicking Upload File Icon");
    testPage.uploadFileIcon.click();


    wait.until(ExpectedConditions.elementToBeClickable(testPage.dragAndDrop));
    test.info("Verifying upload file & picture enabled");
    Assert.assertTrue(testPage.dragAndDrop.isEnabled());

    wait.until(ExpectedConditions.elementToBeClickable(testPage.docBitx));
    test.info("Verify if document text equal to expected text");
    Assert.assertEquals(testPage.docBitx.getText(),"Select document from Bitrix24");
    test.info("Verify document element enabled");
    Assert.assertTrue(testPage.docBitx.isEnabled());


    wait.until(ExpectedConditions.elementToBeClickable(testPage.externalDrive));
    test.info("Verify if element text equal to expected text");
    Assert.assertEquals(testPage.externalDrive.getText(),"Download from external drive");
    test.info("Verify externalDriver element enabled");
    Assert.assertTrue(testPage.externalDrive.isEnabled());

    wait.until(ExpectedConditions.elementToBeClickable(testPage.createDeskApp));
    test.info("Verify if element text equal to expected text");
    Assert.assertEquals(testPage.createDeskApp.getText(),"Create using Office 365");
    test.info("Verify CreateDeskApp element enabled");
    Assert.assertTrue(testPage.createDeskApp.isEnabled());
    test.pass("Upload File Verified");

  }
}
