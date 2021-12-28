package com.StepDefinition;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import com.pages.LoginPage;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class LoginPageStepDef {
 
    WebDriver driver;
    LoginPage lp;
 
    @Given("User is on Login Page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
 
    @When("User enters username")
    public void user_enters_username() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    }
 
    @When("User enters password")
    public void user_enters_password() {
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    }
 
    @When("User enters username as {string}")
    public void user_enters_username_as(String uname) {
        driver.findElement(By.id("txtUsername")).sendKeys(uname);
    }
 
    @When("User enters password as {string}")
    public void user_enters_password_as(String pass) {
        driver.findElement(By.id("txtPassword")).sendKeys(pass);
    }
 
    @When("^User enters (.+) and (.+)$")
    public void user_enters_and(String username, String password) throws Throwable {
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
    }
 
    @When("User clicks on Login Button")
    public void user_clicks_on_login_button() {
        driver.findElement(By.id("btnLogin")).click();
    }
 
    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        driver.quit();
    }
 
}