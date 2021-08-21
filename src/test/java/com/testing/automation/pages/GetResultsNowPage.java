package com.testing.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class GetResultsNowPage extends BasePage {

    @FindBy(name = "what_are_your_goals_")
    private WebElementFacade ATTRACT_MORE_PATIENTS_CHECKBOX;

    @FindBy(name = "type_of_organization")
    private WebElementFacade TYPE_OF_ORGANISATION_DROPDOWN;

    @FindBy(xpath = "//*[@value='Hospital/Health System']")
    private WebElementFacade SELECT_VALUE_HOSPITAL_HEALTH;

    @FindBy(id = "company-7a4140d0-a5e3-4e11-89da-df8453295b24")
    private WebElementFacade COMPANY_NAME;

    public void typeCompanyName(String object) {
        COMPANY_NAME.type(object);
    }
}
