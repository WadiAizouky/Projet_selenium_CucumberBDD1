package steps_dif;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Page_objets.CheckOutPageClass.*;
import static modules.Hooks.webDriver;

public class CheckOut {

    @Given("The site open and we have tow products in the cart and we are singed in")
    public void Openbrowser() {
        webDriver.get("http://automationpractice.com/index.php");
    }

    @When("i click check out and i click start the procces")
    public void Start() throws InterruptedException {
        StartPayment();
    }

    @And("i select the delivery address and i agree the Terms of service")
    public void Deliverycheck() throws InterruptedException {
        Thread.sleep(2000);
        Deliveryconf();
    }

    @And("i checked the price total and i select the payment method")
    public void Paymentmethod() throws InterruptedException {
        Thread.sleep(2000);
        MethodPayment();
    }

    @Then("i should see the message Your order on My Store is complete that mean the payment procces is completed")
    public void check() throws InterruptedException {
        Thread.sleep(2000);
        CheckPayment();
    }
}
