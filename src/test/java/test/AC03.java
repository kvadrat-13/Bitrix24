package test;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AC03 extends TestBase {

    Actions actions ;

    @BeforeMethod
    public void setUp(){
        actions=new Actions(driver);
    }
    @Test

    public void downLoadToWindows() throws InterruptedException {
        test=report.createTest("Bitrix24-US011-AC3");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        test.info("Opening the Login Page");
        WebElement username = driver.findElement(By.name("USER_LOGIN"));
        username.sendKeys("marketing11@cybertekschool.com");

        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");

        WebElement loginBttn = driver.findElement(By.className("login-btn"));
        loginBttn.click();

        WebElement DesktopClint = driver.findElement(By.xpath("//div[contains(text(),'Desktop client')]"));

         DesktopClint.click();


         WebElement mac = driver.findElement(By.xpath("//span[contains(text(),'Mac OS')]"));
         WebElement windows = driver.findElement(By.xpath("//span[contains(text(),'Windows')]"));
         driver.manage().window().maximize();
        test.info("Move to Linux element and downLoad");
         WebElement linux = driver.findElement(By.xpath("//span[contains(text(),'Linux')]"));
        test.info("PASS:  Bitrix24-US011-AC3");
         actions.moveToElement(DesktopClint).pause(200).moveToElement(mac).pause(200).moveToElement(windows).
                 pause(2000).moveToElement(linux).click().build().perform();


    }
}