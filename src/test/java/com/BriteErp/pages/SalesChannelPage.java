package com.BriteErp.pages;

import com.BriteErp.Utilities.Driver;
import com.BriteErp.Utilities.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesChannelPage{

    public SalesChannelPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol/li")
    public WebElement header;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    public WebElement createButton;

    @FindBy(xpath = "//h1//input")
    public WebElement nameBox;

    @FindBy(xpath = "(//div//div//div//div//div//div//div//div//div//div//div//div//input)[1]")
    public WebElement checkbox1;

    @FindBy(xpath = "(//div//div//div//div//div//div//div//div//div//div//div//div//input)[2]")
    public WebElement checkbox2;

    @FindBy(xpath = "(//div//div//div//div//div//div//div//div//div//div//div//input)[4]")
    public WebElement dropdown;

    @FindBy(xpath = "/html[1]/body[1]/ul[1]/li")
    public WebElement options;

    public String GetPath(WebElement element){
        int sp = String.valueOf(element).indexOf("/");
        int ep = String.valueOf(element).length()-1;

        return String.valueOf(element).substring(sp-1,ep).trim();
    }

}
