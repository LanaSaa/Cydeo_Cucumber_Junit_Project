package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsySearch_Step_Definitions {

    EtsyPage etsyPage = new EtsyPage();

    @Given("User is on {string}")
    public void user_is_on(String url) {
        Driver.getDriver().get(url);
    }

    @Then("User sees title is as expected")
    public void user_sees_title_is_as_expected() {
        Assert.assertEquals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone", Driver.getDriver().getTitle());
    }

    @Then("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsyPage.searchBox.sendKeys("Wooden Spoon");
    }

    @Then("User clicks search button")
    public void user_clicks_search_button() {
        etsyPage.searchBtn.click();
    }

    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        Assert.assertEquals("Wooden spoon - Etsy", Driver.getDriver().getTitle());
    }


    @When("User types {string} in the search box")
    public void userTypesInTheSearchBox(String searchWord) {
        etsyPage.searchBox.sendKeys(searchWord);
    }


    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String searchWord) {
        Assert.assertEquals(searchWord, Driver.getDriver().getTitle());
    }
}
