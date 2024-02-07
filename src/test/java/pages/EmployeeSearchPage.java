package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeSearchPage extends CommonMethods {
    @FindBy(xpath="//input[@id='empsearch_id']")
    public WebElement empIdLoc;

    @FindBy(xpath="//input[@id='empsearch_employee_name_empName']")
    public WebElement empNameLoc;


    @FindBy(xpath="//*[@id='searchBtn']")
    public WebElement searchOption;

    public EmployeeSearchPage(){
        PageFactory.initElements(driver, this);
    }
}
