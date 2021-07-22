#Author: Elian Blanco

@Regression
  Feature: Google search functionality
  I want test google search functionality

  @smoke
  Scenario: As a user I want to find Katalon Docs in google.com
    Given I go to google URL
    When I enter Katalon studio Docs in the search box
    And I click on the Search button
    Then I verify Katalon website is displayed


    