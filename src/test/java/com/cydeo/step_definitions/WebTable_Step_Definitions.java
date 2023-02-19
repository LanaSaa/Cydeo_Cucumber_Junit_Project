package com.cydeo.step_definitions;

import com.cydeo.pages.WebTablePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTable_Step_Definitions {

    WebTablePage webTablePage = new WebTablePage();

    @Given("User is on the login page of Web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }

    @When("User should enter correct username")
    public void user_should_enter_correct_username() {
        webTablePage.txt_username.sendKeys("Test");
    }

    @When("User should enter correct password")
    public void user_should_enter_correct_password() {
        webTablePage.txt_password.sendKeys("Tester");
    }

    @When("User should click on login button")
    public void user_should_click_on_login_button() {
        webTablePage.btn_login.click();
    }

    @Then("User should see URL contains orders")
    public void user_should_see_url_contains_orders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
    }

    @When("User should enter {string} username and {string} password")
    public void userShouldEnterUsernameAndPassword(String username, String password) {
        webTablePage.txt_username.sendKeys(username);
        webTablePage.txt_password.sendKeys(password);
    }

    @When("User should enter below correct credentials")
    public void userShouldEnterBelowCorrectCredentials(Map<String,String> credentials) {
        webTablePage.txt_username.sendKeys(credentials.get("username"));
        webTablePage.txt_password.sendKeys(credentials.get("password"));

    }
}
