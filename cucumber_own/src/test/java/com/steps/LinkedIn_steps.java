package com.steps;

import com.main.LinkedIn;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LinkedIn_steps {
	LinkedIn link=new LinkedIn();
	@Given("launch an linkedin page")
	public void launch_an_linkedin_Webpage() throws Throwable {
		link.url();
	    
	}
//
//	@When("the user opens linkedin signin")
//	public void the_user_opens_linkedin_homepage() throws Throwable {
//		link.linkedin_signin();
//	  
//	}

	@Then("verify username")
	public void verify_login() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
	    link.username();
	}
	@Then("verify password")
	public void verify_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   link.password();
	}

	@And("click the submit")
	public void click_the_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  link.submit();
	}

}
