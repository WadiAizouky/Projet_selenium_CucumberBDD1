package Page_objets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPagClass {

    //The objects
    @FindBy(className = "login")
    private static WebElement Login;

    @FindBy(id = "email")
    private static WebElement Username;

    @FindBy(id = "passwd")
    private static WebElement passwd;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]/i[1]")
    private static WebElement LoginBtn;

    @FindBy(xpath = "//a[@class='account']/span")
    private static WebElement Checkbtn;

    @FindBy(xpath = "//div[@class='alert alert-danger']/p")
    private static WebElement ErrerMessage;


    //the methodes
    //Login methode
    public static void Login(String unsername,String password) throws InterruptedException {
        Thread.sleep(2000);
        Login.click();
        Username.sendKeys(unsername);
        passwd.sendKeys(password);
        LoginBtn.click();
    }

    //Checked for testcase passed
    public static void CheckLoginPassant(String name) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(Checkbtn.getText(),name);
        Thread.sleep(5000);
    }

    //Checked for testcase not passed
    public static void CheckLoginNonPassant(String name) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(ErrerMessage.getText(),"There is 1 error");
        Thread.sleep(5000);
    }

}
