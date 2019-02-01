package com.BriteErp.Tests.Functional_Tests;

import com.BriteErp.Utilities.ApplicationConstants;
import com.BriteErp.Utilities.BrowserUtils;
import com.BriteErp.Utilities.ConfigurationReader;
import com.BriteErp.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerCardOnWebsiteBRIT2005 extends TestBase {

    @Test
    public void customerCardOnWebsiteVerifyTest(){
        //1. Open browser
        //2. Go to url http://52.39.162.23
        //3. Login as any valid user
        pages.login().login(ConfigurationReader.getProperty("Uusername"), ConfigurationReader.getProperty("Upassword"));

        //4.Click on CRM module
        BrowserUtils.hover(pages.crm().CRMheader);
         BrowserUtils.waitForVisibility(pages.crm().CRMheader, 15);
        pages.crm().CRMheader.click();

        //5. Click on Customers header
        BrowserUtils.hover(pages.crm().customersHeader);
        BrowserUtils.waitForVisibility(pages.crm().customersHeader, 20);
        pages.crm().customersHeader.click();

        //6. Click on Create button
        BrowserUtils.explicitWaitTitleIs(20, ApplicationConstants.CUSTOMERSTITLE);
        pages.customer().customerCardCreateButton.click();

/**
 * Here starts STEPS of BRIT-2005 test case
 */
        //1. Verify that publish button by default unpublished
        Assert.assertTrue(pages.customer().unPublishedLink.getText().equals("Unpublished"));

        //2. Click on a publish button

        pages.customer().nameField.sendKeys("Saya_Company");
        pages.customer().unPublishedLink.click();

        //3. Verify that Local host page contains a customer name
        BrowserUtils.waitForPageToLoad(2000);

        Assert.assertTrue(pages.mobilePreviewPage().customerName.getText().contains("Saya_Company"));

        //4.Verify that publish button on Local Host page by default unpublished
        Assert.assertTrue(pages.customer().unPublishOnLocalHost.getText().contains("Unpublished"));
    }
}
