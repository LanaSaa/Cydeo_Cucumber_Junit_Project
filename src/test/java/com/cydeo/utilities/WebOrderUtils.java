package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WebOrderUtils {

    //Method #1 info:
    //• Name: returnOrderDate ()
    //• Return type: String
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //This method should accept a costumerName and return the costumer order date as a String

    public static String returnOrderDate(String costumerName){

        return Driver.getDriver().findElement(By.xpath("//td[.='"+costumerName+"']/following-sibling::td[3]")).getText();
    }

    public static void orderVerify(String costumerName, String expectedOrderDate){

        WebElement customerDataCell = Driver.getDriver().findElement(By.xpath("//td[.='"+costumerName+"']/following-sibling::td[3]"));
        String actualOrderDate = customerDataCell.getText();
        Assert.assertEquals(expectedOrderDate, actualOrderDate);
    }

    public static String getTableGetEmail(String tableNum, String firstName) {
        WebElement gettable = Driver.getDriver().findElement(By.xpath("//table["+tableNum+"]//td[.='"+firstName+"']/following-sibling::td[1]"));
        return gettable.getText();

    }

}
