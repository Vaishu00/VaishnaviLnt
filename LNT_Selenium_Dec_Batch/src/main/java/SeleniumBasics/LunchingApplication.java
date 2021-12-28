package SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LunchingApplication {
	public static void main(String[] args) {
		/*
		* Test: Login Feature of Facebook Application
		* Steps:
		* 1. Open the browser
		* 2. Go to the application
		* 3. Enter the username
		* 4. Enter the password
		* 5. Click on Login button
		* 6. Close the browser
		*/
		//configure the browser which you want to use
		//use webdriver manager for browser configuration
		WebDriverManager.chromedriver().setup();
		//launch the browser
		WebDriver driver = new ChromeDriver();
		//launch the application
		driver.get("https://www.facebook.com/");
		//enter the username
		driver.findElement(By.id("email")).sendKeys("user@gmail.com");
		//enter password
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("passwordtest");
		//click on Login Button
		driver.findElement(By.name("login")).click();
	}

}
