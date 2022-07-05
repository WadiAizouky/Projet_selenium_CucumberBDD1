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

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/a[1]")
    private static WebElement MethodBtn;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]")
    private static WebElement OrderConfBtn;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/p[1]/strong")
    private static WebElement CheckBtn;


    public static void StartPayment() throws InterruptedException {
        Thread.sleep(2000);
        CheckoutBtn.click();
        ProceddTocheckoutBtn.click();
    }

    public static void Deliveryconf(){
        AddressBtn.click();
        AgreeBtn.click();
    }

    public static void MethodPayment(){
        MethodBtn.click();
        OrderConfBtn.click();
    }

    public static void CheckPayment(){
        Assert.assertEquals(CheckBtn.getText(),"that mean the payment procces is completed");
    }
}
