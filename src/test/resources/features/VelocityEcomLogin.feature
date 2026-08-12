Feature: Velocity Ecom Login
  Background:
    Given user is on ecom login page
  Scenario: user login as Admin
#    Given user is on ecom login page
    When user clicks on admin button
    And user enters username as "9923478751"
    And user enters password as "Velocity@123"
    And user clicks on access dashboard
    Then user navigates to dashboard page

    Scenario: user login as Customer
#      Given user is on ecom login page
      When user clicks on customer button
      And user enters username as "9923478751"
      And user enters password as "Velocity@123"
      And user clicks on access dashboard
      Then user navigates to products page

  Scenario Outline: login with multiple Admin users
    Given user is on ecom login page
    When user clicks on admin button
    And user enters username as "<username>"
    And user enters password as "<password>"
    And user clicks on access dashboard
    Then user navigates to dashboard page
    Examples:
    | username | password |
    | 1111111 | password1 |
    | 2222222 | password2 |
    | 3333333 | password3 |