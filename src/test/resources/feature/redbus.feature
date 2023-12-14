Feature: Test Redbus

  Scenario: verify tabs
    Given open website "redbus"
    Then find below tabs
      | Bus Tickets   |
      | Cab Rental    |
      | Train Tickets |
    Then verify image header
    Then verify search buses
    
    Scenario: verify Cancel Ticket
     Given open website "redbus"
    When clicked on "Account"
    Then clicked on "Cancel Ticket"
    Then verify image Cancel Ticket
    
    Scenario: verify cab Rental page
    Then clicked on "Cab Rental"
    Then verify image Cab Rental
    
    