Feature: Forgot password functionality

Scenario: Reset password on fogotting it
Given User opens the Application
When User clicks on MyAccount
And Selects login option
And Clicks on Forgotten password option
And Enters valid email address
And Clicks on continue button
Then proper confirmation message should be displayed

