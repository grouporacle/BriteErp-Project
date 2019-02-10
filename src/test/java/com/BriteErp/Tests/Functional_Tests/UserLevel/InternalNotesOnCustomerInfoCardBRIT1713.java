package com.BriteErp.Tests.Functional_Tests.UserLevel;

import com.BriteErp.Utilities.ApplicationConstants;
import com.BriteErp.Utilities.BrowserUtils;
import com.BriteErp.Utilities.ConfigurationReader;
import com.BriteErp.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InternalNotesOnCustomerInfoCardBRIT1713 extends TestBase {
    @Test
    public void customerCardOnWebsiteVerifyTest() {
        //1. Open browser
        // Go to url http://52.39.162.23
        //2. Login as any valid user
        pages.login().login(ConfigurationReader.getProperty("Uusername"), ConfigurationReader.getProperty("Upassword"));

        //3.Click on CRM module
        BrowserUtils.hover(pages.crm().CRMheader);
        BrowserUtils.waitForVisibility(pages.crm().CRMheader, 15);
        pages.crm().CRMheader.click();

        //4. Click on Customers header
        BrowserUtils.hover(pages.crm().customersHeader);
        BrowserUtils.waitForVisibility(pages.crm().customersHeader, 20);
        pages.crm().customersHeader.click();

        //5. Click on Create button
        BrowserUtils.explicitWaitTitleIs(20, ApplicationConstants.CUSTOMERSTITLE);
        BrowserUtils.waitForClickablility(pages.customer().customerCardCreateButton, 15);
        pages.customer().customerCardCreateButton.click();

        //6. Click on Internal notes, Verify Internal notes is clickable
        pages.internalPage().internalNotesLink.click();

        //7.Step. Enter txt messages in Internal notes
        pages.internalPage().interNoteField.sendKeys("Some txt messages");

        //8.Step. Click on save button. Verify a customer form will not be saved with empty fields
        pages.customer().saveButton.click();
        Assert.assertTrue(pages.opportunityPage().errorMsg.getText().contains("The following fields are invalid"));
    }
}
