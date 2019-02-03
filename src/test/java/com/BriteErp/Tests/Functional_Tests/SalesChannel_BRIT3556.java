package com.BriteErp.Tests.Functional_Tests;

import com.BriteErp.Utilities.BrowserUtils;
import com.BriteErp.Utilities.ConfigurationReader;
import com.BriteErp.Utilities.Driver;
import com.BriteErp.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class SalesChannel_BRIT3556 extends TestBase {



    @Test

    public void SalesChannelTest(){
        extentLogger = report.createTest("Page headers test");

        //login as manager
        extentLogger.info("Logging to the application as Manager");
        pages.login().login(ConfigurationReader.getProperty("Musername"), ConfigurationReader.getProperty("Mpassword"));


       //find and click CRM module
        extentLogger.info("find and click CRM module");
        pages.crm().CRMheader.click();

        //find and click salesChannelLink
        extentLogger.info("find and click salesChannelLink");
         BrowserUtils.waitForVisibility(pages.crm().salesChannelsLink,15);
        pages.crm().salesChannelsLink.click();

        //find and click create
        extentLogger.info("find and click Create");
        BrowserUtils.explicitWaitTitleIs(15,"Sales Channels - Odoo");
        pages.salesPage().createButton.click();

        //enter Sales Team Name
        extentLogger.info("enter Sales Team Name");
        pages.salesPage().nameBox.sendKeys("Oracle");

        //check is checkers checked
        extentLogger.info("is checkbox checked");
        Assert.assertTrue(pages.salesPage().checkbox1.isSelected());
        Assert.assertTrue(pages.salesPage().checkbox2.isSelected());

        //check dropdown is sorted or not
        pages.salesPage().dropdown.click();
        BrowserUtils.waitForVisibility(pages.salesPage().options,15);
        System.out.println(pages.salesPage().GetPath(pages.salesPage().options));
        List<WebElement> option = driver.findElements(By.xpath(pages.salesPage().GetPath(pages.salesPage().options)));
        System.out.println(option.size());

       List<String>  StringOptions = new ArrayList<>();
       for(int i=0;i<option.size();i++){
           StringOptions.add(option.get(i).getText());
       }

        Assert.assertTrue(StringOptions.equals(pages.salesPage().sortedArray(StringOptions)));


    }
}
