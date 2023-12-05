Feature: Test Amazon

  Scenario: verify tabs
    Given open website "redbus"
    Then find below tabs
      | Bus Tickets   |
      | Cab Rental    |
      | Train Tickets |
    When clicked on "Bus Tickets"
    When clicked on "Cab Rental"
    