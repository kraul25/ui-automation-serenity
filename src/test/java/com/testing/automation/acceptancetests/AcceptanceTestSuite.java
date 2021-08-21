package com.testing.automation.acceptancetests;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/", glue="com.testing.automation", tags="@browser1", plugin = {"pretty","rerun:target_rerun/rerun.txt"})

public class AcceptanceTestSuite {

}
