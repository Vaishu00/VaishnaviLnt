package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger;
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;

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
		// configuring/initializating logger
		logger = Logger.getLogger(TestBase.class);
		String browser = prop.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			logger.info("Identified the browser as Chrome");
			ChromeOptions options = new ChromeOptions();
			options.setHeadless(false);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
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

	public static void takeScreenshot(String fileName) {
		// assigning driver to take screenshot interface using casting
		TakesScreenshot scr = (TakesScreenshot) driver;
		// creating image file
		File srcFile = scr.getScreenshotAs(OutputType.FILE);
		// copy this image file to your desired location
		try {
			FileUtils.copyFile(srcFile, new File("./Screenshots/" + fileName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void tearDown() {
		driver.quit();
		logger.info("Quitting the application and closing all browsers");
	}

	public static void reportSetup() {
		// configuring Extent Report
		String reportPath = System.getProperty("user.dir") + "/ExtentReport/report.html";
		reporter = new ExtentSparkReporter(reportPath);
		extent = new ExtentReports();
		reporter.config().setDocumentTitle("Orange HRM Automation Report");
		reporter.config().setReportName("Web Automation Report");
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Manager", "Ajay");
		extent.setSystemInfo("QA Manager", "Shalini");
		extent.setSystemInfo("Tester", "Shilpa");
		extent.setSystemInfo("Environment", "QA");

	}
}
