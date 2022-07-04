package steps_dif;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Page_objets.SearchPageClsee.*;
import static modules.Hooks.webDriver;

public class Search_Not_passed {
    @Given("The Browser and URL of the site is open and i'm in Main page")
    public void theBrowserAndURLOfTheSiteIsOpenAndIMInMainPage() {
        webDriver.get("http://automationpractice.com/index.php");
    }

    @When("I enterd the word {string} in the textarea")
    public void iEnterdTheWordInTheTextarea(String arg0) throws InterruptedException {
        search(arg0);
    }

    @And(":I clicked to button search")
    public void iClickedToButtonSearch() {
        System.out.println("Clicke serach");
    }

    @Then("i will not see the word {string} in the result")
    public void iWillNotSeeTheWordInTheResult(String arg0) throws InterruptedException {
        CheckNotPassed(arg0);
    }
}
