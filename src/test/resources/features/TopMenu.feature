@ProductTopMenu

  Feature: TopMenuProduct Functionality
    Scenario: The user should be able to reach productPage
    Given Midaxo Dashboard should be ready
    When the user click the Product TopMenu
    Then the user should see the product popupMenu
