@Login
Feature: Login page validation

  Background: Login page validation
    Given I navigate to the login page

  @Login1
  Scenario: User Name cannot be empty
    Then verify that User Name cannot be empty

  @Login2
  Scenario: Password cannot be empty
    And verify that Password cannot be empty

  @Login3
  Scenario: User having User name: locked_out_user is not allowed to successfully login
    When user having username locked
    Then user is not allowed to successfully login

  @Login4
  Scenario: User Name is not one of the accepted user names of the site
    When user name is not the one accepted in the site
    Then user is not allowed to successfully login

  @Login5
  Scenario: password is not one of the accepted password of the site
    When password is not the one accepted in the site
    Then user is not allowed to successfully login

  @Login6
  Scenario: User Name and Password are accepted
    When user name and Password is correct
    Then use should allowed to login
