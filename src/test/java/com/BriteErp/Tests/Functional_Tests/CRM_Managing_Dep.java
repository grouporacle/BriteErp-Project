package com.BriteErp.Tests.Functional_Tests;
/*
1 – Verify that Events CRM Manager can see options of activity types.
2 – Verify that Events CRM Manager should be able to import activity types.
3 –Verify Events CRM Manager should be able to create activity types.
4 –Verify that Events CRM Manager can search names by entering keyword to the search box
       Then hitting enter.
5 – Verify that the Events CRM Manager can update the summary of activity types.
6 – Verify that Events CRM Manager can print all names of the activity types.
 7- Verify that Events CRM Manager should be able to delete the activity types.
8 – Verify that Events CRM Manager should be able to update activity types.
 */

import com.BriteErp.Utilities.BrowserUtils;
import com.BriteErp.Utilities.ConfigurationReader;
import com.BriteErp.Utilities.TestBase;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.List;

public class CRM_Managing_Dep extends TestBase {

    @Test
    public void customerInfoCardCreateTest() {
        //1. Open browser
        //2. Go to url http://52.39.162.23
        //3. Login as any valid user
        pages.login().login(ConfigurationReader.getProperty("Musername"), ConfigurationReader.getProperty("Mpassword"));

        //4.Click on CRM module
        BrowserUtils.hover(pages.crm().CRMheader);
        BrowserUtils.waitForVisibility(pages.crm().CRMheader, 15);
        pages.crm().CRMheader.click();

/**
 * Here starts STEPS of BRIT-2005 test case
 */

        //1-Verify that Events CRM Manager can see options of activity types.
          pages.manager().activityType.click();
        Assert.assertTrue(pages.manager().activityType.getText().equals("Activity Types"));

        //2 –Verify that Events CRM Manager can search names by entering keyword to the search box
        //    Then hitting enter.
            pages.manager().serchbox.sendKeys("call");
            BrowserUtils.waitForPageToLoad(5000);
            pages.manager().serchbox.click();

        //3 – Verify that Events CRM Manager should be able to update names of the activity types.
            pages.manager().serchbox.sendKeys("Efi" + Keys.ENTER);
            BrowserUtils.waitForPageToLoad(2000);
            //pages.manager().click.click();

        //4 –Verify Events CRM Manager should be able to create activity types.
           pages.manager().create.click();
           pages.manager().name.sendKeys("Efi");
           //pages.manager().summary.sendKeys("CRM Manager "+ Keys.ENTER);
           BrowserUtils.wait(10);
           pages.manager().save.click();
           pages.manager().activityType.click();


         //5 – Verify that Events CRM Manager can print all names of the activity types.
         BrowserUtils.waitForClickablility(pages.manager().create, 15);

         for ( WebElement allName : pages.manager().tableNames){
             System.out.println(allName.getText());
         }





    }
}
