package TestCasesPakage;

import FrameWorkHelperPackage.DesireCapabilitiesClass;
import WebPagesUIPackage.LoginAsEmployeeWebPageUI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginAsManager extends DesireCapabilitiesClass {

    @Test
    public void  LoginUserTestCase() throws InterruptedException {
        //Object created of the LoginAsManagerWebPage
        LoginAsEmployeeWebPageUI webpage = PageFactory.initElements(driver, LoginAsEmployeeWebPageUI.class);
        webpage.Login("Test_manager@demo.com", "DemoManager01!");
        //return driver;

    }
}
