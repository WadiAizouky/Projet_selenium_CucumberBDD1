package Page_objets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class SearchPageClsee {
    //Elements
    @FindBy(id = "search_query_top")
    private static WebElement Textarea;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")
    private static WebElement SearchBtn;

    //@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")
    //private static WebElement Checkelem;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li")
    private static List<WebElement> ListElements;

    //search method for *name
    public static void search(String name) throws InterruptedException {
        Thread.sleep(2000);
        Textarea.sendKeys(name);
        SearchBtn.click();
    }

    //Verified method if element exist in the page
    public static void CheckPassed(String name) throws InterruptedException {
        Thread.sleep(2000);
        //Assert.assertEquals(Checkelem.getText(),name);
        Assert.assertEquals(ListElements.size(),1);
    }

    //Verified method if element not exist in the page
    public static void CheckNotPassed(String name) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(ListElements.size(),0);
    }
}
