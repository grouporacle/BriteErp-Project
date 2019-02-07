package com.BriteErp.pages;

import com.BriteErp.Utilities.Driver;
import com.BriteErp.Utilities.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ManagersPage extends Pages{


        public ManagersPage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//ul[@class='oe_secondary_submenu nav nav-pills nav-stacked'][3]//li[2]//span")
        public WebElement activityType;

        @FindBy ( xpath = "//input[@class='o_searchview_input']")
        public WebElement serchbox;

        @FindBy ( xpath = "//span[@title='Advanced Search...']")
        public WebElement click;

        @FindBy ( xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
        public WebElement create;

        @FindBy (xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
        public WebElement name;

        @FindBy (xpath = "//table//tr[3]//td[2]//input[@id='o_field_input_62']")
        public WebElement summary;

        @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
        public WebElement save;

        @FindAll({@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr/td[3]")})
         public List<WebElement> tableNames ;


        @FindAll({@FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//th")})
        public List<WebElement> tableheaders ;


        @FindAll({@FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//tbody/tr")})
        public List<WebElement> printallRows ;

        @FindAll({@FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']")})
        public List<WebElement> printalltable ;

        @FindAll({@FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']//tbody/tr[2]/td[3]")})
        public List<WebElement> cells1 ;

        @FindAll({@FindBy (xpath = "//td[.='UEN/Team/3/Survivors/Test-001']/../td[3]")})
       public List<WebElement> checkbox ;




       /*






    // find the select check box for a given name

    @Test
    public void selectChekBox(){
        Login();
        WebElement checkBox = driver.findElement(By.xpath
                ("//td[.='Susan McLaren']/../td[1]/input"));
        System.out.println(checkBox.isSelected());
        checkBox.click();
        System.out.println(checkBox.isSelected());
    }


        verify that name 'Mark Smith' exists in the names column
            verify that city 'Whitestone, British' exists in the cities column

       @Test
       public void test(){
               Login();
               int nameIndex =  getColumnIndex("Name");
               System.out.println(nameIndex);

               List<WebElement> allNames = driver.findElements(
                       By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td["+nameIndex+"]"));
               boolean found =false;

               for (int i = 0; i < allNames.size(); i++) {
                       if (allNames.get(i).getText().equals("Mark Smith")){
                               found = true;
                               break;
                       }
               }
               Assert.assertTrue(found);

               found = false;
               int cityIndex = getColumnIndex("City");
               List<WebElement> allCities = driver.findElements(
                       By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td["+cityIndex+"]"));

               for (int i = 0; i < allCities.size(); i++) {
                       if (allCities.get(i).getText().equals("Whitestone, British")){
                               found = true;
                               break;
                       }
               }
               Assert.assertTrue(found);
       }


        gets a column name as a parameters
        returns the index of the column name

        public int getColumnIndex(String column){
                List<WebElement> allHeader = driver.findElements(
                        By.xpath("//table[@id='ctl00_MainContent_orderGrid']//th"));

                for (int i = 0; i < allHeader.size(); i++) {
                        if (allHeader.get(i).getText().equals(column)){
                                return i+1;
                        }
                }
                return 0;
        }
}







        */








































    }

