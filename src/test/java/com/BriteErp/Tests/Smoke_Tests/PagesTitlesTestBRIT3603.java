package com.BriteErp.Tests.Smoke_Tests;

import com.BriteErp.Utilities.ApplicationConstants;
import com.BriteErp.Utilities.BrowserUtils;
import com.BriteErp.Utilities.ConfigurationReader;
import com.BriteErp.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PagesTitlesTestBRIT3603 extends TestBase {


    @Test
    public void pageTitleTests() {
        //1. Open browser
        //2. Go to url http://52.39.162.23
        extentLogger = report.createTest("Page headers test");

        // Verify that the title contains "Login"
        extentLogger.info("Checking the title contains Login");
        Assert.assertTrue(driver.getTitle().contains("Login"));
        //3. Login as any valid user
        pages.login().login(ConfigurationReader.getProperty("Uusername"), ConfigurationReader.getProperty("Upassword"));
        extentLogger.info("Logging to the application");

        //4.check title odoo
        extentLogger.info("Check title odoo");
        Assert.assertTrue(driver.getTitle().contains(ApplicationConstants.ODOOTITLE));

        //5.Click on CRM module
        extentLogger.info("Click Crm Module");

        BrowserUtils.hover(pages.crm().CRMheader);
        BrowserUtils.waitForVisibility(pages.crm().CRMheader, 15);
        pages.crm().CRMheader.click();
        BrowserUtils.explicitWaitTitleIs(20, "Pipeline - Odoo");
        //6. Verify that title is Pipeline
        Assert.assertTrue(driver.getTitle().contains(ApplicationConstants.PIPELINETITLE));

        //7. Click on Customers link
        extentLogger.info("Click on customer link");

        BrowserUtils.hover(pages.crm().customersHeader);
        BrowserUtils.waitForVisibility(pages.crm().customersHeader,20);
        pages.crm().customersHeader.click();

        //8. Verify that the title contains "Customers"
        extentLogger.info("Verify customers header");

        BrowserUtils.explicitWaitTitleIs(20,"Customers - Odoo");
        Assert.assertTrue(driver.getTitle().contains(ApplicationConstants.CUSTOMERSTITLE));

        //9. Click on create button
        extentLogger.info("Click on create button");
        extentLogger.info("Verify new header");

         pages.customer().customerCardCreateButton.click();
        BrowserUtils.explicitWaitTitleIs(20, "New - Odoo");
       //10. Verify that the title contains header name
        Assert.assertTrue(driver.getTitle().contains(ApplicationConstants.NEWTITLE));

      extentLogger .pass("Page headers test");
    }


}
