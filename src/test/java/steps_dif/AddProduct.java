package steps_dif;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Page_objets.AddProductPageClass.*;
import static modules.Hooks.webDriver;

public class AddProduct {
    @Given("The Browser and URL of the site are open and i'm in Main page")
    public void OpenBrowser() {
        webDriver.get("http://automationpractice.com/index.php");
    }

    @When("i clicked to the product")
    public void ProductClick() {
    }

    @And("i changed the property like the Quantity to {string} and i clicked to Add to cart")
    public void ChangedTheQuantity(String arg0) throws InterruptedException {
        AddTocart(arg0);
    }

    @Then("we will see the message Product successfully added to your shopping cart")
    public void MessageCheck() throws InterruptedException {
        Check();
    }
}
