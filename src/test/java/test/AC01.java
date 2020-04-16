package test;


import Utilities.ConfigurationReader;
import Utilities.WebDriverFactory;
import base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AC01 extends TestBase  {

    Actions actions ;
      /*
       //US:  11. As a PC user, I should be able to download Desktop version of the application.

    //AC: 1. User should be able to click on Mac Os icon under Desktop Client to downLoad Mac version of Bitrix.

          1. Navigate to the Browser
          2. open the browser
          3.locate the username and password
          4. login as marketing11@cybertekschool.com
          5. for the  password  "UserUser"
          6.Navigate to Desktop clint and click on it , then click mac element

*/

    @BeforeMethod
    public void setUp(){
        actions = new Actions(driver);

    }

    @Test
    public void test1() throws InterruptedException {
        test=report.createTest("Bitrix24-US011-AC1");
       // WebDriver driver = WebDriverFactory.getDriver("chrome");
        test.info("Opening the Login Page");
        driver.get("https://login2.nextbasecrm.com/");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.name("USER_LOGIN"));
        username.sendKeys("marketing11@cybertekschool.com");
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");

        WebElement login = driver.findElement(By.className("login-btn"));
        login.click();


        driver.manage().window().maximize();
        WebElement DeskTopClint = driver.findElement(By.xpath("//div[contains(text(),'Desktop client')]"));
        test.info("Move to Mac element and downLoad");
        WebElement mac = driver.findElement(By.xpath("//span[contains(text(),'Mac OS')]"));
        Thread.sleep(5000);
        actions.moveToElement(DeskTopClint).pause(2000).moveToElement(mac).click().build().perform();



        test.info("PASS:  Bitrix24-US011-AC1");



    }
}
