@all
Feature: User Login
Register user able to login to access account details

Background:
Given User navigate to Login page

@login @validcredentials @smoke @regression
Scenario Outline: Login with valid credentials

When User enters valid email address <email>
And Enters valid password <password>
And Clicks on Login button
Then User should Login successfully
Examples:
|email                 |password|
|amotooricap9@gmail.com|12345   |
|amotooricap3@gmail.com|12345   |
|amotooricap1@gmail.com|12345   |

@login @invalidcredential @smoke @regression
Scenario: Login with invalid credentials

When User enters invalid email address "babitha.viswanath1234@gmail.com"
And Enters invalid password "123456"
And Clicks on Login button
Then User should get proper warning message


@login @validemailandinvalidpassword @regression
Scenario: Login with valid email address and invalid password

When User enters valid email address "babitha.viswanath@gmail.com"
And Enters invalid password "123456"
And Clicks on Login button
Then User should get proper warning message

@login @invalidemailandvalidpassword @regression
Scenario: Login with invalid email address and valid password

When User enters valid email address "babitha.viswanath1234@gmail.com"
And Enters invalid password "12345"
And Clicks on Login button
Then User should get proper warning message

@login @nocredentials @regression
Scenario: Login without providing any credentials

When User dont enters any credentials
And Clicks on Login button
Then User should get proper warning message

