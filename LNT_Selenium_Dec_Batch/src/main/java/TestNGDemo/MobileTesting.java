package TestNGDemo;

import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;
public class MobileTesting {

@Test(groups = "smoke")
public void tc1() {

System.out.println("Mobile Smoke TC1");

}

@Test(groups = "smoke")
public void tc2() {

System.out.println("Mobile Smoke TC2");

}

@Test(groups = "regression")
public void tc3() {

System.out.println("Mobile Regression TC3");

}

@Test(enabled = false)
public void tc4() {

System.out.println("Mobile No Tag TC4");

}

@AfterTest

public void generateMobileReport() {

System.out.println("Genarating Mobile Report");

}

}



