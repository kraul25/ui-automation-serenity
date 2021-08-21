package com.testing.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class BasePage extends PageObject {
    @FindBy(css = "•spinner-img")
    private WebElementFacade SPINNER;

    public void typeText(String text, String object) throws InterruptedException {
        String xpath = "//*[@name='" + object + "']";
        waitFor(xpath);
        element(By.xpath(xpath)).clear();
        element(By.xpath(xpath)).type(text);
    }

    public void clickObject(String object) throws InterruptedException {
        String xpath = "//*[text()='" + object + "']";
        waitFor(xpath);
            element(By.xpath(xpath)).click();
    }

    public void selectDropdown(String value) throws InterruptedException {
        String xpath = "//*[@value='" + value + "']";
        waitFor(xpath);
        element(By.xpath(xpath)).click();
    }
}
