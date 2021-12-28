package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(id = "txtUsername")
	WebElement usernameField;
	
	@FindBy(id = "txtPassword")
	WebElement passwordField;
	
	@FindBy(id = "btnLogin")
	WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle() {

		takeScreenshot("titleTest");
		String title = driver.getTitle();
		return title;
	}
	
	public DashboardPage validateLogin(String username, String password){
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();
		takeScreenshot("loginTest");
		return new DashboardPage();
	}
}
