package steps_dif;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Page_objets.LoginPagClass.CheckLoginNonPassant;
import static Page_objets.LoginPagClass.Login;
import static modules.Hooks.webDriver;

public class Login_Not_passed {
    @Given(": The Browser and URL of the site is open")
    public void theBrowserAndURLOfTheSiteIsOpen() {
        webDriver.get("http://automationpractice.com/index.php");
    }

    @When(":Write Username with {string} and Password with {string} in textbox")
    public void writeUsernameWithAndPasswordWithInTextbox(String arg0, String arg1) throws InterruptedException {
        Login(arg0,arg1);
    }

    @And(":When i clicked to button login")
    public void whenIClickedToButtonLogin() {
        System.out.println("Clicke login");
    }

    @Then(":The error message should appear {string}")
    public void theErrorMessageShouldAppear(String arg0) throws InterruptedException {
        System.out.println("Nonpassant");
        CheckLoginNonPassant(arg0);
    }
}