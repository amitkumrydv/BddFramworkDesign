package com.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features=".//Features//Login.feature",
		glue="com.stepDefination",
		dryRun=false,                          // it is cross check all feature steps in com.stepDefination or not
		monochrome=true,                     // it will remove unnecessary charechter from console
		plugin = {"pretty", "html:test-output"}
		
		
		
		
		
		)






public class TestRunner {

}
