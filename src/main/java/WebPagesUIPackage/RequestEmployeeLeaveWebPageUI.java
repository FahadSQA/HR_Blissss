package WebPagesUIPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public class RequestEmployeeLeaveWebPageUI {

    WebDriver driver;
    WebDriverWait wait;

    public RequestEmployeeLeaveWebPageUI(WebDriver driver)
    {
        this.driver= driver;
        wait = new WebDriverWait(this.driver,90);
    }


    @FindBy(how= How.XPATH,using="//*[@id=\"leaves\"]/div[1]/div/div[2]")
    @CacheLookup
    WebElement ClickOnLeavesTitle;
    @FindBy(how=How.LINK_TEXT,using="My leaves")
    @CacheLookup
    WebElement Myleaves;
    @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div[2]/div/div[1]/div")
    @CacheLookup
    WebElement RequestNewLeave;

    @FindBy(how=How.XPATH,using="//*[@id=\"selectDays\"]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[4]/div[4]/div[5]")
    @CacheLookup
    WebElement Date1;

    @FindBy(how=How.XPATH,using=" //*[@id=\"selectDays\"]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[4]/div[4]/div[6]")
    @CacheLookup
    WebElement Date2;


   @FindBy(how=How.XPATH,using="/html/body/div[4]/div/div/div[2]/div[3]/div/div[1]/div/div/div[3]/div/div/div/div/button[2]")
   @CacheLookup
   WebElement approvebtn;

    @FindBy(how=How.XPATH,using="/html/body/div[4]/div/div/div[3]/div[1]/div/div[3]/button[2]")
    @CacheLookup
    WebElement OKbtn;



    //*[@id="modal_72"]/div[1]/div/div/div[3]/div/div/div/div/button[2]

    public void ClickOnLeaves() throws InterruptedException {
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOf(ClickOnLeavesTitle));
        ClickOnLeavesTitle.click();

    }

    public void ClickOnRequest()

    {
        wait.until(ExpectedConditions.visibilityOf(RequestNewLeave));
        RequestNewLeave.click();

    }
    public void ClickOnDates() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(Date1));
        Date1.click();
        wait.until(ExpectedConditions.visibilityOf(Date2));
        Date2.click();
        //Thread.sleep(5000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("scrollBy(0, 250)");
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        //Thread.sleep(5000);
        //from selenium.webdriver.common.keys import Keys


        //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("Request new leave"));

//Now find the element
        wait.until(ExpectedConditions.visibilityOf(approvebtn));
        approvebtn.click();

//Once all your stuff done with this frame need to switch back to default
        //actions.moveByOffset(200,400).click().perform();




//        WebElement scroll = driver.findElement(By.linkText("Request leave"));
//        scroll.sendKeys(Keys.PAGE_DOWN);
//        approvebtn.sendKeys(Keys.PAGE_DOWN);
//        wait.until(ExpectedConditions.elementToBeClickable(approvebtn));
//        approvebtn.clear();
//        approvebtn.sendKeys("Request leave");
       // wait.until(ExpectedConditions.visibilityOf(approvebtn));
       // approvebtn.click();
        Thread.sleep(5000);
        OKbtn.click();
        Thread.sleep(5000);
    }

    public void ClickOnMyLeaves()

    {
        wait.until(ExpectedConditions.visibilityOf(Myleaves));
        Myleaves.click();

    }

}

