Feature: login data
  Background:
    Given open the browser
    Then enter the "https://www.smartbazaar.co.uk/"

  Scenario Outline: Login with valid data
    Then Click on Login button link
    And enter the '<valid_Username>' and '<valid_password>'
    And click on Login
    And close browser
    Examples:
      | valid_Username        |  | valid_password |
      | 17sonupatel@gmail.com |  | India@1707     |


  Scenario Outline: Login with In-valid data
    Then Click on Login button link
    And enter the '<In-valid_Username>' and '<In-valid_password>'
    And click on Login
    And close browser
    Examples:
      | In-valid_Username     |  | In-valid_password |
      | pnishant663@gmail.com |  | 1245678           |