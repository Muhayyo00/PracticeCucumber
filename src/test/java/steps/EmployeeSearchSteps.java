package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonMethods;

import java.time.Duration;

public class EmployeeSearchSteps extends CommonMethods {

    //public WebDriver driver;
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        //2.WebElement pimOption=driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        click(dashBoardPage.pimOption);
       //1. driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
       //1. driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @When("user clicks on employee list option")
    public void user_clicks_on_emloyee_list_option() {
       //2. WebElement empListOption= driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']"));
        click(dashBoardPage.empListOption);
        //1.driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();
        //1.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {
        //2.WebElement empIdLoc=driver.findElement(By.xpath("//input[@id='empsearch_id']"));
        sendText("56968A", employeeSearchPage.empIdLoc);
        //1.driver.findElement(By.xpath("//input[@id='empsearch_id']")).sendKeys("56968A");
        //1.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
       //2. WebElement searchOption=driver.findElement(By.xpath("//input[@id='searchBtn']"));
        click(employeeSearchPage.searchOption);
       //1.driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
        }

    @Then("user should be able to see employee details")
    public void user_should_be_able_to_see_employee_details() {
        System.out.println("Employee details can be seen clearly");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @When("user enters valid employee name")
    public void user_enters_valid_employee_name() {
       //2. WebElement empNameLoc= driver.findElement(By.xpath("//*[@id='empsearch_employee_name_empName']"));
        sendText("abel",employeeSearchPage.empNameLoc);
        //1.driver.findElement(By.xpath("//*[@id='empsearch_employee_name_empName']")).sendKeys("asal");


}}
