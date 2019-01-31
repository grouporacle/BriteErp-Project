package com.BriteErp.Tests.Functional_Tests;

import com.BriteErp.Utilities.BrowserUtils;
import com.BriteErp.Utilities.ConfigurationReader;
import com.BriteErp.Utilities.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerInfoCardBRIT1927 extends TestBase {
    @Test
    public void customerInfoCardCreateTest() {
        //1. Open browser
        //2. Go to url http://52.39.162.23
        pages.login().login(ConfigurationReader.getProperty("Uusername"), ConfigurationReader.getProperty("Upassword"));

        //3. Login as any valid user
       pages.login().briteErpDemoGroup.click();

        pages.login().login("EventsCRM_User2@info.com", "opJu56KKL40");

        //4.Click on CRM module
        BrowserUtils.hover(pages.crm().CRMheader);
        BrowserUtils.waitForVisibility(pages.crm().CRMheader, 20);
        pages.crm().CRMheader.click();

        //5. Click on Customers header
        BrowserUtils.hover(pages.crm().customersHeader);
        BrowserUtils.waitForVisibility(pages.crm().customersHeader, 20);
        pages.crm().customersHeader.click();

        //6. Click on Create button
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.titleContains("Customers"));
        pages.customer().customerCardCreateButton.click();

        //7. Select company radio button
        BrowserUtils.waitForClickablility(pages.customer().companyRadioButton, 20);
        pages.customer().companyRadioButton.click();

        //8. Fill name on Name field
        pages.customer().nameField.sendKeys("Saya_Company");


        //9. Verify individual radio button is not selected
        BrowserUtils.waitForVisibility(pages.customer().companyRadioButton, 20);
        pages.customer().companyRadioButton.click();
        Assert.assertFalse(pages.customer().individRadioButton.isSelected());

        //10. Click on Save button
        pages.customer().saveButton.click();


        //11. Verify that a new customer card is created
        wait.until(ExpectedConditions.titleContains("Saya_Company"));
        Assert.assertTrue(pages.customer().creteadCardName.getText().contains("Saya_Company"));

    }


}
