package POM;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
            PageFactory.initElements(Driver.getDriver(), this);


        }

        @FindBy(xpath = "USER_LOGIN")
    public WebElement username;

     @FindBy (xpath = "USER_PASSWORD")

    public WebElement password;

     @FindBy(xpath = "login-btn")
     public WebElement login;

    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        login.click();
    }
}