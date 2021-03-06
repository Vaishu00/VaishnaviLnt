package SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LunchingApplication1 {
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
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//enter the username
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//enter password
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		//click on Login Button
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	//	driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	//	driver.findElement(By.id("menu_admin_Qualifications")).click();
	//	driver.findElement(By.id("menu_admin_viewSkills")).click();
	//	driver.findElement(By.id("btnAdd")).click();
 //		driver.findElement(By.id("skill_name")).sendKeys("Selenium2");
  //  	driver.findElement(By.id("skill_description")).sendKeys("Training2");
	//	driver.findElement(By.id("btnSave")).click();
		
		
	}
}
