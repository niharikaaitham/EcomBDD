Feature: Validate Velocity Ecom Application Dashboard
  Scenario: Validate Dashboard
    Given user clicks on admin button on VelocityEcom application
    When user enters username as "9923478751" on VelocityEcom application
    And user enters password as "Velocity@123" on VelocityEcom application
    And user clicks on access dashboard button on VelocityEcom application
    Then user navigates to dashboard page and validates details

  Scenario: Validate Inventory update details
    Given user clicks on admin button on VelocityEcom application
    When user enters username as "9923478751" on VelocityEcom application
    And user enters password as "Velocity@123" on VelocityEcom application
    And user clicks on access dashboard button on VelocityEcom application
    And user clicks on Inventory update on VelocityEcom application
    Then user navigates to Inventory update page and validates details