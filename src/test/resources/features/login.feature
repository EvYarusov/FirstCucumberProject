Feature: Login

  @validData
  Scenario: Login with valid data
    Given User launches Chrome Browser
    When User opens PhoneBook Home Page
    And User clicks on LOGIN link
    And User enters valid data
    And User clicks on Login button
    Then User verifies SignOut button is displayed
    And User quites browser

  @wrongPassword
  Scenario Outline: Login with valid email and wrong password
    Given User launches Chrome Browser
    When User opens PhoneBook Home Page
    And User clicks on LOGIN link
    And User enters valid email and wrong password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Login button
    Then User verifies Alert is appeared
    And User quites browser
    Examples:
      | email             | password  |
      | manul-j@gmail.com | Manul1234 |
      | manul-j@gmail.com | Manul$    |