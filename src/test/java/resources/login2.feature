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
  Scenario Outline: Successful Login for Amazon
    Given the user is on the login page of amazon
    When the user enters valid <username> and <passowrd>
    And clicks the submit button
    Then they should be logged in thorugh amazon
    And redirected to the home page
    Examples:
    |username| |passowrd|
    |"jeet" |  |"xyz"|