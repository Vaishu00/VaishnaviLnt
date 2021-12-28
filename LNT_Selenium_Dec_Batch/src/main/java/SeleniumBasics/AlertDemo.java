package SeleniumBasics;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AlertDemo {

public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("http://www.seleniumframework.com/Practiceform/");
driver.findElement(By.id("alert")).click();
Thread.sleep(3000);
Alert popup = driver.switchTo().alert();
String text = popup.getText();
System.out.println(text);
//popup.accept();
popup.dismiss();
driver.close();
}

}
