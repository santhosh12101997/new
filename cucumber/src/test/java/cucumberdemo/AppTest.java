package cucumberdemo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class AppTest {
	/// I AM RUNNING WITH CUCUMBER CLASS
		@RunWith(Cucumber.class)
		@CucumberOptions(features="Feature/testcaseforAppTest.feature", glue="stepdefinition")
		public class AppTest_googlehomepage
		{
		}

}
