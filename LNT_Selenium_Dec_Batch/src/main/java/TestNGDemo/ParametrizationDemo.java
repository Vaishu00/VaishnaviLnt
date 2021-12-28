package TestNGDemo;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Parameters;

import org.testng.annotations.Test;

public class ParametrizationDemo {

/*

* Parameterization How to pass paramters to the TC 1. using testng.xml file

* 

* we want to execute the same tc again and again with different set of values for username and password

* then we use data providers

* 

*/



//@Parameters({ "username" })

//@Test

public void login(String uname) {

System.out.println("Testing Login");

System.out.println("Username is " + uname);
}
//@Parameters({ "username", "password" })

//@Test

public void login(String uname, String pass) {

System.out.println("Testing Login");

System.out.println("Username is " + uname);

System.out.println("Password is " + pass);

}

@Test (dataProvider = "getData")

public void loginWithDataProvider(String uname, String pass) {

System.out.println("TC accepting data provider");

System.out.println("Username is " + uname);

System.out.println("Password is " + pass);


}

@DataProvider(name = "getData")

public Object[][] getLoginData() {

//first bracket defines row, means how many times TC will be executed

//second bracked defines col, means how many parameters will be taken in each run

 

Object[][] data = new Object[2][2];

data[0][0] = "Admin";

data[0][1] = "admin123";

data[1][0] = "ajay";

data[1][1] = "ajay123";

return data;

}

}
