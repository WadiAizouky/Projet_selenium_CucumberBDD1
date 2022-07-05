@CheckOut
Feature: Check out

  Scenario: we have 2 products in the cart and we will do check out
    Given The site open and we have tow products in the cart and we are singed in
    When i click check out and i click start the procces
    And i select the delivery adress and i agree the Terms of service
    And i checked the price total and i select the payment method
    Then i should see the message Your order on My Store is complete that mean the payment procces is completed