package com.cydeo.utilities;

import org.openqa.selenium.By;

public class VytrackUtils {

    //We will use project common areas
    public   static void clickSubMenu(String main,String subMenu){
        clickMain(main);
        String sublocator="//ul[@id='top-menu']/li[contains(.,'"+main+"')]/ul/li[contains(.,'"+subMenu+"')]";
        Driver.getDriver().findElement(By.xpath(sublocator)).click();

    }
    public static void clickMain(String main){
        String locator="//ul[@id='top-menu']/li[contains(.,'"+main+"')]";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }
}
