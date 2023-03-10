Feature: CRM modules

  @snipets
  Scenario: Search modules
    When user is on the CRM Home page
    Then user login with valid credentials
    Then user should see click on the module
    Then verify the users see four options:
      | Message       |
      | Notifications |
      | Settings      |
      | Activity Stream |


