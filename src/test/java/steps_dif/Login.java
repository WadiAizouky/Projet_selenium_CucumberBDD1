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

public class Login {
    @Given(": the Browser and URL of the site is open")
    public void OpenBrowser() {
    }

    @When(":write Username with <wadi.aizoukyu@gmail.com> and Password with <arg{int}> in textbox")
    public void WriteInfo(int arg0) {
    }

    @And(":i clicked to button login")
    public void Login_click() {
    }

    @Then(":i should login in in the name <Wadi Aizouky>")
    public void Check_login() {
    }

}
