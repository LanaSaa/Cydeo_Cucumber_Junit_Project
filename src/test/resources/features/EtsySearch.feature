@etsy
Feature: Etsy Search Functionality
  Agile Story: User should be able to type any keyword and see relevant information

  Background: For all the scenarios user is on the home page of the etsy application
  Given User is on "https://www.etsy.com"

  Scenario: Etsy Title Verification
  Then User sees title is as expected
    # Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for
    #everyone

  Scenario: Etsy Search Functionality Title Verification without parameterization
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title

  Scenario: Etsy Search Functionality Title Verification with parameterization
  When User types "Wooden Spoon" in the search box
  And User clicks search button
  Then User sees "Wooden spoon - Etsy" is in the title