package tests.Edilbek;

import base.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AC2 extends TestBase {

    /**
     * 2. User should be able to add users and recipients from selecting contact from:
     * E-mail user,
     * Employees and Departments
     * and Recent contact lists.
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

        wait.until(ExpectedConditions.elementToBeClickable(testsPage.addMore));
        testsPage.addMore.click();

        wait.until(ExpectedConditions.elementToBeClickable(testsPage.emailUser));
        testsPage.emailUser.click();

        Thread.sleep(2000);

        wait.until(ExpectedConditions.elementToBeClickable(testsPage.employeesAndDept));
        testsPage.employeesAndDept.click();

        assertTrue(testsPage.cyberVetText.getText().contains("Cyber"));

        //TODO -> I need to specify, do I need to add the contacts
        // in the input box or should I verify that they are listed???

        assertEquals(testsPage.cyberVetText.getText(), "Cyber Vet");

        Thread.sleep(2000);

        wait.until(ExpectedConditions.elementToBeClickable(testsPage.recent));
        testsPage.recent.click();

        wait.until(ExpectedConditions.textToBePresentInElement(testsPage.peopleText, "People"));
        assertTrue(testsPage.peopleText.getText().contains("People"));
        assertTrue(testsPage.allEmployees.isDisplayed());



    }
}
