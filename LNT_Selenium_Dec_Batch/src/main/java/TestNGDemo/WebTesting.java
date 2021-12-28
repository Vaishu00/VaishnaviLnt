package TestNGDemo;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;
public class WebTesting {

@Test(groups = "smoke")
public void tc1() {

System.out.println("Web Smoke TC1");

}

@Test(groups = "smoke")
public void tc2() {

System.out.println("Web Smoke TC2");

}

 
@Test(groups = "regression")
public void tc3() {

System.out.println("Web Regression TC3");

}
@AfterTest
public void generateWebReport() {

System.out.println("Genarating Web Report");

}

@AfterSuite
public void emailReport() {

System.out.println("Emailing report");

}

}

