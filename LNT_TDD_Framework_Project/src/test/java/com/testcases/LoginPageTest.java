package com.testcases;
 
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.base.TestBase;
import com.pages.DashboardPage;
import com.pages.LoginPage;
 
public class LoginPageTest extends TestBase {
 
    LoginPage lp;
    DashboardPage dp;


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
        String expectedTitle = "OrangeHRM Inc";
        String actualTitle = lp.validateTitle();
        AssertJUnit.assertEquals(actualTitle, expectedTitle);
        logger.info("Execution of validateTitleTest completed!!!");
    }

    @Test
    public void validateLoginTest() {
        logger.info("Execution of validateLoginTest started!!!");
        dp = lp.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
        logger.info("Execution of validateLoginTest completed!!!");
    }

    @AfterMethod
    public void closeSetUp() {
        tearDown();
    }

}
