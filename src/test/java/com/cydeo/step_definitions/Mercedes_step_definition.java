package com.cydeo.step_definitions;

import com.cydeo.pages.Mercedes_page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class Mercedes_step_definition {
    Mercedes_page mercedes_page = new Mercedes_page();
    @Given("the user go to the Mercedes home page")
    public void the_user_go_to_the_mercedes_home_page() {
        Driver.getDriver().get("https://www.mercedes-benz.co.uk/");
    }
    @Given("the user clicks the buy online button")
    public void the_user_clicks_the_buy_online_button() {
        /* First solution:

        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        WebElement byuOnlinebtn = (WebElement) js.executeScript("return document.querySelector(\"body > div.root.responsivegrid > div > div > div > owc-stage:nth-child(2)\").shadowRoot.querySelector(\"div > div.owc-stage__content-wrapper > div > div.owc-stage__cta-wrapper.wb-grid-row > div > div > a.owc-stage-cta-buttons__button.wb-button.wb-button--medium.wb-button--theme-dark.wb-button--large.wb-button--primary.owc-stage-cta-buttons__button--primary\")");
        byuOnlinebtn.click();*/

        WebElement shadowHost = Driver.getDriver().findElement(By.cssSelector("body > div.root.responsivegrid > div > div > div > owc-stage:nth-child(2)"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("div > div.owc-stage__content-wrapper > div > div.owc-stage__cta-wrapper.wb-grid-row > div > div > a.owc-stage-cta-buttons__button.wb-button.wb-button--medium.wb-button--theme-dark.wb-button--large.wb-button--primary.owc-stage-cta-buttons__button--primary"));

    }
    @Given("the user verify the title on the Mercedes page")
    public void the_user_verify_the_title_on_the_mercedes_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Mercedes") );
    }

}
