package com.cydeo.step_definitions;

import com.cydeo.pages.BingSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Bing_StepDefinitions {

    BingSearchPage bingSearchPage = new BingSearchPage();

    @Given("user is on the Bing search page")
    public void user_is_on_the_bing_search_page() {
        Driver.getDriver().get("https://www.bing.com");

    }
    @When("user enters orange in the Bing search box")
    public void user_enters_orange_in_the_bing_search_box() {
        bingSearchPage.searchBox.sendKeys("orange");
        BrowserUtils.sleep(2);
        bingSearchPage.searchBox.sendKeys(Keys.ENTER);
    }


    @Then("user should see orange in the title")
    public void userShouldSeeOrangeInTheTitle() {
        BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle("orange - Search");

    }


    @Then("user should see orange - Search in the title")
    public void userShouldSeeOrangeSearchInTheTitle() {
        BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle("orange - Search");
    }
}

