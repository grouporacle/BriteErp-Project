package com.BriteErp.Tests.Smoke_Tests;

import com.BriteErp.Utilities.BrowserUtils;
import com.BriteErp.Utilities.ConfigurationReader;
import com.BriteErp.Utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PagesTitlesTest extends TestBase {


    @Test
    public void pageTitleTests() {
        //1. Open browser
        //2. Go to url http://52.39.162.23
        extentLogger = report.createTest("Page headers test");



        //1 Verify that the title contains "Login"
        extentLogger.info("Checking the title contains Login");
        Assert.assertTrue(driver.getTitle().contains("Login"));
        //3. Login as any valid user
        pages.login().login(ConfigurationReader.getProperty("Uusername"), ConfigurationReader.getProperty("Upassword"));
        extentLogger.info("Logging to the application");

        //4.check title odoo
        extentLogger.info("Check title odoo");
        Assert.assertTrue(driver.getTitle().contains("Odoo"));

        //4.Click on CRM module
        extentLogger.info("Click Crm Module");

       BrowserUtils.hover(pages.crm().CRMheader);
        WebElement visibleNow =isElementLoaded(pages.crm().CRMheader);
        visibleNow.click();
        WebDriverWait wait =new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.titleIs("Pipeline - Odoo"));Assert.assertTrue(driver.getTitle().contains(pages.crm().pipelineHeader.getText()));

        //Click on Customers link
        extentLogger.info("Click on customer link");

        BrowserUtils.hover(pages.crm().customersHeader);
        WebElement customerHeaderVisibleNow =isElementLoaded(pages.crm().customersHeader);
        customerHeaderVisibleNow.click();

        //Verify that the title contains "Customers"
        extentLogger.info("Verify customers header");

        wait.until(ExpectedConditions.titleIs("Customers - Odoo"));
        Assert.assertTrue(driver.getTitle().contains("Customers"));

        //Click on create button
        extentLogger.info("Click on create button");
        extentLogger.info("Verify new header");

        pages.customer().customerCardCreateButton.click();
        wait.until(ExpectedConditions.titleIs("New - Odoo"));
        Assert.assertTrue(driver.getTitle().contains("New"));

        extentLogger .pass("Page headers test");
    }

    public WebElement isElementLoaded(WebElement elementToBeLoaded) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
        return element;
    }
}
