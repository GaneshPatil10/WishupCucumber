Feature:Login Page Feature

Scenario: Validate login page
Given User is on login page
Then Login page title is displayed as "Wishup App"
And Login page URL is displayed as "https://app-dev.wishup.co/login"
And Wishup logo is displayed
And Login option on corner is displayed
And Signup option on corner is displayed
And Login screen is displayed
And Sign in with Google option is displayed
And Email address field is displayed
And Password field is displayed
And Login button is displayed
And Forget your password? is displayed
And Click here to signup option is displayed


Scenario Outline: Login Pass
Given User is on login page
When User enters <USERID> in Email address field
And User enters <PASSWORD> in password field
And Clicks on login button
Then Home page title is displayed as "Wishup App"
And Home page URL is displayed as "request=true"

Examples:
						|USERID|PASSWORD|
	|"wishup_testuser1@gmail.com"|"testpw1"|
	|"wishup_testuser3@gmail.com"|"testpw3"|
	|"wishup_testuser4@gmail.com"|"testpw4"|
	
Scenario Outline: Login Fail
Given User is on login page
When User enters <USERID1> in Email address field
And User enters <PASSWORD1> in password field
And Clicks on login button
Then Home page title is displayed as "Wishup App"
And Home page URL is displayed as "request=true"

Examples:
						|USERID1|PASSWORD1|
	|"wishup_testuser2@gmail.com"|"testpw2"|