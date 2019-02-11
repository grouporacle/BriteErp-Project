package com.BriteErp.Tests.Functional_Tests.UserLevel;

import com.BriteErp.Utilities.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CustomerPipeTest extends TestBase {
    @Test
    public void CustomerPipeline() {
        //1. Open browser
        //2. Go to url http://52.39.162.23
        //3. Login as any valid user
        pages.login().login(ConfigurationReader.getProperty("Uusername"), ConfigurationReader.getProperty("Upassword"));

        //4.Click on CRM module
        BrowserUtils.hover(pages.crm().CRMheader);
        //  BrowserUtils.waitForVisibility(pages.crm().CRMheader, 15);
        pages.crm().CRMheader.click();

        BrowserUtils.waitForVisibility(pages.customerPipe().pipelineHeader,15);
        pages.customerPipe().pipelineHeader.click();

       // BrowserUtils.explicitWaitTitleIs(15, ApplicationConstants.PIPELINE);
        //pages.customerPipe().buttoncreat.click();

        // pages.customerPipe().opportinitytitle.sendKeys("aysecompany");



}
}
