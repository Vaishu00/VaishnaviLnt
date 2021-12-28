
package SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class JavaScriptExecutorDemo {
public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();

//to execute JS code, we need to assign driver to JS object
JavascriptExecutor js = (JavascriptExecutor) driver;

//js.executeScript("window.scrollBy(0,1000)");
/*

* Above line means

* x-pixels: defines the x-axis

* it moves to the left if number is positive

* it moves to the right if number is negative

* 

* y-pixels: defines the y-axis

* it moves to the down if number is positive

* it moves to the up if number is negative

*/
//to scroll to the bottom of the page
js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
WebElement fbLink = driver.findElement(By.linkText("Facebook"));

//to scroll to a specific element
js.executeScript("arguments[0].scrollIntoView();", fbLink);

//to click on a specific element
js.executeScript("arguments[0].click();", fbLink);

Thread.sleep(4000);
driver.quit(); 

}

}