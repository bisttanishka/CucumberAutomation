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

Feature: Amazon login and sametime login senario
  @Sanity
  Scenario: Successful Login in Amazon
    Given User is in login page
    When the user enters phonenumber and password
    And user hit on login button
    Then user should be logged in

  @Smoke
 
  Scenario Outline: Successful Amazon login with parameter
    Given User is in Amazon login page
    When User enter valid <mobileNumber> and <password>
    And user click on sign in button
    Then user should be in amazon homepage
    Then user account name should be same as loggen in 
    
    Examples: 
    |mobileNumber|password|
    |"7300584041"|"Prinkle@1234"|

@Regression

  Scenario Outline: User Successful SAMETIME login 
    Given Person is in SAMETIME page
    When Person type valid <uName> and <pass>
    And Person click on sign 
    Then Person HomePageIsDisplayed
    Then Person logout
    
    Examples: 
    |uName|pass|
    |"adams8"|"samet1me"|
    |"adams9"|"samet1me"|
    
