package com.util;



import java.io.IOException;



import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelReader {



static XSSFWorkbook workbook;

static XSSFSheet sheet;

 

public ExcelReader(String excelPath, String sheetName) {

try {

workbook = new XSSFWorkbook(excelPath);

sheet = workbook.getSheet(sheetName);

System.out.println(excelPath);

System.out.println(sheetName);

} catch (IOException e) {

System.out.println("File not found!!!");

}

}

 

public int getRowCount() {

return sheet.getPhysicalNumberOfRows();

}

 

public int getColCount() {

return sheet.getRow(0).getLastCellNum();

}

 

public String getCellData(int rowNum, int colNum) {

return sheet.getRow(rowNum).getCell(colNum).getStringCellValue();

//System.out.println(sheet.getRow(rowNum).getCell(colNum).getStringCellValue());

}

 

public void getTestData() {

//this is responsible to return all the data present

int rowCount = getRowCount();

int colCount = getColCount();

for (int i = 0; i < rowCount ; i++) {

for (int j = 0; j < colCount; j++) {

System.out.println(getCellData(i, j));

}

}

}

 

}