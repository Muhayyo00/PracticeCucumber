package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
    @When("the user enters admin username and password")
    public void the_user_enters_admin_username_and_password() {
        WebElement usernameField=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        WebElement passwordField=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        sendText(ConfigReader.read("userName"),usernameField);
        sendText(ConfigReader.read("password"), passwordField);
       //1. driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
       //1. driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
       //1. driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        WebElement loginButton=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        click(loginButton);
       //1.driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
    }
    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
       System.out.println("My code has passed successfully!");
    }

}
