package com.BriteErp.Tests.Functional_Tests.UserLevel;

import com.BriteErp.Utilities.*;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreationOpportunityBRIT1825 extends TestBase {

    @Test
    public void creationOpportunity() {
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

        //1. Verify that a User i not able to create an Opportunity with empty Name field

        pages.opportunityPage().opportunityLink.click();
        BrowserUtils.wait(5);
        Assert.assertTrue(ApplicationConstants.ERRORMESSAGEINVALIDNAME.contains(pages.opportunityPage().errorMsg.getText()));

        //2. Enter name into Name field, click on an Opportunity link, Verify that the title equals to "Opportunity"
        pages.customer().nameField.sendKeys("Saya");
        pages.opportunityPage().opportunityLink.click();
        BrowserUtils.explicitWaitTitleIs(20, ApplicationConstants.OPPORTUNITYTITLE);
       Assert.assertEquals(ApplicationConstants.OPPORTUNITYTITLE, Driver.getDriver().getTitle());

       //3. Click on create button, Fill all required fields out. Verify that a User is not able to enter invalid Expected revenue
        pages.opportunityPage().createButton.click();
        pages.opportunityPage().opportunityTitle.sendKeys("Saya_Company");
        pages.opportunityPage().expectedRevenueField.sendKeys("invalid");
        pages.opportunityPage().createButtonOnOpportunity.click();
       // BrowserUtils.wait(15);
        Assert.assertTrue( pages.opportunityPage().errorMessage.getText().contains("The following fields are invalid:"));
        //System.out.println(pages.opportunityPage().errorMessage.getText());

       //4. Enter an invalid revenue, click on create button
        pages.opportunityPage().expectedRevenueField.sendKeys(Keys.chord(Keys.CONTROL, "a"),"222");
        pages.opportunityPage().createButtonOnOpportunity.click();

        //5. Click on import button, Verify that a User is able to click on import button

        BrowserUtils.wait(15);
        pages.opportunityPage().importButton.click();
        Assert.assertTrue(pages.opportunityPage().importButton.isEnabled());

    }
}