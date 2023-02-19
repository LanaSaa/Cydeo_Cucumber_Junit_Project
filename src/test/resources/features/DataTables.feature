Feature: Cucumber Data Tables implementation practices


  Scenario: List of fruits and vegetables I like
    Then user should see below list
      | orange     |
      | apple      |
      | kiwi       |
      | strawberry |
      | tomato     |
      | pear       |
      | eggplant   |


  Scenario: List of type of pets we love
    Then user should see the following list
      | cats    |
      | dogs    |
      | birds   |
      | horses  |
      | fish    |
      | rabbits |
      | ferrets |


  Scenario: Officer reads data about driver
    Then officer is able to see any data he wants
      | name    | Jane          |
      | surname | Doe           |
      | age     | 29            |
      | address | somewhere     |
      | state   | CA            |
      | zipcode | 99999         |
      | phone   | 111-1111-1111 |

  @dataTable
  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |
