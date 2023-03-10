package com.cydeo.step_definitions;

import com.cydeo.pages.CRM_Page;
import com.cydeo.pages.ChatAndCallsModule_Page_Svetlana;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class CRM_Project_StepDefinition {

    @When("user is on the CRM Home page")
    public void user_is_on_the_crm_home_page() {
        Driver.getDriver().get("https://login2.nextbasecrm.com/");
    }

    CRM_Page crm_page = new CRM_Page();
    ChatAndCallsModule_Page_Svetlana chatAndCallsModule = new ChatAndCallsModule_Page_Svetlana();

    @Then("user login with valid credentials")
    public void userLoginWithValidCredentials() {
        crm_page.userName.sendKeys("hr5@cybertekschool.com");
        crm_page.password.sendKeys("UserUser");
        crm_page.login.click();
    }

    @Then("user should see click on the module")
    public void user_should_see_click_on_the_module() {
        crm_page.navigateToModuleAndClick("Chat and Calls");
    }

    @Then("verify the users see four options:")
    public void verify_the_users_see_four_options(List<String> options) {

        for (String eachOption : options) {
            Assert.assertTrue(chatAndCallsModule.chatAndCallsOptions(eachOption).getAttribute("title").contains(eachOption));
        }
    }

}
