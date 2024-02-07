package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {
    @FindBy(id="txtUsername")
   public WebElement usernameField;

    @FindBy(id="txtPassword")//using id
    public WebElement passwordField;

    @FindBy(xpath="//*[@id='btnLogin']")//using xpath
    public WebElement loginButton;

    @FindBy(id="spanMessage")
    public WebElement errorMessageLoc;

    public LoginPage(){
        PageFactory.initElements(driver,this);

    }
}
