package com.BriteErp.Tests.Functional_Tests;


import com.BriteErp.Utilities.BrowserUtils;
import com.BriteErp.Utilities.ConfigurationReader;
import com.BriteErp.Utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CRM_Managing_Dep extends TestBase {

    @Test
    public void CRM_ManagingCreateTest() {
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

      //1- Verify that Events CRM Manager can see options of activity types.
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
           BrowserUtils.wait(5);
           pages.manager().save.click();
           pages.manager().activityType.click();

              System.out.println("--------------------------");

      //5 – Verify that Events CRM Manager can print all names of the activity types.
            BrowserUtils.waitForPageToLoad(5000);
           for ( WebElement allName : pages.manager().tableNames){
              System.out.println(allName.getText());

           }
              System.out.println("--------------------------");

      //6 – Verify that Events CRM Manager can print all table headers of the activity types.
            BrowserUtils.waitForPageToLoad(5000);

           for ( WebElement head : pages.manager().tableheaders){
            System.out.println(head.getText());
            }
                System.out.println("--------------------------");

      //7 – Verify that Events CRM Manager can print all Rows of the activity types.

            BrowserUtils.waitForPageToLoad(5000);
            System.out.println("Numbers of rows "+ pages.manager().printallRows.size());
            for ( WebElement alltable : pages.manager().printallRows){
                System.out.println(alltable.getText());
            }
               System.out.println("--------------------------");

      //8 – Verify that Events CRM Manager can print all table of the activity types.

            BrowserUtils.waitForPageToLoad(5000);

            for ( WebElement alltable : pages.manager().printalltable){
                System.out.println(alltable.getText());
            }
             System.out.println("--------------------------");

      // 9. Verify that Events CRM Manager can print by coordinates : based on the row and collomn number

            BrowserUtils.waitForPageToLoad(5000);
            BrowserUtils.wait(15);

            for(WebElement header : pages.manager().cells1 ){
                System.out.println(header.getText());
            }
             System.out.println("--------------------------");

      //10 Verify that Events CRM Manager can find the select check box for a given name

          BrowserUtils.waitForPageToLoad(5000);
          BrowserUtils.wait(15);

          for(WebElement header2 : pages.manager().checkbox ) {
            System.out.println(header2.getText());

            System.out.println(header2.isSelected());
            header2.click();
            System.out.println(header2.isSelected());

        }


    }
}
