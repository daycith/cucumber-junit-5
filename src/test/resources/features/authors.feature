Feature: Authors endpoint
  Scenario: List all available authors
    When I fetch authors at at "/v1/authors"
    Then I should get a response with "ok" message