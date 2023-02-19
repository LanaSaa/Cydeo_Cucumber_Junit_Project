package com.cydeo.utilities;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {

    /*
    This method will accept int (in seconds) and execute Thread.sleep method
     for given duration    Arg: int second
     */
    public static void sleep(int second) {

        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle) {
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        for (String eachWindowHandle : allWindowHandles) {
            Driver.getDriver().switchTo().window(eachWindowHandle);
            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    public static void verifyTitle(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public static void verifyTitleContains(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    /*
      This method accepts WebElement target,
      and waits for that WebElement not to be displayed on the page
       */
    public static void waitForInvisibilityOf(WebElement target) {
        //Create the object of 'WebDriverWait' class, and set up the constructor args
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        //use the 'wait' object with the proper syntax to create explicit wait conditions.
        wait.until(ExpectedConditions.invisibilityOf(target));
    }


    /*
    This method accepts String title,
    and waits for that Title to contain given String value.
     */
    public static void waitForTitleContains(String title) {
        //Create the object of 'WebDriverWait' class, and set up the constructor args
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        //use the 'wait' object with the proper syntax to create explicit wait conditions.
        wait.until(ExpectedConditions.titleContains(title));
    }

    public static List<String> getTexts(List<WebElement> elements) {
        List<String> result = new ArrayList<>();
        for (WebElement element : elements) {
            String eachText = element.getText();
            result.add(eachText);
        }
        return result;
    }

    public static List<String> dropdownOptionsAsString(WebElement dropdown ) {
        Select select = new Select(dropdown);
        List<WebElement> actualMonth_WebElement = select.getOptions();
        List<String> actualMonths = new ArrayList<>();
        for (WebElement eachElement : actualMonth_WebElement) {
            actualMonths.add(eachElement.getText());
        }
        return actualMonths;
    }
}
