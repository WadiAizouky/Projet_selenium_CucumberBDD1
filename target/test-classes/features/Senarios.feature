Feature: Google Search
  Search in Google

  Scenario Outline: Search for google
    Given open URL chrome
    When i tape the word <arg0> in search
    And i click on the search button
    Then i will see the work <arg0> in the page
    Examples:
      | arg0     |
      | "Python" |
      | "Java"   |
      | "C#"     |
      |          |
      |          |
      |          |
      |          |
      |          |
      |          |
      |          |
      |          |