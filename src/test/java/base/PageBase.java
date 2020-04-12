package base;

import Utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {
    public PageBase(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
}
