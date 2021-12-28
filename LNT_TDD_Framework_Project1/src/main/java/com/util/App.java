package com.util;



public class App {



public static void main(String[] args) {

String excelPath = "./src/test/resources/TestData/Auto(1).xlsx";

String sheetName = "Sheet1";

ExcelReader reader = new ExcelReader(excelPath, sheetName);

System.out.println(reader.getRowCount());

System.out.println(reader.getColCount());

 

reader.getTestData();

}

}
