Feature: Login WebTable Functionality
  Agile Story: User should be able to login on the WebTable application with correct credentials

  Background: For all the scenarios user is open a chrome browser and go on the login page
    Given User is on the login page of Web table app

  Scenario: Login WebTable Functionality with hard coded implementation
    When User should enter correct username
    And User should enter correct password
    And User should click on login button
    Then User should see URL contains orders


  Scenario: Login WebTable Functionality with parameterized implementation
    When User should enter "Test" username and "Tester" password
    And User should click on login button
    Then User should see URL contains orders


  Scenario: Login WebTable Functionality with Data Tables implementation
    When User should enter below correct credentials
      |username|Test|
      |password|Tester|
    And User should click on login button
    Then User should see URL contains orders





