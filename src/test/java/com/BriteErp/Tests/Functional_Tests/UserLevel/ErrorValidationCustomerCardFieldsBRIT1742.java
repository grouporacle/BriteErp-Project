package com.BriteErp.Tests.Functional_Tests.UserLevel;

import com.BriteErp.Utilities.ApplicationConstants;
import com.BriteErp.Utilities.BrowserUtils;
import com.BriteErp.Utilities.ConfigurationReader;
import com.BriteErp.Utilities.TestBase;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ErrorValidationCustomerCardFieldsBRIT1742 extends TestBase {


    @Test
    public void ErrorValidationTest(){
        //1. Open browser
        //2. Go to url http://52.39.162.23
        //3. Login as any valid user
        pages.login().login(ConfigurationReader.getProperty("Uusername"), ConfigurationReader.getProperty("Upassword"));

        //4.Click on CRM module
        BrowserUtils.hover(pages.crm().CRMheader);
        //  BrowserUtils.waitForVisibility(pages.crm().CRMheader, 20);
        pages.crm().CRMheader.click();

        //5. Click on Customers header
        BrowserUtils.hover(pages.crm().customersHeader);
        BrowserUtils.waitForVisibility(pages.crm().customersHeader, 20);
        pages.crm().customersHeader.click();

        //6. Click on Create button
        BrowserUtils.explicitWaitTitleIs(20, ApplicationConstants.CUSTOMERSTITLE);
        pages.customer().customerCardCreateButton.click();

        /**
        Here starts the main steps of the BRIT1742 test case
         */

        //1. Verify that a User is not able to create a Customer info card with empty Name field
        pages.customer().saveButton.click();
        System.out.println(pages.opportunityPage().errorMsg.getText());

        //2. Enter street's fields, Verify that a user is not able to enter same street names in different fields
        pages.customer().streetField1.sendKeys("Same street");
        pages.customer().streetField2.sendKeys("Same street");

        //3. Click on tags , Verify that tags are listed in alphabetical order
        pages.customer().tagsDropdown.click();
        pages.customer().searchMoreLink.click();
        List<String> tagsLink =BrowserUtils.getElementsText(pages.customer().tagsList);
        List<String> sortedList= new ArrayList<>();
        for(String s : tagsLink){
            sortedList.add(s);
        }
        Collections.sort(tagsLink);
        Assert.assertTrue(sortedList.equals(tagsLink));

       //4. Enter invalid phone number in phone number field
        pages.customer().phoneField.sendKeys("fhdhjgkds");

        //5.Step. Enter invalid email address
        pages.customer().emailField.sendKeys("sdasdad");





    }

}
