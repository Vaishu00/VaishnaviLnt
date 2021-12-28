
package TestNGDemo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAnnotations {

/*

* TestNG:

* Test Next generation

* it is a free and open source

* used as a testing framework

* 

* Annotations:

* BeforeSuite

* BeforeTest: will be executed before Test level

* BeforeClass

* BeforeMethod: will be executed before each TC

* Test - this indicates you test case

* AfterSuite

* AfterTest

* AfterClass

* AfterMethod: will be executed after each TC

* 

* Note: TC are executed alphabetically

* 

* 

* Priority: helps you to prioritize your TC

* Depends on

*/

public void closeApplication() {

System.out.println("After Test");

}
public void launchApplication() {

System.out.println("Before Test");

}

@Test(priority = 5, groups = "smoke")

public void validateTitleTest() {

System.out.println("API Smoke TC1");

String expectedTitle = "Facebook";

String actualTitle = "Facebook";

Assert.assertEquals(actualTitle, expectedTitle);

}
@Test(priority = 2, dependsOnMethods = "validateTitleTest", groups = "smoke")

public void LoginTest() {

System.out.println("API smoke TC2 ");

}
@Test(priority = 3, dependsOnMethods = "validateTitleTest", groups = "regression")

public void HomePageTest() {

System.out.println("API regression TC3");

}
@AfterTest

public void generateAPIReport() {

System.out.println("Genarating API Report");

}

}


