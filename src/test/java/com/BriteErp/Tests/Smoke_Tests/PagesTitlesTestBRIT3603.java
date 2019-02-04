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
        // pages.login().login(ConfigurationReader.getProperty("Uusername"), ConfigurationReader.getProperty("Upassword"));
        //  extentLogger.info("Logging to the application");


        //pages.login().loginAsManager();
       pages.login().loginAsUser();

        /**
         * CHECK IF LOGININ IN AS USER OR MANAGER AND DO THE RIGHT TEST FOR IT
         */


        if(!pages.login().isManager) {
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
            BrowserUtils.waitForVisibility(pages.crm().customersHeader, 20);
            pages.crm().customersHeader.click();

            //8. Verify that the title contains "Customers"
            extentLogger.info("Verify customers header");

            BrowserUtils.explicitWaitTitleIs(20, "Customers - Odoo");
            Assert.assertTrue(driver.getTitle().contains(ApplicationConstants.CUSTOMERSTITLE));

            //9. Click on create button
            extentLogger.info("Click on create button");
            extentLogger.info("Verify new header");

            pages.customer().customerCardCreateButton.click();
            BrowserUtils.explicitWaitTitleIs(20, "New - Odoo");
            //10. Verify that the title contains header name
            Assert.assertTrue(driver.getTitle().contains(ApplicationConstants.NEWTITLE));

            extentLogger.pass("Page headers test");
        }
        else{
            //1.check title odoo
            extentLogger.info("Check title odoo");
            Assert.assertTrue(driver.getTitle().contains(ApplicationConstants.ODOOTITLE));

            //2.Click on CRM module
            extentLogger.info("Click Crm Module");

            BrowserUtils.hover(pages.crm().CRMheader);
            BrowserUtils.waitForVisibility(pages.crm().CRMheader, 15);
            pages.crm().CRMheader.click();
            BrowserUtils.explicitWaitTitleIs(20, "Pipeline - Odoo");
            //3. Verify that title is Pipeline
            Assert.assertTrue(driver.getTitle().contains(ApplicationConstants.PIPELINETITLE));



            //4. Click on Quotations link
            extentLogger.info("Click on Quotations link");


            BrowserUtils.waitForClickablility(pages.crm().quotationsButton, 15);
            pages.crm().quotationsButton.click();

            //5. Verify that the title contains "Quotations"
            extentLogger.info("Verify Quotations header");

            BrowserUtils.explicitWaitTitleIs(20, "Quotations - Odoo");
            Assert.assertTrue(driver.getTitle().contains(ApplicationConstants.QUOTATIONS));


            //6. Click on Customers link
            extentLogger.info("Click on customer link");


            BrowserUtils.waitForClickablility(pages.crm().customerButton, 15);
            pages.crm().customerButton.click();

            //7. Verify that the title contains "Customers"
            extentLogger.info("Verify customers header");

            BrowserUtils.explicitWaitTitleIs(20, "Customers - Odoo");
            Assert.assertTrue(driver.getTitle().contains(ApplicationConstants.CUSTOMERSTITLE));

            //8. Click on pipeline reporting link
            extentLogger.info("Click on pipeline reporting link");


            BrowserUtils.waitForClickablility(pages.crm().pipelineAnalysisButton, 15);
            pages.crm().pipelineAnalysisButton.click();

            //9. Verify that the title contains "Pipeline Analysis"
            extentLogger.info("Verify pipeline reporting header");

            BrowserUtils.explicitWaitTitleIs(20, "Pipeline Analysis - Odoo");
            Assert.assertTrue(driver.getTitle().contains(ApplicationConstants.PIPELINEAN));

            //10. Click on Activities link
            extentLogger.info("Click on Activities link");


            BrowserUtils.waitForClickablility(pages.crm().activitiesButton, 15);
            pages.crm().activitiesButton.click();

            //11. Verify that the title contains "Activities Analysis"
            extentLogger.info("Verify Activities header");

            BrowserUtils.explicitWaitTitleIs(20, "Activities Analysis - Odoo");
            Assert.assertTrue(driver.getTitle().contains(ApplicationConstants.ACTIVITIES));

            //12. Click on Sales Channels1 link
            extentLogger.info("Click on Sales Channels1 link");


            BrowserUtils.waitForClickablility(pages.crm().salesCannelsReportingButton, 15);
            pages.crm().salesCannelsReportingButton.click();

            //13. Verify that the title contains "Sales Channels"
            extentLogger.info("Verify Sales Channels1 header");

            BrowserUtils.explicitWaitTitleIs(20, "Sales Channels - Odoo");
            Assert.assertTrue(driver.getTitle().contains(ApplicationConstants.SALESCH));

            //14. Click on Sales Channels2 link
            extentLogger.info("Click on Sales Channels2 link");


            BrowserUtils.waitForClickablility(pages.crm().salesChannelsLink, 15);
            pages.crm().salesChannelsLink.click();

            //15. Verify that the title contains "Sales Channels"
            extentLogger.info("Verify Sales Channels2 header");

            BrowserUtils.explicitWaitTitleIs(20, "Sales Channels - Odoo");
            Assert.assertTrue(driver.getTitle().contains(ApplicationConstants.SALESCH));

            //16. Click on Activity Types link
            extentLogger.info("Click on Activity Types link");


            BrowserUtils.waitForClickablility(pages.crm().activityTypesButton, 15);
            pages.crm().activityTypesButton.click();

            //17. Verify that the title contains "Activity Types"
            extentLogger.info("Verify Activity Types header");

            BrowserUtils.explicitWaitTitleIs(20, "Activity Types - Odoo");
            Assert.assertTrue(driver.getTitle().contains(ApplicationConstants.ACTIVITY));

            //18 click on Leads and opportunities tab
            extentLogger.info("Click on Leads and opportunities link");
            BrowserUtils.waitForClickablility(pages.crm().leadsAndOpportunitiesButton, 15);
            pages.crm().leadsAndOpportunitiesButton.click();

            //18. Click on Lead Tags link
            extentLogger.info("Click on Lead Tags link");


            BrowserUtils.waitForClickablility(pages.crm().leadTagButton, 15);
            pages.crm().leadTagButton.click();

            //19. Verify that the title contains "Activity Types"
            extentLogger.info("Verify Lead Tags header");

            BrowserUtils.explicitWaitTitleIs(20, "Lead Tags - Odoo");
            Assert.assertTrue(driver.getTitle().contains(ApplicationConstants.LEADTAGS));


            //20. Click on Lost Reasons link
            extentLogger.info("Click on Lost Reasons link");


            BrowserUtils.waitForClickablility(pages.crm().lostReasonsButton, 15);
            pages.crm().lostReasonsButton.click();

            //21. Verify that the title contains "Activity Types"
            extentLogger.info("Verify Lost Reasons header");

            BrowserUtils.explicitWaitTitleIs(20, "Lost Reasons - Odoo");
            Assert.assertTrue(driver.getTitle().contains(ApplicationConstants.LOST));

            extentLogger.pass("Page headers test");

        }

    }


}
