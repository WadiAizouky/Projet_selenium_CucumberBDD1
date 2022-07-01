@Login
Feature: Login
  Login to site with Username and Password

  Scenario Outline: Login to site
    Given : the Browser and URL of the site is open
    When :write Username with "arg0" and Password with "arg1" in textbox
    And :i clicked to button login
    Then :i should login in in the name <Wadi Aizouky>
    Examples:
      | arg0                    | arg1
      | wadi.aizoukyu@gmail.com | Wade11223344