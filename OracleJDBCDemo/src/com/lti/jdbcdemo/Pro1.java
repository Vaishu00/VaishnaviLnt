package com.lti.jdbcdemo;

public class Pro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try{
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	 System.out.println("Driver load successfully");
   }
   catch(ClassNotFoundException e){
	   System.out.println("No driver found!");
   }
	}

}
