package TestCasesPakage;

import FrameWorkHelperPackage.DesireCapabilitiesClass;
import WebPagesUIPackage.LeaveApproveWebPageUI;
import WebPagesUIPackage.RequestEmployeeLeaveWebPageUI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ApprovalOfleaves extends DesireCapabilitiesClass {

    @Test
    public void ApprovalForLeave() throws InterruptedException {
        //Object created of the LoginAsManagerWebPage
        LeaveApproveWebPageUI request = PageFactory.initElements(driver, LeaveApproveWebPageUI.class);
        request.ClickOnLeaves();
        request.ClickApproval();
        request.ClickOpenLeave();
        request.ClickonApprovepopup();

    }
}