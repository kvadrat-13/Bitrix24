package base;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import com.sun.tools.internal.jxc.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  abstract class TestPage {
    public TestPage(){
        PageFactory.initElements(Driver.getDriver(), this); }
}
