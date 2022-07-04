package Page_objets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AddProductPageClass {
    //Pages elements

    @FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")
    private static WebElement ProductBtn;

    @FindBy(id="quantity_wanted")
    private static WebElement Qantity;

    @FindBy(xpath="//p[@id='add_to_cart']/button")
    private static WebElement AddBtn;

    @FindBy(xpath="//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/h2[1]")
    private static WebElement Message;

    public static void AddTocart(String Qanty) throws InterruptedException {
        Thread.sleep(2000);
        ProductBtn.click();
        Thread.sleep(2000);
        Qantity.sendKeys(Qanty);
        AddBtn.click();
    }

    public static void Check() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(Message.getText(),"Product successfully added to your shopping cart");
    }

}
