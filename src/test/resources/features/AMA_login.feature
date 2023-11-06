@AMALogin

Feature:Users should be able to login
  User Story:
  As a user, I should be able to login with correct credentials

  Background:
    Given user is on the login page

  Scenario: Verify user is able to login with correct credentials


  When user enters username
    And user enters password
    And user clicks on Sign in Button

