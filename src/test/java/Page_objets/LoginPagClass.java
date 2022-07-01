package Page_objets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPagClass {

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    private static WebElement Login;

    @FindBy(id = "email")
    private static WebElement Username;

    @FindBy(id = "email")
    private static WebElement passwd;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]/i[1]")
    private static WebElement LoginBtn;

    @FindBy(css = "body.my-account.hide-left-column.hide-right-column.lang_en:nth-child(2) div.header-container div.nav:nth-child(2) div.container div.row nav:nth-child(1) div.header_user_info:nth-child(1) a.account > span:nth-child(1)")
    private static WebElement Checkbtn;

    public void Login(String unsername,String password){
        Login.click();
        Username.sendKeys(unsername);
        passwd.sendKeys(password);
        LoginBtn.click();
    }

    public void Check(String name){
        Assert.assertEquals(Checkbtn.getText(), name);
    }

}
