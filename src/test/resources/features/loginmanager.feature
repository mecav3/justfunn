@manager
Feature:  manager log in and approve

  Scenario: Login as manager
    Given user at login page
    When user enters manager username
    And user enters password
    Then user clicks login button
    Then user should be logged in

    Scenario: check and approve invoice
      When check unapproved
