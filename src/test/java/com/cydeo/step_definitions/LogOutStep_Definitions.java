package com.cydeo.step_definitions;

import com.cydeo.pages.LogoutFunctionPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogOutStep_Definitions {

    LogoutFunctionPage logoutFunctionPage = new LogoutFunctionPage();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.getDriver().get("http://qa.seamlessly.net/");
        logoutFunctionPage.userNameInput.sendKeys("Employee61");
        logoutFunctionPage.passwordInput.sendKeys("Employee123");
        logoutFunctionPage.loginButton.click();

    }

    @Given("the user clicks the avatar icon")
    public void the_user_clicks_the_avatar_icon() {
        logoutFunctionPage.avatarIcon.click();
    }

    @Given("the user clicks the logout label")
    public void the_user_clicks_the_logout_label() {
        logoutFunctionPage.logout.click();
    }

    @Then("the user should see the url {string}")
    public void the_user_should_see_the_url(String url) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(url) );
    }

    @When("the user clicks step back button")
    public void theUserClicksStepBackButton() {
        Driver.getDriver().navigate().back();
    }

}
