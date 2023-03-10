package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChatAndCallsModule_Page_Svetlana extends BasePage {

    @FindBy(xpath="//div[contains(@title,'Message(s)')]")
    public WebElement messages;

    @FindBy(xpath = "//div[contains(@title,'Notifications')]")
    public WebElement notifications;

    @FindBy(xpath = "//div[contains(@title,'Settings')]")
    public WebElement settings;

    @FindBy(xpath = "//div[contains(@title,'Activity Stream')]")
    public WebElement activityStream;

    public WebElement chatAndCallsOptions(String options) {
        String locator = "//div[contains(@title,'"+options+"')]";
        return Driver.getDriver().findElement(By.xpath(locator));
    }
}
