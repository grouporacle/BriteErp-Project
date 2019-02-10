package com.BriteErp.pages.UserLevel;

import com.BriteErp.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesPurchasesPage {
    public SalesPurchasesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(partialLinkText = "Sales & Purchases")
    public WebElement salesPurchasesLink;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/div[1]/input[1]")
    public WebElement salesPersonField;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[6]/td[2]/div[1]/div[1]/input[1]")
    public WebElement salePriceListField;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/table[2]/tbody[1]/tr[2]/td[2]/div[1]/input[1]")
    public WebElement vendorButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/input[1]")
    public WebElement isAPersonCheckBox;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/table[3]/tbody[1]/tr[2]/td[2]/input[1]")
    public WebElement internalRefField;

    @FindBy(xpath = "/html[1]/body[1]/ul[7]/li[1]/a[1]")
    public WebElement resultsMsg;


}
