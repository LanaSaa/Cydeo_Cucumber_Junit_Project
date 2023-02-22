package com.cydeo.step_definitions;

import com.cydeo.pages.WebTablePage;
import com.cydeo.pages.WebTable_OrderPage;
import com.cydeo.pages.WebTable_ViewAllOrdersPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
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
    public void userShouldEnterBelowCorrectCredentials(Map<String, String> credentials) {
        webTablePage.txt_username.sendKeys(credentials.get("username"));
        webTablePage.txt_password.sendKeys(credentials.get("password"));

    }


    @Given("user is already logged in to The Web table app")
    public void user_is_already_logged_in_to_the_web_table_app() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        webTablePage.login();
    }

    WebTable_OrderPage webTable_orderPage = new WebTable_OrderPage();

    @When("user is on the Order page")
    public void user_is_on_the_order_page() {
        webTable_orderPage.orderLink.click();
    }

    @Then("user sees below options under product dropdown")
    public void user_sees_below_options_under_product_dropdown(List<String> options) {

        List<String> actualOptions = BrowserUtils.dropdownOptions_as_STRING(webTable_orderPage.productDropdown);
        Assert.assertEquals(options, actualOptions);

    }

    @Then("user sees Visa as enabled payment option")
    public void userSeesVisaAsEnabledPaymentOption() {
        Assert.assertTrue(webTable_orderPage.visaRadioButton.isEnabled());
    }

    @Then("user sees MasterCard as enabled payment option")
    public void userSeesMasterCardAsEnabledPaymentOption() {
        Assert.assertTrue(webTable_orderPage.masterCardRadioButton.isEnabled());
    }

    @Then("user sees American Express as enabled payment option")
    public void userSeesAmericanExpressAsEnabledPaymentOption() {
        Assert.assertTrue(webTable_orderPage.americanExpressRadioButton.isEnabled());
    }


    @And("user enters quantity {string}")
    public void userEntersQuantity(String quantity) {
        webTable_orderPage.inputQuantity.clear();
        webTable_orderPage.inputQuantity.sendKeys(quantity);
    }

    @Then("user clicks to the calculate button")
    public void userClicksToTheCalculateButton() {
        webTable_orderPage.calculateButton.click();
    }

    @And("user enters customer name {string}")
    public void userEntersCustomerName(String name) {
        webTable_orderPage.inputName.sendKeys(name);

    }

    @And("user enters street {string}")
    public void userEntersStreet(String street) {
        webTable_orderPage.inputStreet.sendKeys(street);
    }

    @And("user enters city {string}")
    public void userEntersCity(String city) {
        webTable_orderPage.inputCity.sendKeys(city);
    }

    @And("user enters state {string}")
    public void userEntersState(String state) {
        webTable_orderPage.inputState.sendKeys(state);
    }

    @And("user enters zip {string}")
    public void userEntersZip(String zip) {
        webTable_orderPage.inputZip.sendKeys(zip);
    }

    @And("user selects the payment option {string}")
    public void userSelectsThePaymentOption(String expectedcardType) {
        BrowserUtils.clickRadioButton(webTable_orderPage.cardTypes, expectedcardType);
    }

    @And("user enters credit card number {string}")
    public void userEntersCreditCardNumber(String cardNumber) {
        webTable_orderPage.inputCreditCard.sendKeys(cardNumber);
    }

    @And("user enters expiration date {string}")
    public void userEntersExpirationDate(String expData) {
        webTable_orderPage.inputExpirationDate.sendKeys(expData);
    }

    @And("user clicks to process order button")
    public void userClicksToProcessOrderButton() {
        webTable_orderPage.processButton.click();
    }

    WebTable_ViewAllOrdersPage webTable_viewAllOrdersPage = new WebTable_ViewAllOrdersPage();

    @Then("user should see {string} in the first row of the web table")
    public void userShouldSeeInTheFirstRowOfTheWebTable(String expectedName) {
        Assert.assertEquals(expectedName, webTable_viewAllOrdersPage.newCustomerCell.getText());
    }
}
