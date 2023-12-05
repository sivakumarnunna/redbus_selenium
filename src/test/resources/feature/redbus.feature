Feature: Test Amazon

  Scenario: verify tabs
    Given open website "redbus"
    Then find below tabs
      | Bus Tickets   |
      | Cab Rental    |
      | Train Tickets |
    Then verify image header
    Then verify search buses
    Then clicked on "Cab Rental"
    Then verify image Cab Rental