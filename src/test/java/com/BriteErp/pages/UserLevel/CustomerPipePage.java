package com.BriteErp.pages.UserLevel;

import com.BriteErp.Utilities.Driver;
import com.BriteErp.Utilities.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPipePage extends Pages {
    public CustomerPipePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = " //li[@class='active']//a[@class='oe_menu_leaf']")
    public WebElement pipelineHeader;

  //  @FindBy(xpath = "//button[contains(text(),'Create')]")
    //public WebElement buttoncreat;

  //  @FindBy(xpath = "//input[@placeholder='e.g. Customer Deal']")
   // public WebElement opportinitytitle;
   // @FindBy(xpath = "//input[@id='o_field_input_116']")

    //public WebElement customer;
  //  @FindBy(xpath =" //input[@id='o_field_input_117']")
   // public WebElement expectedrevenue;
   // @FindBy(xpath = " //button[@name='close_dialog']//span[contains(text(),'Create')]")
    // public  WebElement createbuttonoptny;


}