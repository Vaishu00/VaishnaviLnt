package com.base;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
public static WebDriver driver;
public static void initialization() {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
}
public static void tearDown() {
driver.quit();

}

}
