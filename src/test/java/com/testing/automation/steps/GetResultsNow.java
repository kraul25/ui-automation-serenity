package com.testing.automation.steps;

import com.testing.automation.pages.GetResultsNowPage;
import io.cucumber.java.en.And;

public class GetResultsNow {

    GetResultsNowPage getResultsNowPage;

    @And("I type (.*) in company name field$")
    public void type_company_name(String object) throws InterruptedException {
        getResultsNowPage.typeCompanyName(object);
    }
}
