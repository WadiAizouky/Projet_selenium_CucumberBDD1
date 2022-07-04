@AddProduct
Feature: Add one Product
  Add one product to the cart

  Scenario Outline: Add product to the cart and verifier
    Given The Browser and URL of the site are open and i'm in Main page
    When i clicked to the product
    And i changed the property like the Quantity to <arg0> and i clicked to Add to cart
    Then we will see the message Product successfully added to your shopping cart
    Examples:
      | arg0 |
      | "2"  |