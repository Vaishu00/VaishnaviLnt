package SeleniumBasics;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class FramesDemo {
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/iframe");
        List<WebElement> noOfFrames = driver.findElements(By.tagName("iframe"));
        System.out.println("Number of frames present is "+ noOfFrames.size());
        driver.switchTo().frame(0);
        //practise for id and webelement


        WebElement body = driver.findElement(By.id("tinymce"));
        body.clear();
        body.sendKeys("Ajay");
        Thread.sleep(4000);
        driver.close();


        //to come back to the main frame
        //driver.switchTo().parentFrame();
    }
}
