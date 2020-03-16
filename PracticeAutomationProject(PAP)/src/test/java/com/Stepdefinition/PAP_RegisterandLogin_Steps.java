package com.Stepdefinition;

import java.io.IOException;

import com.Excelutility.ExcelData;
import com.Pages.PAP_RegisterAndLogin;


public class PAP_RegisterandLogin_Steps 
{
	//Object creation for calling class
	PAP_RegisterAndLogin rl = new PAP_RegisterAndLogin();
	ExcelData ed = new ExcelData();
	
	@Given("^The user Launch the Chrome Browser$")
	public void the_user_Launch_the_Chrome_Browser()  
	{
	    rl.launchurl();
	}

	@When("^The user Opens the Practice Automation Testing Website$")
	public void the_user_Opens_the_Practice_Automation_Testing_Website() 
	{
	    rl.OpenPAPWebsite();
	}

	@Then("^The user Click My Account link$")
	public void the_user_Click_My_Account_link()  
	{
	    rl.myaccount();
	}

	@Then("^Enter email id and password in Register$")
	public void enter_email_id_and_password_in_Register() 
	{
		rl.regemailandpass();
	}

	@Then("^Click on the Register button$")
	public void click_on_the_Register_button() throws InterruptedException 
	{
	    rl.registerbutton();  
	}
	
	@Then("^The user navigates back and again clicks my account link$")
	public void the_user_navigates_back_and_again_clicks_my_account_link() 
	{
		 rl.clickagainmyaccount();
	}

	@Then("^The user type the registered email id and password in Login Click on the Login button$")
	public void the_user_type_the_registered_email_id_and_password_in_Login_Click_on_the_Login_button() throws Exception 
	{
		
		rl.loginemailandpass();
		
	}

}
