package com.BriteErp.Tests.Functional_Tests;

import com.BriteErp.Utilities.BrowserUtils;
import com.BriteErp.Utilities.ConfigurationReader;
import com.BriteErp.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CRM_CreateAnOpportunityBRIT3412 extends TestBase {

    @Test
    public void CreateAnOpportunityTest() {
        extentLogger = report.createTest("Create An Opportunity Test");
        //1. Go to url http://52.39.162.23
        //2. Login as Manager
        extentLogger.info("Login as Manager");
        pages.login().login(ConfigurationReader.getProperty("Musername"), ConfigurationReader.getProperty("Mpassword"));

        //3 Verify that CRM module is displayed on the module tabs
        extentLogger.info("Verify that CRM module is displayed on the module tabs");
        BrowserUtils.waitForVisibility(pages.crm().CRMheader, 15);
        Assert.assertTrue(pages.crm().CRMheader.isDisplayed());

        //4. Click on CRM header
        extentLogger.info("Click on CRM header");
        BrowserUtils.waitForVisibility(pages.crm().CRMheader, 15);
        pages.crm().CRMheader.click();

        //5.Verify that pipeline linktext is displayed
        extentLogger.info("Verify that pipeline linktext is displayed");
        Assert.assertTrue(pages.crm().PipeLineHeader.isDisplayed());

        // 6.Click on Create Button
        extentLogger.info("Click on Create Button");
        BrowserUtils.hover(pages.crm().PipeLineCreateButton);
        BrowserUtils.waitForVisibility(pages.crm().PipeLineCreateButton,15);
        pages.crm().PipeLineCreateButton.click();

        // 7. Type opportunity Title
        extentLogger.info("Type opportunity Title");
        pages.caop().OpportunityTitle.sendKeys("Ultimate Ears Speaker");

        //8.Click on customer dropdown box and pick search more
        extentLogger.info("Click on customer dropdown box and pick search more ");
        pages.caop().CustomerDropDownBox.click();
        BrowserUtils.waitForVisibility(pages.caop().CustomerDropDownBox,30);
        pages.caop().SearchMoreOption.click();

        //9.Verify that more customers are displayed
        Assert.assertTrue(pages.caop().Customers.size()>1);

        //10.Scroll down and pick EventsCRM_Manager2
        extentLogger.info("Scroll down and pick EventsCRM_Manager2");
        BrowserUtils.scrollToElement(pages.caop().CustomerOption);
        pages.caop().CustomerOption.click();
        pages.caop().ExpectedRevenue.clear();
        pages.caop().ExpectedRevenue.sendKeys("11000");
        pages.caop().Priority.click();

        //11.Click on create button
        extentLogger.info("Click on create button");
        pages.caop().CreateButton.click();







    }
}
