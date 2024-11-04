Feature: User Login on social networking site.
	Background: 
   User navigates to Facebook 
   Given I am on Facebook login page 
   
	# Scenario Outline example where we can run same set of testcases with multiple set of data
	#"Scenario Outline" is used for parameterized test cases where the same steps are executed with different sets of input data. 
  Scenario Outline: Login functionality for a social networking site - Facebook when incorrect username and incorrect password is given
    Given user navigates to Facebook
    When I enter Username as "<username>" and Password as "<password>"
    Then login should be unsuccessful.

    Examples: 
     | username  | password  |
		 | username1 | password1 |	
		 | username2 | password 2|
		 
	#Scenario with AND 
	Scenario: 
   When I enter username as "TOM"
   And I enter password as "JERRY" 
   Then Login should fail 

	#Scenario with BUT 
	Scenario: 
   When I enter username as "TOM" 
   And I enter password as "JERRY" 
   Then Login should fail 
   But Relogin option should be available
