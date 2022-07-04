@Login
Feature: Login
  Login to site with Username and Password

  Scenario Outline: Login to site passed
    Given : the Browser and URL of the site is open
    When :write Username with <arg0> and Password with <arg1> in textbox
    And :i clicked to button login
    Then :i should login in in the name <arg01>
    Examples:
      | arg0                      | arg1           | arg01          |
      | "wadi.aizoukyu@gmail.com" | "Wade11223344" | "Wadi Aizouky" |

  Scenario Outline: Login to site failed
    Given : The Browser and URL of the site is open
    When :Write Username with <arg0> and Password with <arg1> in textbox
    And :When i clicked to button login
    Then :The error message should appear <arg01>
    Examples:
      | arg0              | arg1           | arg01   |
      | "samis@gmail.com" | "Wade11223344" | "Errer" |