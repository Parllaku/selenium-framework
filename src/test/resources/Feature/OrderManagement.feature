@OrderManagement
  Feature: Order Management


    @CreateOrder
    Scenario Outline: Create one order on account
      Given I am on homepage
      When I add item on my basket
      And I go to my basked
      And I click on Checkout
      And I enter "<firstname>" "<lastname>" "<streetaddress>" "<selectCountry>" "<city>" "<zipcode>" "<phonenumber>"
      And I Click on shipping method
      And I click on next
      And I click on place order
      Then an order is placed



      Examples:
        | firstname | lastname | streetaddress   |selectCountry     | city      | zipcode         | phonenumber|
        | mike      | smith    | muke6.smit12344  |United Kingdom| Mike12345 | Mike12345       |12345678|




