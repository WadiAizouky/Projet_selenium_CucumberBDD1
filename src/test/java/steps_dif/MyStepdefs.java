package steps_dif;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import static modules.Hooks.webDriver;
import static Page_objets.SearchClass.Search;
import static Page_objets.SearchClass.verifierForWord;

public class MyStepdefs {

    @Given("open URL chrome")
    public void openURLChrome() {
        webDriver.get("https://www.google.com/");
    }

    @When("i tape the word {string} in search")
    public void iTapeTheWordInSearch(String arg0) {
        Search(arg0);
    }

    @And("i click on the search button")
    public void iClickOnTheSearchButton() {
        System.out.println("");
    }

    @Then("i will see the work {string} in the page")
    public void iWillSeeTheWorkInThePage(String arg0) {
        String word = arg0;
        verifierForWord(word);
    }

}
