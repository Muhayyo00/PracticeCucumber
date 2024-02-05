Feature: Login Functionality

  @sprint1 @regression @smoke
  Scenario: Valid admin login
    Given user is navigated to HRMS application
    When the user enters admin username and password
    And user clicks on login button
    Then user is successfully logged in