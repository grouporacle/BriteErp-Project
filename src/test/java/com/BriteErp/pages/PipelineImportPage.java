package com.BriteErp.pages;

import com.BriteErp.Utilities.Driver;
import com.BriteErp.Utilities.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PipelineImportPage {
    public PipelineImportPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
      @FindBy(xpath = " //li[@class='active']//a[@class='oe_menu_leaf']")
        public WebElement pipelineHeader;

       @FindBy(xpath = "//button[contains(text(),'Import')]")
        public WebElement importButton;

       @FindBy(xpath = "//label[@class='btn btn-primary']")
        public WebElement loadFile;



}



