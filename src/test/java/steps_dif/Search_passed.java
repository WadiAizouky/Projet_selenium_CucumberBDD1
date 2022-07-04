package steps_dif;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_passed {
    @Given("the Browser and URL of the site is open and i'm in Main page")
    public void theBrowserAndURLOfTheSiteIsOpenAndIMInMainPage() {
    }

    @When("i enterd the word {string} in the textarea")
    public void iEnterdTheWordInTheTextarea(String arg0) {
    }

    @And(":i clicked to button search")
    public void iClickedToButtonSearch() {
    }

    @Then("i will see the word {string} in the result")
    public void iWillSeeTheWordInTheResult(String arg0) {
    }

}
