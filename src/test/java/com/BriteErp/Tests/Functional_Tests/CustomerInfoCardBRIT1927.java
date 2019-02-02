package com.BriteErp.Tests.Functional_Tests;

import com.BriteErp.Utilities.ApplicationConstants;
import com.BriteErp.Utilities.BrowserUtils;
import com.BriteErp.Utilities.ConfigurationReader;
import com.BriteErp.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;




public class CustomerInfoCardBRIT1927 extends TestBase {

    @Test
    public void customerInfoCardCreateTest() {
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

        //7. Verify that individual button by default is selected
        Assert.assertTrue(pages.customer().individRadioButton.isSelected());

        //8. Fill name on Name field
        pages.customer().nameField.sendKeys("Saya_Company");

        //9. Verify individual radio button is not selected
        // BrowserUtils.waitForVisibility(pages.customer().companyRadioButton, 20);
         pages.customer().companyRadioButton.click();
        // Assert.assertFalse(pages.customer().individRadioButton.isSelected());

        //10. Click on Save button
       // BrowserUtils.waitForClickablility(pages.customer().saveButton, 10);
           pages.customer().saveButton.click();
           Assert.assertFalse(pages.customer().saveButton.isSelected());

        //11. Verify that a new customer card is created
          BrowserUtils.explicitWaitTitleIs(15,"Saya_Company - Odoo");
          Assert.assertTrue(pages.customer().createdCardName.getText().contains("Saya_Company"));


    }


}
