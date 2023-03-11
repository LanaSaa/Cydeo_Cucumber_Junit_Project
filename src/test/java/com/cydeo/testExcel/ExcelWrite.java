package com.cydeo.testExcel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {
    String filePath = "Employees.xlsx";

    @Test
    public void readExcelSheetData() throws IOException {
        FileInputStream in = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(in);
        XSSFSheet datasheet = workbook.getSheetAt(0);//go to the sheet
        //XSSFSheet datasheet = workbook.getSheetAt(0);  or go to the first sheet by index

        //add a column name "Salary" and save into file
        XSSFCell salaryCell = datasheet.getRow(0).createCell(3);
        salaryCell.setCellValue("Salary");

        //save the changes
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        outputStream.close();
        workbook.close();
        in.close();
    }
}
