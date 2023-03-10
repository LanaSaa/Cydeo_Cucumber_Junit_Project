package com.cydeo.pages;


import com.cydeo.utilities.Driver;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @FindBy(xpath = "//a[@title='Activity Stream']")
    public WebElement activityStream;//span[@class='menu-item-link-text'])[1]

    @FindBy(xpath = "//a[@title='Tasks']")//
    public WebElement tasks;

    @FindBy(css = "a[title='Chat and Calls']")//span[@class='menu-item-link-text'])[3]
    public WebElement chatAndCall;

    @FindBy(css = "a[title='Workgroups']")//
    public WebElement workGroups;

    //@FindBy(css = "a[onclick='bxFullscreenClose(); return false;']")
    //  public WebElement closeButton;

    @FindBy(xpath = "//div[@id='left-menu-more-btn']")
    public WebElement moreButton;

    @FindBy(css = "a[title='Applications']")
    public WebElement applicationsButton;

    @FindBy(xpath = "//a[@title='Workflows']")
    public WebElement workflowsButton;

    @FindBy(xpath = "//span[.='Hide']")
    public WebElement hideButton;

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void navigateToModuleAndClick(String moduleName) {
        String locator = "//ul[@id='left-menu-list']//span[contains(.,'" + moduleName + "')]";
        WebElement module = Driver.getDriver().findElement(By.xpath(locator));
        module.click();
    }

    @FindBy(css = ".user-img.user-default-avatar")
    public WebElement myProfileIcon;


    @FindBy(xpath = "//span[.='My Profile']")
    public WebElement myProfileOption;

    @FindBy(xpath = "//span[.='Edit Profile Settings']")
    public WebElement editProfileSettingsOption;

    @FindBy(xpath = "//span[@class='menu-popup-item menu-popup-no-icon ']//span[.='Themes']")
    public WebElement themesOption;

    @FindBy(xpath = "(//span[.='Configure notifications'])[2]")
    public WebElement configureNotificationsOption;

    /**
     * @return page name, for example: Dashboard
     */


    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logoutOption;


    @FindBy(xpath = "//a[@title='Services']")
    public WebElement servicesModule;

    @FindBy(xpath = "//a[@title='Time and Reports']")
    public WebElement timeAndReportsModule;

    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employeesModule;

    @FindBy(xpath = "//a[@title='Company']")
    public WebElement companyModule;

    @FindBy(id = "bx-im-bar-notify")
    public WebElement notifications;

    @FindBy(xpath = "//div[@class='help-block-icon']")
    public WebElement helpButton;

    @FindBy(id = "bx-im-bar-search")
    public WebElement rightSearchButton;

    @FindBy(xpath = "//a[@title='Drive']")
    public WebElement driveButton;

    @FindBy(xpath = "//a[@title='Calendar']")
    public WebElement calendarButton;

    @FindBy(xpath = "//a[@title='Mail']")
    public WebElement mailButton;

    @FindBy(xpath = "//a[@title='Contact Center']")
    public WebElement contactCenterButton;

    /**
     * Method that will allow to access options under my profile
     *
     * @param option
     */
    public void selectOptionUnderProfile(String option) {
        myProfileIcon.click();
        String locator = "//div[@class='menu-popup-items']//span[contains(.,'" + option + "')]";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }


}
