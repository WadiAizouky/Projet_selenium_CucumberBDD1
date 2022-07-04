Feature: Search
  Search an element in the site

  Scenario Outline: Search an element exist
    Given the Browser and URL of the site is open and i'm in Main page
    When i enterd the word <arg0> in the textarea
    And :i clicked to button search
    Then i will see the word <arg0> in the result
    Examples:
      | arg0     |
      | "Blouse" |

  Scenario Outline: Search an element Not exist(Element not found)
    Given The Browser and URL of the site is open and i'm in Main page
    When I enterd the word <arg0> in the textarea
    And :I clicked to button search
    Then i will not see the word <arg0> in the result
    Examples:
      | arg0    |
      | "Grave" |
