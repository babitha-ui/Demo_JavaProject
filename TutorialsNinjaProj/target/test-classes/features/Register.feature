@all
Feature: User Registration

Background:
Given User navigate to Register Account page
And Click on continue button

@register @mandatoryfields @smoke @regression @dev @ignore
Scenario: Register with mandatory fields
When User enters below details into mandatory fields
|firstname      |babitha|
|lastname       |jamanjyothi|
|email          |babitha.viswanath@gmail.com|
|telephone      |123456789|
|password       |12345|
#When User enters firstname "babitha" into the First name field
#And Enters lastname "jamanjyothi" into Last name field
#And Enters email "babitha.viswanath@gmail.com" into Email field
#And Enters telephone "123456789" into the Telephone field
#And Enters password "password" into the password field
#And Enters password "12345" into Confirm password field
And Selects privacy policy field
Then Account should get successfully created

@register @allfields @smoke @regression @wip
Scenario: Register with all fields

When User enters below details into mandatory fields
|firstname      |babitha|
|lastname       |jamanjyothi|
|email          |babitha.viswanath@gmail.com|
|telephone      |123456789|
|password       |12345|
#When User enters firstname "babitha" into the First name field
#And Enters lastname "jamanjyothi" into Last name field
#And Enters email "babitha.viswanath@gmail.com" into Email field
#And Enters telephone "123456789" into the Telephone field
#And Enters password "12345" into the password field
#And Enters password "12345" into Confirm password field
And select Yes for Newsletter
Then Account should get successfully created

@register @nofields  @regression
Scenario: Register without providing any fields

When User dont enter details into any fields
Then warning mmessages should be displayed for the mandatory fields

@register @duplicateemail  @regression
Scenario: Register with Duplicate email Address 
When User enters below details into mandatory fields
|firstname      |babitha|
|lastname       |jamanjyothi|
|email          |babitha.viswanath@gmail.com|
|telephone      |123456789|
|password       |12345|
#When User enters firstname "babitha" into the First name field
#And Enters lastname "jamanjyothi" into Last name field
#And Enters email "amotooricap9@gmail" into Email field
#And Enters telephone "123456789" into the Telephone field
#And Enters password "12345" into the password field
#And Enters password "12345" into Confirm password field
And select Yes for Newsletter
And Selects privacy policy field
Then Account should get successfully created