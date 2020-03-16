package com.Stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Pages.PAP_ShoptheProduct;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PAP_ShoptheProduct_Steps 
{
	PAP_ShoptheProduct sp= new PAP_ShoptheProduct();

	@Given("^The user Launch Chrome Browser$")
	public void the_user_Launch_Chrome_Browser() 
	{
	    sp.url();
	}

	@When("^The user Opens Practice Automation Testing Website$")
	public void the_user_Opens_Practice_Automation_Testing_Website()  
	{
	    sp.openwebsite();
	}

	@Then("^Click My Account link and enter valid login details$")
	public void click_My_Account_link_and_enter_valid_login_details() 
	{
	    sp.logindetails();
	}

	@Then("^Click address and enter billing details$")
	public void click_address_and_enter_billing_details()
	{
	    sp.fillbilldetails();
	}

	@Given("^Click Shop Link$")
	public void click_Shop_Link()  
	{
	    sp.shop();
	}

	@Then("^Select sort by newness from sorting$")
	public void select_sort_by_newness_from_sorting()
	{
	    sp.selectfromsort();
	}
	
	@Then("^Click Functional Programming js book and click add to basket$")
	public void click_Functional_Programming_js_book_and_click_add_to_basket()
	{
	    sp.funcprogbook();
	}

	@Then("^Click HTML web app development book and click add to basket$")
	public void click_HTML_web_app_development_book_and_click_add_to_basket() 
	{
	    sp.htmlwebappdvelop();
	}

	@Then("^Click add to cart link and click proceed to checkout$")
	public void click_add_to_cart_link_and_click_proceed_to_checkout() throws InterruptedException 
	{
	    sp.addtocart();
	}
}
