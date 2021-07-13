@Platform
Feature: Platform Page
  Scenario: The user should be able to reach Platform Page
    Given PlatformOverview Page should be ready
    When the user click the Platform Overview
    Then the user should see the product Platform Page