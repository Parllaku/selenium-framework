@AccountManagement
Feature: Account Management

  @createAccount-validEmail @regression
  Scenario Outline: Create an account using valid email address
    Given I am on create account page
    When I enter "<firstname>" "<lastname>" "<email>" "<password>" "<confirmpassword>"
    And I click on create an account
    Then My account Page is displayed


    Examples:
      | firstname | lastname | email                | password  | confirmpassword |
      | mike      | smith    | muke6.smith@live.com | Mike12345 | Mike12345       |


  @createAccount-duplicate
  Scenario Outline: Create an account - Duplicate account creation not allowed
    Given I am on create account page
    When I enter "<firstname>" "<lastname>" "<email>" "<password>" "<confirmpassword>"
    And I click on create an account
    Then error should pop up saying you already have account


    Examples:
      | firstname | lastname | email                | password  | confirmpassword |
      | mike      | smith    | muke9.smith@live.com | Mike12345 | Mike12345       |


  @unregistered-account
  Scenario Outline: Account Login-Unregistered customer should see an error message
    Given I am on Login page
    When I enter "<email>" "<password>"
    And I click on login button
    Then error should pop up saying you dont have ann account with us


    Examples:
      | email         | password   |
      | mike@live.com | Mike123456 |





  @registered-account @regression
  Scenario Outline: Account Login - Registered customer to login with their email and Password
    Given I am on Login page
    When I enter "<email>" "<password>"
    And I click on login button
    Then My account Page is displayed


    Examples:
      | email         | password   |
      | muke6.smith@live.com| Mike12345|


