Feature: Test about Connectiverx

  @tag2
  Scenario: Test connectiverx About
    Given I open Connectiverx website
    When I click on About
    And verify the information
    Then I close the website
