package com.steps;

import com.main.LinkedIn_join;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LinkedInJoin_steps {
	LinkedIn_join link=new LinkedIn_join();
	@Given("launch an linkedin Webpage")
	public void launch_an_linkedin_Webpage() throws Throwable {
		link.url();
	    
	}
//	@When("the user opens linkedin join")
////	public void the_user_opens_linkedin_join() throws Throwable {
////	    // Write code here that turns the phrase above into concrete actions
////		
////		link.linkedin_join();
////	}

	@When("enter username")
	public void enter_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		link.username();
	}

	@Then("enter password")
	public void enter_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 link.password();
	}

	@And("click the join")
	public void click_the_join() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    link.join();
	}


}
