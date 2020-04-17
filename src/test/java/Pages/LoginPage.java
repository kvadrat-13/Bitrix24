package Pages;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
  public LoginPage(){
    PageFactory.initElements(Driver.getDriver(),this);
  }
  @FindBy(name = "USER_LOGIN")
  public WebElement username;
  @FindBy(name = "USER_PASSWORD")
  public WebElement password;
  @FindBy(className = "login-btn")
  public WebElement submit;
  @FindBy(className = "errortext")
  public WebElement error;

  // login2.nextbasecrm.com
  // helpdesk11@cybertekschool.com
  // helpdesk12@cybertekschool.com


  public void login(String user) {
    String username;
    String password;
    switch (user) {
      case "helpdesk":
        username = ConfigurationReader.getProperty("helpdesk_username");
        password = ConfigurationReader.getProperty("password");
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        submit.click();
        break;
      case "marketing":
        username = ConfigurationReader.getProperty("marketing_username");
        password = ConfigurationReader.getProperty("password");
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        submit.click();
        break;
      case "hr":
        username = ConfigurationReader.getProperty("hr_username");
        password = ConfigurationReader.getProperty("password");
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        submit.click();
        break;
      default:
        System.out.println(error.getText());
    }
  }
}