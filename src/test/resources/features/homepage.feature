Feature: search Functionality with valid data

  @systemTest
  Scenario Outline: search Functionality
    Given open the browser
    Then enter the "https://www.smartbazaar.co.uk/"
    And Enter <search> data
    When click on search icon
    Then verification the data is correct
    And close browser

    Examples:
      | search |
      | rice   |
      | oil    |


