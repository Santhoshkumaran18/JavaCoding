@tag
Feature: Purchase the order from the ecommerce site
  I want to use this template for my feature file

  @ErrorValidations
  Scenario Outline: Error validation of the ecommerce page
    Given I landed on the ecommerce page
    When Logged in with the username <name> and password <password>
    Then "Incorrect email or password." message is displayed

    Examples: 
      | name                         | password    | 
      | santhoshkumaran@santhosh.com | December202 | 
