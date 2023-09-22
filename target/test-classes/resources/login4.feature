
Feature: Login Feature
  As a user, I want to log in to the application.

  @smoke
  Scenario: Valid Login
    Given I am on the login page
    When I enter valid credentials
    Then I should be logged in successfully

  @sanity
  Scenario: Invalid Login
    Given I am on the login page
    When I enter invalid credentials
    Then I should see an error message
@Regression @smoke
  Scenario: Password Reset
    Given I am on the login page
    When I click on the "Forgot Password" link
    Then I should be redirected to the password reset page
