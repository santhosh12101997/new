@Own_Feature 
Feature: LinkedIn website
@tc01 
Scenario: 
	Check that able to join LinkedIn

	Given launch an linkedin page 
	
	Then enter username
	Then enter password
	And click the join 
	
@tc02 
Scenario: 
	Check that able to login LinkedIn

	Given launch an linkedin Webpage 
	
	Then verify username
	Then verify password
	And click the submit 