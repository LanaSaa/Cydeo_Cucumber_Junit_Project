package com.cydeo.testExcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;


public class ExcelReadActions {
    String filePath = "Employees.xlsx";

    @Test
    public void readExcelSheetData() throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook(filePath); //open Employees.xlsx
        XSSFSheet datasheet = workbook.getSheet("Sheet1");//go to the sheet
        //XSSFSheet datasheet = workbook.getSheetAt(0);  or go to the first sheet by index
        for (int i = 0; i < 3; i++) {
            System.out.println("Column name:" + datasheet.getRow(0).getCell(i));//print column names
        }

        int rowsCount = datasheet.getPhysicalNumberOfRows();//find out number of rows in the worksheet starting from 1, if there are empty rows in between, it will not count them
        System.out.println("rowsCount = " + rowsCount); //4
        int rowsCount1 = datasheet.getLastRowNum(); // starting from 0, if there are empty rows in between, it will count them, good fit for use with for loop, especially if there are empty rows
        System.out.println("rowsCount1 = " + rowsCount1); //3

        for (int i = 0; i <= rowsCount1; i++) {
            System.out.println(datasheet.getRow(i).getCell(0));
        }

       //loop and find "Lana" in the first Name column
        for (int i = 0; i <= datasheet.getLastRowNum(); i++) {
            if(datasheet.getRow(i).getCell(0).toString().equals("Lana")){ //returns XSSFCell object, need toString()
                System.out.println(datasheet.getRow(i).getCell(0));
                break;
            }
// if there is empty cell it's getting NullPointerException
            //if(datasheet.getRow(0).getCell(0) != null)
        }
    }
}
