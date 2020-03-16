package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Features/Testcase.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC-01RegisterandLogin"},
		glue = {"com.Stepdefinition"},
		monochrome = true
		)

public class PAP_RegisterandLogin_Runner 
{

}
