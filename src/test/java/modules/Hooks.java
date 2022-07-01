package modules;

import Page_objets.SearchClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import static utils.BrowserFactory.get_driver;

import java.awt.print.PageFormat;

public class Hooks {
    public static WebDriver webDriver;
    public static SearchClass searchClassobjet = new SearchClass();

    @Before
    public void Setup(){
        webDriver = get_driver();
        //webDriver.manage().window().maximize();
        PageFactory.initElements(webDriver,searchClassobjet);
    }

    @After
    public void finish(){
        webDriver.quit();
    }
}
