package SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DropDownDemo {
public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();

WebDriver driver= new ChromeDriver();

driver.get("http://output.jsbin.com/osebed/2");

WebElement dropDown =  driver.findElement(By.id("fruits"));

//select class is used to handle dropdown

Select s = new Select(dropDown);

//select by index, value, visibletext

s.selectByIndex(2);

s.selectByValue("banana");

s.selectByVisibleText("Apple");

Thread.sleep(6000);

driver.quit();

 

}

}


