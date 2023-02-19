Feature: Login WebTable Functionality
  Agile Story: User should be able to login on the WebTable application

  Background: For all the scenarios user is open a chrome browser and go on the login page
    Given User is on the login page of Web table app

  Scenario: Login WebTable Functionality with hard coded implementation
    When User should enter correct username: Test
    And User should enter correct password: Tester
    Then User should see URL contains orders


  Scenario: Login WebTable Functionality with parameterized implementation
    When User should enter correct username: "Test"
    And User should enter correct password: "Tester"
    Then User should see URL contains orders


  Scenario Outline: Login WebTable Functionality with Data Tables implementation
    When User should enter correct username: "<username>"
    And User should enter correct password: "<password>"
    Then User should see URL contains orders


  Examples: User can enter different username and password
    |username|password|
    |Test12|Tester|
    |Test9|Tester|
    |Test6|Tester|




