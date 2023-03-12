@manager
Feature:  manager log in and approve

  Scenario Outline: Login as manager
    Given user at login page
    When user enters "<manager>" username
    And user enters password
    Then user clicks login button
    Then user should be logged in
    When check "<manager>" unapproved
    Examples:
      | manager               |
      | manager@greentech.com |
      | manager@bluetech.com  |
