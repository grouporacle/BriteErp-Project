package com.BriteErp.Tests.Functional_Tests.UserLevel;

import com.BriteErp.Utilities.BrowserUtils;
import com.BriteErp.Utilities.ConfigurationReader;
import com.BriteErp.Utilities.TestBase;
import org.testng.annotations.Test;

public class PipelineImport extends TestBase {

    @Test
    public void CustomerPipeline() {
        // Open browser
       //  Go to url http://52.39.162.23
        // Login as any valid user
        pages.login().login(ConfigurationReader.getProperty("Uusername"), ConfigurationReader.getProperty("Upassword"));

        //4.Click on CRM module
        BrowserUtils.hover(pages.crm().CRMheader);
        //  BrowserUtils.waitForVisibility(pages.crm().CRMheader, 15);
        pages.crm().CRMheader.click();

        BrowserUtils.waitForVisibility(pages.customerPipe().pipelineHeader, 15);
        pages.customerPipe().pipelineHeader.click();

        //5. Click on import button
        BrowserUtils.waitForVisibility(pages.importuser().importButton,5);
        BrowserUtils.hover(pages.importuser().importButton);

        pages.importuser().importButton.click();
        //6.click on loadFile

       BrowserUtils.hover(pages.importuser().loadFile);
       pages.importuser().loadFile.click();




    }
}