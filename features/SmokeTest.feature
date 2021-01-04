Feature: Test smoke on Connectiverx

  @tag1
  Scenario: Smoke Test on Connectiverx
    Given I open Chrome Browser
    When Type Connectiverx web address
    And verify learn more button
    And verify the title of the page
    Then I close the browser
