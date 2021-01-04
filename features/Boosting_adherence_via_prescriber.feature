Feature: Test Boosting adherence via prescriber

  @tag3
  Scenario: Test Boosting adherence via prescriber form
    Given I open connetiverx Website
    And I click on Resources
    And I verify the Boosting adherence via prescriber text
    And I click on Boosting adherence via prescriber link
    When I fillup the form
    Then I click on Submit & download button
