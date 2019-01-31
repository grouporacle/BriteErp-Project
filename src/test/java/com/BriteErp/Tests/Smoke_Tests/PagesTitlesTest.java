package com.BriteErp.Tests.Smoke_Tests;

import com.BriteErp.Utilities.BrowserUtils;
import com.BriteErp.Utilities.ConfigurationReader;
import com.BriteErp.Utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PagesTitlesTest extends TestBase {


    @Test
    public void pageTitleTests() {
        //1. Open browser
        //2. Go to url http://52.39.162.23

        pages.login().login(ConfigurationReader.getProperty("Uusername"), ConfigurationReader.getProperty("Upassword"));
        //3. Login as any valid user
        BrowserUtils.waitForClickablility(pages.login().briteErpDemoGroup,20);
        pages.login().briteErpDemoGroup.click();
        //Verify that the title contains "Login"
        //Assert.assertTrue(driver.getTitle().contains("Login"));

       // loginPage.login("EventsCRM_User2@info.com", "opJu56KKL40");
       // Assert.assertTrue(driver.getTitle().contains("Odoo"));

        //4.Click on CRM module
      //  BrowserUtils.hover(crMmodule.CRMheader);
      //  WebElement visibleNow =isElementLoaded(crMmodule.CRMheader);
      //  visibleNow.click();
       // WebDriverWait wait =new WebDriverWait(driver, 20);
      //  wait.until(ExpectedConditions.titleIs("Pipeline - Odoo"));
      //  Assert.assertTrue(driver.getTitle().contains(crMmodule.pipelineHeader.getText()));

        //Click on Customers link
      //  BrowserUtils.hover(crMmodule.customersHeader);
      //  WebElement customerHeaderVisibleNow =isElementLoaded(crMmodule.customersHeader);
      //  customerHeaderVisibleNow.click();

        //Verify that the title contains "Customers"
       // wait.until(ExpectedConditions.titleIs("Customers - Odoo"));
       // Assert.assertTrue(driver.getTitle().contains("Customers"));

        //Click on create button
       // customPage.customerCardCreateButton.click();
       // wait.until(ExpectedConditions.titleIs("New - Odoo"));
       // Assert.assertTrue(driver.getTitle().contains("New"));
    }

    public WebElement isElementLoaded(WebElement elementToBeLoaded) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
        return element;
    }
}
