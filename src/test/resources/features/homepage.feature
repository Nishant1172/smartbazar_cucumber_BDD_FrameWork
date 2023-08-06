Feature: search Functionality with valid data

  @systemTest
  Scenario Outline: Search Functionality
    Given open the browser
    Then enter the "https://www.smartbazaar.co.uk/"
    And Enter <search> data
    When clicking on Search icon
    Then verification the data is correct
    And close browser

    Examples:
      | search |
      | rice   |
      | oil    |


