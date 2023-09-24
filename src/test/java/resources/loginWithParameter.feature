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

Feature: Login in Amzon with Parameter using secario outline and using example keyword
  Scenario Outline: Successful Amazon login with parameter
    Given User is in Amazon login page
    When User enter valid <mobileNumber> and <password>
    And user click on sign in button
    Then user should be in amazon homepage
    Then user account name should be same as loggen in 
    
    Examples: 
    |mobileNumber|password|
    |"7300584041"|"Prinkle@1234"|

    

  