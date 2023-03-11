package com.cydeo.testExcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

public class ExcelRead {

    @Test
    public void readingFromExcel() throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook("Employees.xlsx"); //open Employees.xlsx
        XSSFSheet worksheet = workbook.getSheet("Sheet1"); //go to the sheet
        System.out.println(worksheet.getRow(1).getCell(0));//print data

    }
}
