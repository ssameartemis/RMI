package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigurationReader;
import utils.Driver;
import utils.Pages;


public class LoginPage {
    Pages pages = new Pages();

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Sign in")
    public WebElement signInBtn;

    @FindBy(linkText = "Remitter1")
    public WebElement demo;

    @FindBy(id = "login")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "(//button)[2]")
    public WebElement loginBttn;


//    public void signIn() {
//
//        signInBtn.click();
//        email.sendKeys(ConfigurationReader.getProperty("username"));
//        password.sendKeys(ConfigurationReader.getProperty("password"));
//        loginBttn.click();
//
//    }

}
