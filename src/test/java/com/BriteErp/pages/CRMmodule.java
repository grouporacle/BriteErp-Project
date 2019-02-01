package com.BriteErp.pages;
import com.BriteErp.Utilities.Driver;
import com.BriteErp.Utilities.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMmodule {
    public CRMmodule(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[5]")
    public WebElement CRMheader;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[19]")
    public WebElement customersHeader;
}
