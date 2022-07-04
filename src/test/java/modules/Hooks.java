package modules;

import Page_objets.LoginPagClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static utils.BrowserFactory.get_driver;

public class Hooks {
    public static WebDriver webDriver;
    public static LoginPagClass LoginInstance = new LoginPagClass();

    @Before
    public void Setup(){
        webDriver = get_driver();
        PageFactory.initElements(webDriver,LoginInstance);
    }

    @After
    public void finish(){
        webDriver.quit();
    }
}
