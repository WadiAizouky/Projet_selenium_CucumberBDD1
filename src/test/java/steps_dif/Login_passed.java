package steps_dif;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Page_objets.LoginPagClass.Login;
import  static Page_objets.LoginPagClass.*;
import static modules.Hooks.webDriver;

public class Login_passed {
    @Given(": the Browser and URL of the site is open")
    public void OpenBrowser() {
        webDriver.get("http://automationpractice.com/index.php");
    }

    @When(":write Username with {string} and Password with {string} in textbox")
    public void WriteInfo(String arg0, String arg1) throws InterruptedException {
        Login(arg0,arg1);
    }

    @And(":i clicked to button login")
    public void Login_click() {
        System.out.println("Clicke login");
    }

    @Then(":i should login in in the name {string}")
    public void Check_login(String arg0) throws InterruptedException {
            System.out.println("passant");
            CheckLoginPassant(arg0);

    }
}
