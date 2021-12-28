package com.base;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class TestBase {
 
    public static WebDriver driver;
    public static Properties prop;
    public static Logger logger;
 
    public TestBase() {
        prop = new Properties();
        try {
            FileInputStream fs = new FileInputStream("./src/main/java/com/config/config.properties");
            prop.load(fs);
 
        } catch (FileNotFoundException e) {
            System.out.println("No property file found");
        } catch (IOException e) {
            System.out.println("Unable to load the property file");
        }
    }
 
    public static void initialization() {
        logger = Logger.getLogger(TestBase.class);
        String browser = prop.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            logger.info("Identified the browser as Chrome");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            logger.info("Launched the browser as Chrome");
        } else if (browser.equalsIgnoreCase("firefox")) {
            logger.info("Identified the browser as firefox");
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            logger.info("Launched the browser as FireFox");
        } else if (browser.equalsIgnoreCase("ie")) {
            logger.info("Identified the browser as Internet Explorer");
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
            logger.info("Launched the browser as IE");
        }
 
        driver.get(prop.getProperty("url"));
        logger.info("Launched the Application");
    }
 
    public static void tearDown() {
        driver.quit();
        logger.info("Quitting the application and closing all browsers");
    }
}