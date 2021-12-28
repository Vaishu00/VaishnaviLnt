package SeleniumBasics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
      //  keyboardDemo();
		// hoverDemo();
       dragDrop();
    }

    public static void keyboardDemo() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        WebElement username = driver.findElement(By.id("txtUsername"));
        Actions act = new Actions(driver);
        act.click(username)
        .keyDown(Keys.SHIFT)
        .sendKeys("admin")
         .keyUp(Keys.SHIFT)
        .build()
        .perform();

        Thread.sleep(5000);
        driver.quit();
    }

    public static void hoverDemo() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        WebElement primeMenu = driver.findElement(By.xpath("//span[text()='Prime']"));
        Actions act = new Actions(driver);
        act.moveToElement(primeMenu).build().perform();
        Thread.sleep(5000);
        driver.quit();
    }

    public static void dragDrop() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        //write the code to switch to the frame
        List<WebElement> noOfFrames = driver.findElements(By.tagName("iframe"));
        System.out.println("Number of frames present is "+ noOfFrames.size());
        driver.switchTo().frame(0);

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        Actions act = new Actions(driver);
        act.dragAndDrop(source, target).build().perform();
        Thread.sleep(5000);
        driver.quit();

    }


}
