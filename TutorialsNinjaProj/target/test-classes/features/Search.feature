@all
Feature: search functionality
# the below feature file is about search thhe product in application (comment in feature file is defined as ash)
#to understand the underline feature
#if u dont want to run some steps for execution...

@search @validproduct @smoke @regression 
Scenario: search for valid product
Given User opens the Application
When User enter valid product into search field
And User click on search button
Then valid product should get displayed in search results


@search @nonexistingproduct @regression 
Scenario: search for a non existig product
Given User opens the Application
When user enters non existin product into ssearch field 
And User click on search button
Then proper text informing user about no product matching should be displayed

@serch @noproduct @regression
Scenario: search without providing any product
Given User opens the Application
And User dont enter any product name
Then proper text informing user about no product matching should be displayed
