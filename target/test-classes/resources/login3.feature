#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: User Login
Background:
Given the user is on the login page of Naukri
  Scenario Outline: Successful Login for Naukri
    When the user give credentails valid <id> and <passowrd>
    And clicks the login button
    Then they should be logged in thorugh Naukri
    And redirected to the home page of naukri
    Examples:
    |id| |passowrd|
    |"jeet" |  |"xyz"|
    
    
  Scenario Outline: Successful Login for Naukri2
    When the user enter valid <id> and <roll>
    And clicks the sign button
    
    Examples:
    |id| |roll|
    |"jeet" |  |"xyz"|