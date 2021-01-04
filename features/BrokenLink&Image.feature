Feature: Test Broken Link & Image

  @tag4
  Scenario: Broken link & Image test
    Given I open connectiverx website
    When I verify links and image
    Then I close it
