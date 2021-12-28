package SeleniumBasics;
import java.util.List;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;
public class LocatorsTypes {
	/*

	* Locators:

	* for web elements:

	* 

	* id: this the the first priority

	* name: this is your second priority

	* class-name: multiple elements can have the same class

	* tagname: this will return all the element matching with this tag

	* 

	* css: #email, #pass

	* xpath: XML Path

	* Relative: //*[@id="pass"]

	* Absolute: /html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input

	* 

	* 

	* For URLS:

	* linktext: Forgotten password?

	* partiallinktext: Forgotten

	* 

	* 

	*/

	 

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();

	WebDriver driver = new ChromeDriver();

	driver.get("https://opensource-demo.orangehrmlive.com/");

	List<WebElement> urls = driver.findElements(By.tagName("a"));

	System.out.println("Number of URLS present is "+ urls.size());

	for (WebElement webElement : urls) {

	System.out.println(webElement.getText());

	}

	driver.close();

	}
}
