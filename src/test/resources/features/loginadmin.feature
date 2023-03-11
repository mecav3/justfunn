
Feature: Account app login feature1
  User Story:  As a user, I should be able to login with correct credentials to different accounts.
  _And dashboard should be displayed.   Accounts are: root, admin, manager, employee

  Background: For following scenarios user should be in login page
    Given user at login page

  Scenario: Login as admin
    When user enters admin username
    And user enters password
    Then user clicks login button
    Then user should be logged in