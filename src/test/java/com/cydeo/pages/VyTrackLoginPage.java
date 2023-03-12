package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLoginPage {

    public VyTrackLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement _username;
    @FindBy(xpath = "//input[@id='prependedInput2']")
    public WebElement _password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement login;

    public void login(String userName, String password){
        _username.sendKeys(userName);
        _password.sendKeys(password);
        login.click();
    }
}
