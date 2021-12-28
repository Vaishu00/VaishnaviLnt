package SeleniumBasics;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class MainWindow {
	public static void main(String[] args) {
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //over here one tab is present
        String parentWindow = driver.getWindowHandle();
        driver.get("http://www.seleniumframework.com/Practiceform/");
        String mainWindowTitle = driver.getTitle();
        
        System.out.println("Parent Window Title is: "+ mainWindowTitle);
        driver.findElement(By.id("button1")).click();
       // over here 2 tabs are present now
       Set<String> handles = driver.getWindowHandles();
      Iterator<String> it = handles.iterator();
     //   it.next();
        String childWindow = it.next();
 
        //at this point we know the id of both parent and child window
        driver.switchTo().window(childWindow);
        String childWindowTitle = driver.getTitle();
        System.out.println("Child Window Title is: "+ childWindowTitle);

        //Parent: Selenium Framework |   Practiceform
        //CHild: Selenium Framework | Selenium, Cucumber, Ruby, Java et al.

        //switch back again to parent window
        driver.switchTo().window(parentWindow);
        mainWindowTitle = driver.getTitle();
        System.out.println("Parent Window Title is: "+ mainWindowTitle);
        driver.quit();

    }
}
