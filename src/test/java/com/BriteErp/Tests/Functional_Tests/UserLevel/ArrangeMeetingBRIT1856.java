package com.BriteErp.Tests.Functional_Tests.UserLevel;

import com.BriteErp.Utilities.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrangeMeetingBRIT1856 extends TestBase {
    @Test
    public void arrangeMeeting(){

        //1. Open browser
        //2. Go to url http://52.39.162.23
        //3. Login as any valid user
        pages.login().login(ConfigurationReader.getProperty("Uusername"), ConfigurationReader.getProperty("Upassword"));

        //4.Click on CRM module
        BrowserUtils.hover(pages.crm().CRMheader);
        BrowserUtils.waitForVisibility(pages.crm().CRMheader, 20);
        pages.crm().CRMheader.click();

        //5. Click on Customers header
        BrowserUtils.hover(pages.crm().customersHeader);
        BrowserUtils.waitForVisibility(pages.crm().customersHeader, 20);
        pages.crm().customersHeader.click();
        //6. Click on Create button
        BrowserUtils.explicitWaitTitleIs(20, ApplicationConstants.CUSTOMERSTITLE);
        pages.customer().customerCardCreateButton.click();

        BrowserUtils.explicitWaitTitleIs(20, ApplicationConstants.NEWTITLE);

        /**
         * Here starts test steps
         */

        //1.Step. Click on a meeting link. Verify that the title contains "Meetings"
        pages.customer().nameField.sendKeys("Saya-Company");
        pages.meetingPage().meetingLink.click();
        BrowserUtils.wait(25);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Meetings"));

        //2. Step. Click on a week button. Click on a specific date to arrange a meetings.
         pages.meetingPage().weekLink.click();
         pages.meetingPage().arrowButton.click();


        //3. Step. Click on a past date to make a meeting. Verify that a User is not able to do it
        pages.meetingPage().date.click();
        BrowserUtils.wait(20);
        Assert.assertTrue(pages.meetingPage().date.isDisplayed());
        pages.meetingPage().invalidEventDate.click();
        //BrowserUtils.waitForVisibility(pages.meetingPage().createMeetingButton, 25);
        pages.meetingPage().createMeetingButton.click();
         pages.meetingPage().createMeetingButton.sendKeys("Invalid meeting");

        //4. Step. Click on Invalid Meeting. Verify that a User is able to delete it
        pages.meetingPage().invalidEventDate.click();
        pages.meetingPage().deleteButton.click();
        pages.meetingPage().okButtonForDeleting.click();




    }
}
