package WebPagesUIPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAsManagerWebPageUI {

    WebDriver driver;
    WebDriverWait wait;

    public LoginAsManagerWebPageUI(WebDriver driver)
    {
        this.driver= driver;
        wait = new WebDriverWait(this.driver,30);
    }

    //Find the web Elements of the Login page
    @FindBy(how= How.NAME,using="email")
    @CacheLookup
    WebElement username;
    @FindBy(how=How.NAME,using="password")
    @CacheLookup
    WebElement password;
    @FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/div/div[2]/div[1]/div/span/button/span")
    @CacheLookup
    WebElement LoginButton;


    /*public void setusername(WebElement userName)
    {
        this.username = userName;
    }*/


    public void Login(String name, String Password) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys(name);
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(Password);
        LoginButton.click();
        //Thread.sleep(10000);

    }

}
