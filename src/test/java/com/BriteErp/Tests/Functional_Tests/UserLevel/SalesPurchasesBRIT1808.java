package com.BriteErp.Tests.Functional_Tests.UserLevel;

import com.BriteErp.Utilities.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SalesPurchasesBRIT1808 extends TestBase {
    @Test
    public void customerCardOnWebsiteVerifyTest() {
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
        //1. Click on Sales & Purchases
        pages.salesPurchasesPage().salesPurchasesLink.click();

        //2. Verify that is a Person check box is selected by default
        Assert.assertTrue(pages.salesPurchasesPage().isAPersonCheckBox.isSelected());

        //3.Step. Enter invalid "ddd" sales price into sales price field., Verify "No results show..." msg
        pages.salesPurchasesPage().salePriceListField.sendKeys("ddd");
        Assert.assertEquals(pages.salesPurchasesPage().resultsMsg.getText(), "No results to show...");


        //4.Step. Click on is a Vendor button
        pages.salesPurchasesPage().vendorButton.click();

        //5.Step. Verify that Is a Vendor is selected
        Assert.assertTrue(pages.salesPurchasesPage().vendorButton.isSelected());

        //6.Step. Enter references into Internal Reference field
       pages.salesPurchasesPage().internalRefField.sendKeys("References");

       //7.Step. Verify that a user able to enter references into Internal reference field
         BrowserUtils.wait(5);
        Assert.assertEquals(pages.salesPurchasesPage().internalRefField.getAttribute("value"), "References");

    }
}