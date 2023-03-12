@employee
Feature: Employee login
  Employee Create Purchase Invoice

  Scenario Outline: Login as employee
    Given user at login page
    When user enters "<employee>" username
    And user enters password
    Then user clicks login button

    Given user should be logged in
    When user clicks invoices
    Then user clicks purchase invoice
    Then user click create purchase invoice
    Then user creates new purchase invoice

    Examples:
      | employee               |
      | employee@greentech.com |
      | employee@bluetech.com  |
