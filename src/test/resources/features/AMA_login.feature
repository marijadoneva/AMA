Feature:Users should be able to login

  User Story:
  As a user, I should be able to login with correct credentials


  Background:
    Given user is on the login page

  Scenario: Verify user is able to login with correct credentials
    When user enters username
    And user enters password
    And user clicks on Sign in Button
    Then "Marija Doneva" user is logged in


  Scenario: Verify user is not able to login with leaving the username box empty
    When user leaves username box empty
    And user enters password
    And user clicks on Sign in Button
    Then user is able to see message "Username is required"


  Scenario Outline: Verify user can not log in using invalid credential
    When the user login with "<username>","<password>"
    And user clicks on Sign in Button
    Then the user should not be able to log in

    Examples:
      | username        | password      |  |  |
      | wrongUserName   | UserUser123   |  |  |
      | salesmanager101 | wrongPassword |  |  |

