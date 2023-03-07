package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRM_Page {

    public CRM_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    public void navigateToModuleAndClick(String moduleName) {
        String locator = "//ul[@class='menu-items']//span[contains(.,'"+moduleName+"')]";
        WebElement module = Driver.getDriver().findElement(By.xpath(locator));
        module.click();
    }

    @FindBy(xpath ="//input[@type='text']")
    public WebElement userName;

    @FindBy(xpath ="//input[@type='password']")
    public WebElement password;

    @FindBy(xpath ="//input[@type='submit']")
    public WebElement login;


}
