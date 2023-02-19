Feature: Login WebTable Functionality
  Agile Story: User should be able to login on the WebTable application

  Background: For all the scenarios user is open a chrome browser and go on the login page
    Given User should open a chrome browser
    Then go to the login page

  Scenario: Login WebTable Functionality with hard coded implementation
    Then User should enter username: Test
    Then User should enter password: Tester
    And User sees page url is as expected
  #Expected: URL should end with “orders”

  Scenario: Login WebTable Functionality with parameterized implementation
    Then User should enter username: "Test"
    Then User should enter password: "Tester"
    And User sees page url is as expected
  #Expected: URL should end with “orders”

  Scenario Outline: Login WebTable Functionality with Data Tables implementation
    Then User should enter username: "<username>"
    Then User should enter password: "<password>"
    And User sees page url is as expected
  #Expected: URL should end with “orders”

  Examples: User can enter different username and password
    |username|password|
    |Test12|Tester|
    |Test9|Tester|
    |Test6|Tester|




