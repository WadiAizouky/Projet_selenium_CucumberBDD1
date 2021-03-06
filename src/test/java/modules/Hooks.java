package modules;

import Page_objets.AddProductPageClass;
import Page_objets.CheckOutPageClass;
import Page_objets.LoginPagClass;
import Page_objets.SearchPageClsee;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static utils.BrowserFactory.get_driver;

public class Hooks {
    public static WebDriver webDriver;
    public static LoginPagClass LoginInstance = new LoginPagClass();
    public static SearchPageClsee searchInstance = new SearchPageClsee();
    public static AddProductPageClass AddProductInstance = new AddProductPageClass();
    public static CheckOutPageClass CheckClassInstance = new CheckOutPageClass();

    @Before
    public void Setup(){
        webDriver = get_driver();
        PageFactory.initElements(webDriver,LoginInstance);
        PageFactory.initElements(webDriver,searchInstance);
        PageFactory.initElements(webDriver,AddProductInstance);
        PageFactory.initElements(webDriver,CheckClassInstance);
    }

    @After
    public void finish(){
        webDriver.quit();
    }
}
