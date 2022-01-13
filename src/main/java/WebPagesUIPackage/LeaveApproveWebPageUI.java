package WebPagesUIPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeaveApproveWebPageUI {

    WebDriver driver;
    WebDriverWait wait;

    public LeaveApproveWebPageUI(WebDriver driver)
    {
        this.driver= driver;
        wait = new WebDriverWait(this.driver,90);
    }


    @FindBy(how= How.XPATH,using="//*[@id=\"leaves\"]/div[1]/div/div[2]")
    @CacheLookup
    WebElement ClickOnLeavesTitle;
    @FindBy(how=How.XPATH,using="/html/body/div[1]/span/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[2]/a")
    @CacheLookup
    WebElement ClickOnApprovals;
    @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]/a")
    @CacheLookup
    WebElement openLeave;

    @FindBy(how=How.XPATH,using="//html/body/div[4]/div/div/div[2]/div[3]/div[1]/div/div/div[3]/div/div/div/div/button[2]")
    @CacheLookup
    WebElement Approvebtn;

    public void ClickOnLeaves() throws InterruptedException {
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOf(ClickOnLeavesTitle));
        ClickOnLeavesTitle.click();

    }

    public void ClickApproval()

    {
        wait.until(ExpectedConditions.visibilityOf(ClickOnApprovals));
        ClickOnApprovals.click();

    }

    public void ClickOpenLeave() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(openLeave));
        openLeave.click();
        Thread.sleep(5000);

    }

    public void ClickonApprovepopup() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(Approvebtn));
        Approvebtn.click();
        Thread.sleep(5000);

    }

}
