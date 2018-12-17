
Feature: Mobile Feature

@ios-roll
Scenario: Verify image is present
#Given I am on a home page of the Diceapp
When I click on roll button
And I verify the image is displayed
#Then I verify dice is displayed
