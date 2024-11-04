Feature: Registration of new User
  Scenario: Enter all the mandatory field and submit the user details
  Given I am on a new user registration page
  When I enter valid data on the page
		| Fields                 | Values              |
		| First Name             | Tom                 |
		| Last Name              | Kenny               |
		| Email Address          | someone@someone.com |
		| Re-enter Email Address | someone@someone.com |
		| Password               | Testing123$@        |
		| Birthdate              | 01                  |
	Then the user registration should be successful.
 