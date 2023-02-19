package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutFunctionPage {

    public LogoutFunctionPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="user")
    public WebElement userNameInput;

    @FindBy(id="password")
    public WebElement passwordInput;

    @FindBy(id="submit-form")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@id='expand']/div/img")
    public WebElement avatarIcon;

    @FindBy(xpath = "(//nav[@id='expanddiv']//a)[6]")
    public WebElement logout;
}
