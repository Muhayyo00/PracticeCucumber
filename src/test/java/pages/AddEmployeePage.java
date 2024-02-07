package pages;

import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {
    @FindBy(id="firstName")
    public WebElement firstNameLoc;
    @FindBy(id="middleName")
    public WebElement middleNameLoc;
    @FindBy(id="lastName")
    public WebElement lastNameLoc;
    @FindBy(id="btnSave")
    public WebElement saveButton;

    @FindBy(id="photofile")
    public WebElement photograph;

    @FindBy(id="user_name")
    public WebElement username;

    @FindBy(id="user_password")
    public WebElement password;

    @FindBy(id="re_password")
    public WebElement confirmPassword;

    @FindBy(id="chkLohin")
    public WebElement checkBox;

public AddEmployeePage(){
    PageFactory.initElements(driver, this);
}
}
