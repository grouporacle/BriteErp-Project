package com.BriteErp.pages.UserLevel;
import com.BriteErp.Utilities.Driver;
import com.BriteErp.Utilities.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMmodule {
    public CRMmodule(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[5]/a")
    public WebElement CRMheader;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[19]")
    public WebElement customersHeader;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[5]/ul[3]/li[1]/a[1]")
    public WebElement salesChannelsLink;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[5]/ul[1]/li[2]/a[1]")
    public WebElement quotationsButton;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[5]/div[2]/a[1]/span[1]")
    public WebElement customerButton;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[5]/ul[2]/li[1]/a[1]")
    public WebElement pipelineAnalysisButton;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[5]/ul[2]/li[2]/a[1]")
    public WebElement activitiesButton;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[5]/ul[2]/li[3]/a[1]")
    public WebElement salesCannelsReportingButton;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[5]/ul[3]/li[2]/a[1]")
    public WebElement activityTypesButton;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[5]/ul[3]/li[3]/a[1]")
    public WebElement leadsAndOpportunitiesButton;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[5]/ul[3]/li[3]/ul[1]/li[1]/a[1]")
    public WebElement leadTagButton;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[5]/ul[3]/li[3]/ul[1]/li[2]/a[1]")
    public WebElement lostReasonsButton;




}
