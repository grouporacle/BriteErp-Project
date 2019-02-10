package com.BriteErp.Tests.Functional_Tests.ManagerLevel;

import com.BriteErp.Utilities.BrowserUtils;
import com.BriteErp.Utilities.ConfigurationReader;
import com.BriteErp.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorValidationSalesChannel extends TestBase {

    @Test
    public void errorValidation(){
        extentLogger = report.createTest("Sale Channel File Upload Error Validation Test");
        //login
        pages.login().login(ConfigurationReader.getProperty("Musername"), ConfigurationReader.getProperty("Mpassword"));

        //click crm
        pages.crm().CRMheader.click();
        //click salesChannels
        BrowserUtils.waitForVisibility(pages.crm().salesChannelsLink,15);
        pages.crm().salesChannelsLink.click();


        BrowserUtils.explicitWaitTitleIs(15,"Sales Channels - Odoo");
        BrowserUtils.waitForClickablility(pages.salesPage().importButton,15);
        pages.salesPage().importButton.click();

        //import unsupported file
        extentLogger.info("Import unsupported file get NonType Error");
        BrowserUtils.waitForClickablility(pages.salesPage().loadButton,15);
        pages.salesPage().loadButton2.sendKeys("C:\\Users\\enes\\Documents\\asd.txt");
        BrowserUtils.waitForVisibility(pages.salesPage().error1,15);

        Assert.assertTrue(pages.salesPage().error1.getText().contains("NoneType"));

        //import empty file
        extentLogger.info("Import Empty file get No Content Error");
        pages.salesPage().loadButton2.sendKeys("C:\\Users\\enes\\Documents\\asd.csv");
        BrowserUtils.waitForVisibility(pages.salesPage().error1,15);

        Assert.assertTrue(pages.salesPage().error1.getText().contains("no content"));

        extentLogger.pass("Sale Channel File Upload Error Validation Test");
    }

}
