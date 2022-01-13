package TestCasesPakage;

import FrameWorkHelperPackage.DesireCapabilitiesClass;
import WebPagesUIPackage.LoginAsEmployeeWebPageUI;
import WebPagesUIPackage.RequestEmployeeLeaveWebPageUI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RequestEmployeeLeave  extends DesireCapabilitiesClass {
    @Test
    public void  RequestForLeave() throws InterruptedException {
        //Object created of the LoginAsManagerWebPage
        RequestEmployeeLeaveWebPageUI request = PageFactory.initElements(driver, RequestEmployeeLeaveWebPageUI.class);
        request.ClickOnLeaves();
        request.ClickOnMyLeaves();
        request.ClickOnRequest();
        request.ClickOnDates();



    }
}
