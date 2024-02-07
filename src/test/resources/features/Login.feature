Feature: Login Functionality

  @sprint1 @regression @smoke
  Scenario: Valid admin login
    #Given user is navigated to HRMS application
    When user enters admin username and password
    And user clicks on login button
    Then user is successfully logged in


  @error   @regression
  Scenario Outline: Validating the error message
    When user enters "<username>" and "<password>" and verify the "<errorMessage>"
    Examples:
      | username | password | errorMessage |
      |admin     |vnddd      |Invalid credentials|
      |vvnnfnf   |Hum@nhrm123|Invalid credentials|
      |          |Hum@nhrm123|Username cannot be empty|
      |admin     |           |Password cannot be empty|

    #intentionally entering the wrong data to do the negative testing
  #in stead of -Username cannot be empty, we write-Username cannot b empty
  # it gives the message what was the expected result and what is the actual


