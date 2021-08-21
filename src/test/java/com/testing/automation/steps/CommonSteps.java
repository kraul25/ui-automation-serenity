package com.testing.automation.steps;

import com.testing.automation.pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.By;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CommonSteps {
    BasePage basePage;

    @Given("I am on Login page")
    public void i_am_on_login_page() {
        WebDriverFacade driver = (WebDriverFacade) basePage.getDriver();
        if (!driver.getDriverName().equals("appium")) {
            basePage.open();
        }
    }

    @And("I enter (.*) in (.*) field$")
    public void send_text(String text, String object) throws InterruptedException {
        basePage.typeText(text, object);
    }

    @And("I perform click on (.*)$")
    public void iPerformClick(String object) throws InterruptedException {
        basePage.clickObject(object);
    }

    @And("I see (.*) is displayed$")
    public void iSeeTextIsDisplayed(String object) {
        String xpath = "//*[text()='" + object + "']";
        basePage.waitFor(xpath);
        assertTrue(basePage.element(By.xpath(xpath)).isCurrentlyVisible());
        assertTrue(basePage.element(By.xpath(xpath)).isDisplayed());
        assertEquals(basePage.element(By.xpath(xpath)).getText(), object);
    }

    @And("I select dropdown value (.*)$")
    public void select_dropdown(String value) throws InterruptedException {
        basePage.selectDropdown(value);
    }
}