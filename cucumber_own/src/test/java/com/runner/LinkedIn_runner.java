package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class LinkedIn_runner {
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/main/resources/features/Own.feature",
			plugin = {"pretty", "html:reports/cucumber-html-report"},
			tags = {"@tc02"},
			glue = {"steps"},
			monochrome = true
			)

	public class Google_runner
	{
		
	}

}
