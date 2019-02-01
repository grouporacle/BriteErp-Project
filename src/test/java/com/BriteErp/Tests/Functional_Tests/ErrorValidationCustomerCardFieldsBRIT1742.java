package com.BriteErp.Tests.Functional_Tests;

import com.BriteErp.Utilities.ApplicationConstants;
import com.BriteErp.Utilities.BrowserUtils;
import com.BriteErp.Utilities.ConfigurationReader;
import com.BriteErp.Utilities.TestBase;
import org.openqa.selenium.Alert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ErrorValidationCustomerCardFieldsBRIT1742 extends TestBase {

    @Ignore
    @Test
    public void ErrorValidationTest(){
        //1. Open browser
        //2. Go to url http://52.39.162.23
        //3. Login as any valid user
        pages.login().login(ConfigurationReader.getProperty("Uusername"), ConfigurationReader.getProperty("Upassword"));

        //4.Click on CRM module
        BrowserUtils.hover(pages.crm().CRMheader);
        //  BrowserUtils.waitForVisibility(pages.crm().CRMheader, 15);
        pages.crm().CRMheader.click();

        //5. Click on Customers header
        BrowserUtils.hover(pages.crm().customersHeader);
        //  BrowserUtils.waitForVisibility(pages.crm().customersHeader, 15);
        pages.crm().customersHeader.click();

        //6. Click on Create button
        BrowserUtils.explicitWaitTitleIs(15, ApplicationConstants.CUSTOMERSTITLE);
        pages.customer().customerCardCreateButton.click();

        /**
        Here starts the main steps of the BRIT1742 test case
         */

        //1. Verify that a User is not able to create a Customer info card with empty Name field
        BrowserUtils.hover(pages.customer().saveButton);
        pages.customer().saveButton.click();

        Alert alert = driver.switchTo().alert();


        System.out.println(alert.getText());







    }

}
