package com.BriteErp.Tests.Functional_Tests.UserLevel;

import com.BriteErp.Utilities.ApplicationConstants;
import com.BriteErp.Utilities.BrowserUtils;
import com.BriteErp.Utilities.ConfigurationReader;
import com.BriteErp.Utilities.TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MobilePreviewBRIT2021 extends TestBase {

    @Test
    public void MobilePreviewFunctionalTest(){
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
        BrowserUtils.waitForVisibility(pages.crm().customersHeader, 15);
        pages.crm().customersHeader.click();

        //6. Click on Create button
        BrowserUtils.explicitWaitTitleIs(15, ApplicationConstants.CUSTOMERSTITLE);
        pages.customer().customerCardCreateButton.click();

        //7. Fill name on Name field
        pages.customer().nameField.sendKeys("System");

        //8. Click on Save button
        BrowserUtils.waitForClickablility(pages.customer().saveButton, 20);
        pages.customer().saveButton.click();

        //9. Click on unpublished on Website link
        pages.customer().unPublishedLink.click();

        //all features on localhost page

        List<String> featuresLocalHostPage = new ArrayList<>();
        featuresLocalHostPage.add(pages.mobilePreviewPage().home.getText());
        featuresLocalHostPage.add(pages.mobilePreviewPage().shop.getText());
        featuresLocalHostPage.add(pages.mobilePreviewPage().events.getText());
        featuresLocalHostPage.add(pages.mobilePreviewPage().blog.getText());
        featuresLocalHostPage.add(pages.mobilePreviewPage().forum.getText());
        featuresLocalHostPage.add(pages.mobilePreviewPage().contactUs.getText());
        featuresLocalHostPage.add(pages.mobilePreviewPage().presentations.getText());


/**
 * Here starts STEPS of BRIT2021 test case
 */
      //1. Click on mobile preview button
        pages.mobilePreviewPage().mobilePreviewButton.click();
        BrowserUtils.waitForVisibility(pages.mobilePreviewPage().mobilePreviewButton,15);

        driver.switchTo().frame(pages.mobilePreviewPage().iFrameofMobilePreview);
        //2.Verify that the Mobile Preview version displays Customer's name
        Assert.assertTrue(pages.mobilePreviewPage().customerName.getText().trim().equals("System"));

        //3. Click on Mobile Preview icon bar
        pages.mobilePreviewPage().iconBarMobilePreview.click();

        List<String> featuresMobilePreview = new ArrayList<>();
        featuresMobilePreview.add(pages.mobilePreviewPage().home.getText());
        featuresMobilePreview.add(pages.mobilePreviewPage().shop.getText());
        featuresMobilePreview.add(pages.mobilePreviewPage().events.getText());
        featuresMobilePreview.add(pages.mobilePreviewPage().blog.getText());
        featuresMobilePreview.add(pages.mobilePreviewPage().forum.getText());
        featuresMobilePreview.add(pages.mobilePreviewPage().contactUs.getText());
        featuresMobilePreview.add(pages.mobilePreviewPage().presentations.getText());

        //4.Verify that mobile preview version consists of same features as in LocalHost Page
        Assert.assertTrue(featuresLocalHostPage.containsAll(featuresMobilePreview));

        //5. Click on home link
        pages.mobilePreviewPage().home.click();

        //6. Click on icon bar
        pages.mobilePreviewPage().iconBarMobilePreview.click();

        //7.Select MyAccount from EventsUser dropdown box
        pages.mobilePreviewPage().eventsUserDropDown.click();
        BrowserUtils.selectCheckBox(pages.mobilePreviewPage().myAccountOption, true);
        Assert.assertTrue(pages.mobilePreviewPage().myAccountOption.isSelected());
    }
}
