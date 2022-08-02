@OrderManagement
  Feature: Order Management


    @createAccount-validEmail
    Scenario Outline: Create an account using valid email address
      Given I am on create account page
      When I enter "<firstname>" "<lastname>" "<email>" "<password>" "<confirmpassword>"
      And I click on create an account
      Then My account Page is displayed


      Examples:
        | firstname | lastname | email                | password  | confirmpassword |
        | mike      | smith    | muke6.smith@live.com | Mike12345 | Mike12345       |





    @OrderHistory-oneOrderAvailable
    Scenario Outline: Create one order on account
      Given I am on homepage
      When I add item on my basket
      When I go