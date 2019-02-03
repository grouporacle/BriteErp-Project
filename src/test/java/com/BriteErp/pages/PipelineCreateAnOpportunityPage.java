package com.BriteErp.pages;

import com.BriteErp.Utilities.Driver;
import com.BriteErp.Utilities.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class PipelineCreateAnOpportunityPage extends Pages {

    public PipelineCreateAnOpportunityPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='e.g. Customer Deal']")
    public WebElement OpportunityTitle;

    @FindBy(xpath = " //div[@name='partner_id']//input[@type='text']")
    public WebElement CustomerDropDownBox;

    @FindBy(xpath = "//a[contains(text(),'Search More...')]")
    public WebElement SearchMoreOption;

    @FindBy(xpath = " //table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr")
    public List <WebElement> Customers;



    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr[47]/td")
    public WebElement CustomerOption;


    @FindBy(xpath = "//input[@name='planned_revenue']")
    public WebElement ExpectedRevenue;

    @FindBy(xpath = "//table[@class='o_group o_inner_group o_group_col_6']//a[@title='High']")
    public WebElement Priority;

    @FindBy(xpath = "//button[@name='close_dialog']")
    public WebElement CreateButton;


}
