package com.BriteErp.pages;

import com.BriteErp.Utilities.Driver;
import com.BriteErp.Utilities.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    }

