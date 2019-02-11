package com.BriteErp.pages.UserLevel;

import com.BriteErp.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePreviewPage {
    public MobilePreviewPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath= "//span[@title='Mobile preview']")
     public WebElement mobilePreviewButton;

    @FindBy(xpath = "//*[@id=\"wrapwrap\"]/header/div/div/div[1]/button")
    public WebElement iconBarMobilePreview;

    @FindBy(id = "mobile-viewport")
    public WebElement iFrameofMobilePreview;

    @FindBy(xpath = "//*[@id=\"top_menu\"]/li[1]")
    public WebElement home;

    @FindBy(xpath = "//*[@id=\"top_menu\"]/li[2]")
    public WebElement shop;

    @FindBy(xpath = "//*[@id=\"top_menu\"]/li[3]")
    public WebElement events;

    @FindBy(xpath = "//*[@id=\"top_menu\"]/li[4]")
    public WebElement forum;

    @FindBy(xpath = "//*[@id=\"top_menu\"]/li[5]")
    public WebElement blog;

    @FindBy(xpath = "//*[@id=\"top_menu\"]/li[6]")
    public WebElement presentations;

    @FindBy(xpath = "//*[@id=\"top_menu\"]/li[7]")
    public WebElement contactUs;

    @FindBy(id = "partner_name")
    public WebElement customerName;

    @FindBy(xpath = "(//*[@class='dropdown-toggle']//span)[1]")
    public WebElement eventsUserDropDown;

    @FindBy(xpath = "//*[@id=\"top_menu\"]/li[10]/ul/li[1]/a")
    public WebElement myAccountOption;


}
