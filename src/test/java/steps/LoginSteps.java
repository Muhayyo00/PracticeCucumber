package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

import java.io.IOException;
import java.time.Duration;

public class LoginSteps extends CommonMethods {
    //public WebDriver driver;
    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() {
        openBrowserAndLaunchApplication();
        //1.driver=new ChromeDriver();
        //1.driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //1.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @When("user enters admin username and password")
    public void user_enters_admin_username_and_password() {
        LoginPage login=new LoginPage();
       //2.WebElement usernameField=driver.findElement(By.xpath("//*[@id='txtUsername']"));
       //2.WebElement passwordField=driver.findElement(By.xpath("//*[@id='txtPassword']"));
        sendText(ConfigReader.read("userName"),login.usernameField);
        sendText(ConfigReader.read("password"), login.passwordField);
       //1. driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
       //1. driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
       //1. driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        LoginPage login=new LoginPage();
        //2.WebElement loginButton=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        click(login.loginButton);
       //1.driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
    }
    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        WebElement welcomeMessage=driver.findElement(By.id("welcome"));
        Assert.assertTrue(dashBoardPage.welcomeMessageOption.isDisplayed());//if the element is available it will return true
       //no need to provide if else statement here, assert reduces code
        System.out.println("My test has passed successfully!");
    }
    @When("user enters {string} and {string} and verify the {string}")
       public void user_enters_and_and_verify_the
            (String usernameValue, String passwordValue, String errorMessage) {
         // 2.WebElement usernameField=driver.findElement(By.xpath("//*[@id='txtUsername']"));
        //2.WebElement passwordField=driver.findElement(By.xpath("//*[@id='txtPassword']"));
       // 2.WebElement loginButton=driver.findElement(By.xpath("//*[@id='btnLogin']"));

        LoginPage login=new LoginPage();
        sendText(usernameValue, login.usernameField);
        sendText(passwordValue,login. passwordField);
        click(login.loginButton);

        //2.WebElement errorLoc=driver.findElement(By.xpath("//*[@id='spanMessage']"));
        String errorMessageValue=login.errorMessageLoc.getText();//errorMessageValue is taken from an application
        //2.System.out.println(errorMessageValue);
        Assert.assertEquals(errorMessage,errorMessageValue);//errorMessage from login.feature file



    }

}
