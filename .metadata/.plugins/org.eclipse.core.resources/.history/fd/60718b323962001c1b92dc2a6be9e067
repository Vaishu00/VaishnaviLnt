package com.testcases;
 
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.base.TestBase;
import com.pages.DashboardPage;
import com.pages.LoginPage;
 
public class LoginPageTest extends TestBase {
 
    LoginPage lp;
    DashboardPage dp;


    @BeforeTest
    public void extentReportSetup() {
        reportSetup();
    }

    @BeforeMethod
    public void browserSetUp() {
        //logger.info("Trying to do Browser Setup");
        initialization();
        lp = new LoginPage();
    }


    @Test
    public void validateTitleTest() {
        logger.info("Execution of validateTitleTest started!!!");
        //we will not write entire code over here
        String expectedTitle = "OrangeHRM";
        String actualTitle = lp.validateTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        logger.info("Execution of validateTitleTest completed!!!");
        ExtentTest test = extent.createTest("Validate Title Test");
        test.log(Status.PASS, "TC Passed");
    }

    @Test
    public void validateLoginTest() {
        logger.info("Execution of validateLoginTest started!!!");
        dp = lp.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
        logger.info("Execution of validateLoginTest completed!!!");
        ExtentTest test = extent.createTest("Validate Login Test");
        test.log(Status.PASS, "TC Passed");
    }

    @AfterMethod
    public void closeSetUp() {
        tearDown();
    }
 
    @AfterSuite
    public void generateReport() {
        extent.flush();
    }

}

