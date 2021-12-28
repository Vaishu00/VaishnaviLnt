package com.pages;
import org.openqa.selenium.By;
import com.base.TestBase;
public class LoginPage extends TestBase{
public String validateTitle() {
String title = driver.getTitle();
return title;
}

 

public void validateLogin(String username, String password){

driver.findElement(By.id("txtUsername")).sendKeys(username);

driver.findElement(By.id("txtPassword")).sendKeys(password);

driver.findElement(By.id("btnLogin")).click();

}

}
