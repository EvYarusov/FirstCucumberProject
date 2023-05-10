Feature: Add Contact

  @validContactData
  Scenario: Add Contact with valid data
    Given User launches Chrome Browser
    When User opens PhoneBook Home Page
    And User clicks on LOGIN link
    And User enters valid data
    And User clicks on Login button
    And User clicks on ADD link
    And User enters valid data in Add contact form
    And User clicks on Save button
    Then User verifies Contact is added
    And User quites browser