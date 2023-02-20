package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {

    public WebTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "username")
    public WebElement txt_username;

    @FindBy(name = "password")
    public WebElement txt_password;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement btn_login;

    public void login(){
        this.txt_username.sendKeys("Test");
        this.txt_password.sendKeys("Tester");
        this.btn_login.click();
    }

    public void login(String username, String password){
        this.txt_username.sendKeys(username);
        this.txt_password.sendKeys(password);
        this.btn_login.click();
    }
}
