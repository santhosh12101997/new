@PracticeAutomation
Feature: Practice Automation Testing Website

@TC-01RegisterandLogin
Scenario: Register and Login in Practice Automation Testing Website
Given The user Launch the Chrome Browser
When The user Opens the Practice Automation Testing Website
Then The user Click My Account link
Then Enter email id and password in Register
Then Click on the Register button
Then The user navigates back and again clicks my account link
Then The user type the registered email id and password in Login Click on the Login button

@TC-02Shoptheproduct
Scenario: Shop the Product in Practice Automation Project Testing Website
Given The user Launch Chrome Browser
When The user Opens Practice Automation Testing Website
Then Click My Account link and enter valid login details
Then Click address and enter billing details
Then Click Shop Link
Then Select sort by newness from sorting
Then Click Functional Programming js book and click add to basket
Then Click HTML web app development book and click add to basket
Then Click add to cart link and click proceed to checkout
