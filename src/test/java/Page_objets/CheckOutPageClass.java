package Page_objets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckOutPageClass {

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]")
    private static WebElement CheckoutBtn;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]")
    private static WebElement ProceddTocheckoutBtn;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]")
    private static WebElement AddressBtn;

    @FindBy(xpath = "//input[@id='cgv']")
    private static WebElement AgreeBtn;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]")
    private static WebElement ProcedTocheckAfterAgree;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/p[1]/a[1]")
    private static WebElement MethodBtn;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]")
    private static WebElement OrderConfBtn;

    @FindBy(xpath = "//p[contains(text(),'Your order on My Store is complete.')]")
    private static WebElement CheckBtn;


    public static void StartPayment() throws InterruptedException {
        Thread.sleep(2000);
        CheckoutBtn.click();
        ProceddTocheckoutBtn.click();
    }

    public static void Deliveryconf() throws InterruptedException {
        AddressBtn.click();
        Thread.sleep(2000);
        AgreeBtn.click();
        ProcedTocheckAfterAgree.click();
        //Thread.sleep(4000);
    }

    public static void MethodPayment() throws InterruptedException {
        MethodBtn.click();
        Thread.sleep(2000);
        OrderConfBtn.click();
    }

    public static void CheckPayment(){
       Assert.assertEquals(CheckBtn.getText(),"Your order on My Store is complete.");
    }
}
