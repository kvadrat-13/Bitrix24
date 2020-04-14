package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestsPage {
    public TestsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /*
         I have created this TestsPage class, to store all elements for all Acceptance Criteria's,
         under my User Story.

         To be more clear, I will separate each AC by commenting them, or providing with information to it.
    */


    /**
     * Below I will locate all elements for AC #1
     */

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreBttn;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[3]")
    public WebElement announcementBttn;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadIcon;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadFilesAndImages;

    @FindBy(xpath = "(//span[contains(text(),'Download from external drive')])[1]")
    public WebElement externalDrive;

    @FindBy(xpath = "(//span[contains(text(),'Select document')])[1]")
    public WebElement selectDocument;

    @FindBy(xpath = "(//span[contains(text(),'Create')])[1]")
    public WebElement createDesktop;


    /**
     * Below I will locate all elements for AC #2
     */

    @FindBy(xpath = "//a[@id='bx-destination-tag']")
    public WebElement addMore;

    @FindBy(xpath = "//a[@href='#switchTab'][contains(text(),'Recent')]")
    public WebElement recent;

    @FindBy(xpath = "//a[@href='#switchTab'][contains(text(),'Employees and departments')]")
    public WebElement employeesAndDept;

    @FindBy(xpath = "//a[@href='#switchTab'][contains(text(),'E-mail users')]")
    public WebElement emailUser;

    // Locating Cyber Vet text, to verify that under this section there are contacts listed
    @FindBy(xpath = "//div[@class='bx-finder-company-department-text'][contains(text(),'Cyber Vet')]")
    public WebElement cyberVetText;

    // Locating "People" and "All employees" text, to verify that I am on the right page
    @FindBy(xpath = "//span[contains(text(),'People')]")
    public WebElement peopleText;

    @FindBy(xpath = "//div[@class='bx-finder-box-item-t7-name'][contains(text(),'All employees')]")
    public WebElement allEmployees;


    /**
     * Below, I will locate all elements for AC #3
     */

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']/i")
    public WebElement linkBttn;

    // Locating "Link" text, to verify that I am on the right page
    @FindBy(xpath = "//span[@class='bx-core-adm-dialog-head-inner'][.='Link']")
    public WebElement linkText;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement inputBoxLinkText;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement inputBoxLinkUrl;

    @FindBy(id = "undefined")
    public WebElement submitBttn;

    /*
    // // Locating "Apply to Cybertek! " link, to verify that link is presented when hover over on text
    @FindBy(xpath = "//a[contains(text(),'Cybertek')]")
    public WebElement applyCybertek;
     */  // I DON'T KNOW, why it couldn't locate my text that I have typed?  NOT IMPORTANT!

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendBttn;


    /**
     * Below, I will locate all elements for AC #4
     */


}
