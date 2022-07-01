package Page_objets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchClass {

    @FindBy(id = "L2AGLb")
    private static WebElement Accbtn;

    @FindBy(xpath = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
    private static WebElement TextSearch;

    @FindBy(xpath = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")
    private static WebElement SearchBtn;

    @FindBy(xpath = "//body[1]/div[7]/div[1]/div[10]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/h2[1]/span[1]")
    private static WebElement Text;


    public static void Search(String word){
        Accbtn.click();
        TextSearch.sendKeys(word);
        SearchBtn.click();
    }

    public static void verifierForWord(String word){
        Assert.assertEquals(Text.getText(), word);
    }
}
