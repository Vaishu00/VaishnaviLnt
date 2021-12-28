package SeleniumBasics;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class SeleniumFunctions {
 
    /*
     * Selenium Functions:
     * 1. get: to open an application
     * 2. gettitle: to get the title of the current page
     * 3. getpagesource: 
     * 4. getclass
     * 5. gettext
     * 6. getwindowhandle
     * 7. getwindowhandles
     * 8. getCurrentURL
     * 9. getScreenshotAs
     * 
     * 
     * 1. LinkText
     * 2. PartialLinkText
     * 
     * Dropdown >> Select
     * 
     * 
     * Iframes
     * 
     * Close: it will close the current window
     * Quit: will close all the window
     * 
     * findElement
     * findElements
     * 
     * Alerts
     * 
     * 
     * Pending----------------
     * Actions class
     * move to element
     * drag and drop
     * 
     * JavaScript
     * 
     * methods
     * isEnabled
     * isDisplayed
     * isSelected
     * 
     * 
     * 
     * 
     */


    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.findElement(By.id("email")).getClass());
        System.out.println(driver.getPageSource());

        //assigning driver to take screenshot interface using casting
        TakesScreenshot scr = (TakesScreenshot) driver;
        //creating image file
        File srcFile = scr.getScreenshotAs(OutputType.FILE);
        //copy this image file to your desired location
        FileUtils.copyFile(srcFile, new File("./Screenshots/test.png"));

        driver.quit();
    }
}

