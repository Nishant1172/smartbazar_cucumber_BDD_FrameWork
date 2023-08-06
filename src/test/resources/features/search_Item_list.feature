Feature: search Functionality with valid data
  @regressionTest
 Scenario Outline: Search Functionality
   Given open the browser
   Then enter the "https://www.smartbazaar.co.uk/"
   And enter the '<search>' data
   When click on Search icon
   And user select '<search result>' from the someList
   Then user verifies the '<search result>'
   And close browser
   Examples:
     | search |  | search result            |
     | Rice   |  | Laila Basmati Rice (1kg) |

