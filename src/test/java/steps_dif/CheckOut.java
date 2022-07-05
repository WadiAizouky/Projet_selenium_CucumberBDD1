package steps_dif;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOut {

    @Given("The site open and we have tow products in the cart and we are singed in")
    public void Openbrowser() {
    }

    @When("i click check out and i click start the procces")
    public void Start() {
    }

    @And("i select the delivery adress and i agree the Terms of service")
    public void Deliverycheck() {
    }

    @And("i checked the price total and i select the payment method")
    public void Paymentmethod() {
    }

    @Then("i should see the message Your order on My Store is complete that mean the payment procces is completed")
    public void check() {
    }

}
