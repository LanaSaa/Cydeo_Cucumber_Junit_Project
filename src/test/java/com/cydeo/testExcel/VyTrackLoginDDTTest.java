package com.cydeo.testExcel;

import com.cydeo.pages.VyTrackLoginPage;
import com.cydeo.pages.VyTrackLogoutPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

public class VyTrackLoginDDTTest {
    String filePath = "Credentials.xlsx";
    VyTrackLoginPage vyTrackLogin = new VyTrackLoginPage();
    VyTrackLogoutPage vyTrackLogout = new VyTrackLogoutPage();

    @Test
    public void loginDDTTest() throws IOException {
        FileInputStream in = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(in);
        XSSFSheet datasheet = workbook.getSheet("Sheet1");
        int rowsCount = datasheet.getLastRowNum();

        for (int i = 1; i <= datasheet.getLastRowNum(); i++) {
            String username = datasheet.getRow(i).getCell(0).toString();
            String password = datasheet.getRow(i).getCell(1).toString();

            Driver.getDriver().get("https://qa2.vytrack.com/user/login");
            vyTrackLogin.login(username, password);
            //Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("qa2.vytrack.com"));

            XSSFCell resultCell = datasheet.getRow(i).getCell(4);

            if (Driver.getDriver().getCurrentUrl().contains("qa2.vytrack.com")) {
                System.out.println("Pass");
                resultCell.setCellValue("Pass");
            } else {
                System.out.println("Fail");
                resultCell.setCellValue("Fail");
            }
            vyTrackLogout.logout();
        }
        //save the changes
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);

        outputStream.close();
        workbook.close();
        in.close();

    }
}
