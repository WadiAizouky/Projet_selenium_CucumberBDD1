package steps_dif;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import  static Page_objets.SearchPageClsee.*;

import static modules.Hooks.webDriver;

public class Search_passed {
    @Given("the Browser and URL of the site is open and i'm in Main page")
    public void OpenBrowser() {
        webDriver.get("http://automationpractice.com/index.php");
    }

    @When("i enterd the word {string} in the textarea")
    public void Search(String arg0) throws InterruptedException {
        search(arg0);
    }

    @And(":i clicked to button search")
    public void SerachClick() {
        System.out.println("Clicke serach");
    }

    @Then("i will see the word {string} in the result")
    public void ResulChecked(String arg0) throws InterruptedException {
        CheckPassed(arg0);
    }

}
