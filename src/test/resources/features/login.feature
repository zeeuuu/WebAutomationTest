@login
Feature: Login

  @valid-login
  Scenario: Login using valid username and password
    Given user is on login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    When user click login button
    Then user will redirect to homepage

  @invalid-login
  Scenario: Login using invalid username and password
    Given user is on login page
    And user input username "standard_user"
    And user input password "invalid"
    When user click login button
    Then user able to see error message "Epic sadface: Username and password do not match any user in this service"