package com.testcases;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.base.TestBase;
import com.pages.LoginPage;
public class LoginPageTest extends TestBase {
LoginPage lp;
@BeforeMethod
public void browserSetUp() {
initialization();
lp = new LoginPage();
}
@Test
public void validateTitleTest() {
System.out.println("Validating Title TC");
//we will not write entire code over here
String expectedTitle = "OrangeHRM";
String actualTitle = lp.validateTitle();
AssertJUnit.assertEquals(actualTitle, expectedTitle);
}
@Test

public void validateLoginTest() {

System.out.println("Validating Login TC");

lp.validateLogin("Admin", "admin123");

}

 

@AfterMethod

public void closeSetUp() {

tearDown();

}

 

}
