package SeleniumBasics;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
public class WaitsDemom {
public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();

WebDriver driver = new ChromeDriver();

driver.get("http://www.seleniumframework.com/Practiceform/");

driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

//below line will make selenium to wait for 10 seconds before throwing an error

//this is applicable to all the elements

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//normal alert

driver.findElement(By.id("alert")).click();

driver.switchTo().alert().accept();

System.out.println("Handled normal alert");

//timing alert

driver.findElement(By.id("timingAlert")).click();

//explicit wait waits for specific condition

//applicable to specific element

WebDriverWait wait = new WebDriverWait(driver, 10);

wait.until(ExpectedConditions.alertIsPresent()).accept();

//Thread.sleep(5000); never use sleep

driver.switchTo().alert().accept();

System.out.println("Handled timing alert");

driver.quit();

}

}