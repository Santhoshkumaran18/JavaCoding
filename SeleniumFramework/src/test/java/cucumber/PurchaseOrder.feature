@tag
Feature: Purchase the order from the ecommerce site
  I want to use this template for my feature file

  Background: 
    Given I landed on the ecommerce page

  @Regression
  Scenario Outline: Positive test of submitting the order
    Given Logged in with the username <name> and password <password>
    When I add the product <productName> from cart
    And checkout <productName> and submit the order
    Then "THANKYOU FOR THE ORDER." message is displayed on the confirmation page

    Examples: 
      | name                         | password       | productName |
      | santhoshkumaran@santhosh.com | December2024@$ | ZARA COAT 3 |
