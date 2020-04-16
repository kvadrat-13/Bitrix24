package test;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AC02 extends TestBase {

Actions actions;

@BeforeMethod

public void setUp(){
    actions= new Actions(driver);
}

    @Test

    public void downLoadToWindows(){
        test=report.createTest("Bitrix24-US011-AC2");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        test.info("Opening the Login Page");
        WebElement username = driver.findElement(By.name("USER_LOGIN"));
        username.sendKeys("marketing11@cybertekschool.com");

        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");

        WebElement loginBttn = driver.findElement(By.className("login-btn"));
        loginBttn.click();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        WebElement DesktopClint = driver.findElement(By.xpath("//div[contains(text(),'Desktop client')]"));


        WebElement mac = driver.findElement(By.xpath("//span[contains(text(),'Mac OS')]"));
        test.info("Move to Windows element and downLoad");
        WebElement windows = driver.findElement(By.xpath("//span[contains(text(),'Windows')]"));
        actions.moveToElement(DesktopClint).pause(200).moveToElement(mac).pause(200).moveToElement(windows).click().build().perform();
        test.info("PASS:  Bitrix24-US011-AC2");
    }






}
