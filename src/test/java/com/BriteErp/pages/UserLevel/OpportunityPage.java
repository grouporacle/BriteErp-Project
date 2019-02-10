package com.BriteErp.pages.UserLevel;

import com.BriteErp.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunityPage {
    public OpportunityPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[2]")
    public WebElement errorMsg;

    @FindBy(xpath = "//div[@class='o_notification_manager']")
    public WebElement getErrorMsg;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/div[2]/span[2]")
    public WebElement opportunityLink;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")
    public WebElement createButton;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
    public WebElement opportunityTitle;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/input[1]")
    public WebElement expectedRevenueField;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/div[1]/footer[1]/button[1]/span[1]")
    public WebElement createButtonOnOpportunity;

    @FindBy(xpath = "/html[1]/body[1]/div[2]")
    public WebElement errorMessage;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]")
    public WebElement importButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/div[1]/span[1]/label[1]")
    public WebElement LoadFileButton;
}
