package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;

public class BrowserFactory {
    static WebDriver factoryDriver;
    static HashMap<String,String> proretiesHash = Proerties.Read("src\\test\\resources\\enveriments\\config.properties");
    static String browserName = proretiesHash.get("navigater");
    static Boolean IsHeadless = Boolean.valueOf(proretiesHash.get("Headless"));

    public static WebDriver get_driver(){
        switch (browserName){
            case "chrome": WebDriverManager.chromedriver().setup();
                ChromeOptions option = new ChromeOptions();option.setHeadless(IsHeadless);//option.addArguments("--hide-icons");
                factoryDriver = new ChromeDriver(option);
                break;
            case "firfox":WebDriverManager.firefoxdriver().setup();
                factoryDriver = new FirefoxDriver();break;
            case "Edge":WebDriverManager.edgedriver().setup();
                factoryDriver = new EdgeDriver();break;
        }
        return factoryDriver;
    }
}
