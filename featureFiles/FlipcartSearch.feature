Feature: Get all links and print it on the console

  Scenario: Search the product and print it on the console
    Given I am in Flipkart home page
    When I search the product "iphone 15"
    And I click on search button
    Then I should get all the links present in that page and print it on the console
