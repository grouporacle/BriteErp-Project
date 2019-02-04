package com.BriteErp.pages;

import com.BriteErp.Utilities.Driver;
import com.BriteErp.Utilities.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Collections;
import java.util.List;

public class SalesChannelPage{

    public SalesChannelPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol/li")
    public WebElement header;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/h1/span")
    public WebElement header2;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")
    public WebElement saveButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    public WebElement createButton;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement createButton2;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[2]")
    public WebElement discardButton;


    @FindBy(xpath = "//label[@class='btn btn-primary']")
    public WebElement loadButton;


    @FindBy(xpath = "//input[@id='my-file-selector']")
    public WebElement loadButton2;

    @FindBy(xpath = "//button[contains(text(),'Import')]")
    public WebElement importButton;

    @FindBy(xpath = "//h1//input")
    public WebElement nameBox;

    @FindBy(xpath = "(//div//div//div//div//div//div//div//div//div//div//div//div//input)[1]")
    public WebElement checkbox1;

    @FindBy(xpath = "(//div//div//div//div//div//div//div//div//div//div//div//div//input)[2]")
    public WebElement checkbox2;

    @FindBy(xpath = "(//div//div//div//div//div//div//div//div//div//div//div//input)[4]")
    public WebElement dropdown;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/form/div[2]/div[3]/div/p[1]")
    public WebElement error1;

    @FindBy(xpath = "//span[contains(text(),'Inbox')]")
    public WebElement first;

    @FindBy(xpath = "/html[1]/body[1]/ul[1]/li")
    public WebElement options;

    public String GetPath(WebElement element){
        int sp = String.valueOf(element).indexOf("/");
        int ep = String.valueOf(element).length()-1;

        return String.valueOf(element).substring(sp-1,ep).trim();
    }

    public List<String> sortedArray(List<String> list){
        Collections.sort(list);
        return list;
    }

}
