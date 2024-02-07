package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {
    @When("user clicks on Add Employee option")
    public void user_clicks_on_add_employee_option() {
   // 2.WebElement addEmployeeButton=driver.findElement(By.xpath("//*[@id='menu_pim_addEmployee']"));
    click(dashBoardPage.addEmployeeOption);
    }
    @When("user enters firstName and middleName and lastName")
    public void user_enters_first_name_and_middle_name_and_last_name() {
    //2.WebElement firstNameLoc=driver.findElement(By.xpath("//*[@id='firstName']"));
        //2.WebElement middleNameLoc=driver.findElement(By.xpath("//*[@id='middleName']"));
    //2.WebElement lastNameLoc=driver.findElement(By.xpath("//*[@id='lastName']"));

    sendText("nasima", addEmployeePage.firstNameLoc);
    sendText("ms", addEmployeePage.middleNameLoc);
    sendText("arbaz", addEmployeePage.lastNameLoc);
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
    //2.WebElement saveButton=driver.findElement(By.xpath("//*[@id='btnSave']"));
    click(addEmployeePage.saveButton);
    }
    @Then("employee is added successfully")
    public void employee_is_added_successfully() {
    System.out.println("Employee is added successfully");
    }
    @When("user enters {string} {string} and {string}")
    public void user_enters_and(String firstName, String middleName, String lastName) {
        //2.WebElement firstNameLoc=driver.findElement(By.xpath("//*[@id='firstName']"));
       //2. WebElement middleNameLoc=driver.findElement(By.xpath("//*[@id='middleName']"));
        //2.WebElement lastNameLoc=driver.findElement(By.xpath("//*[@id='lastName']"));

        sendText(firstName, addEmployeePage.firstNameLoc);//sendText(CommonMethod)+firstName(feature file)+addEmployeePage.firstNameLoc(pageinitializer)
        sendText(middleName, addEmployeePage.middleNameLoc);
        sendText(lastName, addEmployeePage.lastNameLoc);
    }
    @When("user enters {string} and {string} and then {string}")
    public void user_enters_and_and_then(String firstName, String middleName, String lastName) {
        //2.WebElement firstNameLoc=driver.findElement(By.xpath("//*[@id='firstName']"));
        //2.WebElement middleNameLoc=driver.findElement(By.xpath("//*[@id='middleName']"));
        //2.WebElement lastNameLoc=driver.findElement(By.xpath("//*[@id='lastName']"));

        sendText(firstName, addEmployeePage.firstNameLoc);//sendText(CommonMethod)+firstName(feature file)+addEmployeePage.firstNameLoc(pageinitializer)
        sendText(middleName, addEmployeePage.middleNameLoc);
        sendText(lastName, addEmployeePage.lastNameLoc);
    }
    @When("user adds multiple employees from excel and verify the employee has added")
    public void user_adds_multiple_employees_from_excel_and_verify_the_employee_has_added() throws IOException {

       List<Map<String,String>>newEmployees=ExcelReader.read();
       for(Map<String, String> newEmployee:newEmployees) {
           sendText(newEmployee.get("firstName"), addEmployeePage.firstNameLoc);
           sendText(newEmployee.get("middleName"), addEmployeePage.middleNameLoc);
           sendText(newEmployee.get("lastName"), addEmployeePage.lastNameLoc);
           sendText(newEmployee.get("photograph"), addEmployeePage.photograph);
           if (!addEmployeePage.checkBox.isSelected()) {
               click(addEmployeePage.checkBox);
           }
           sendText(newEmployee.get("Username"), addEmployeePage.username);
           sendText(newEmployee.get("Password"), addEmployeePage.password);
           sendText(newEmployee.get("confirmPassword"), addEmployeePage.confirmPassword);
           click(addEmployeePage.saveButton);
           click(dashBoardPage.addEmployeeOption);
       }    }
    }





