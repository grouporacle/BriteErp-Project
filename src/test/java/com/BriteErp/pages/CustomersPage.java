package com.BriteErp.pages;

import com.BriteErp.Utilities.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.BriteErp.Utilities.Driver;

public class CustomersPage extends Pages {
        public CustomersPage(){
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
        public WebElement customerCardCreateButton;

        @FindBy(id = "o_field_input_249")
        public WebElement nameField;

        @FindBy(id ="radio247_person")
        public WebElement individRadioButton;

        @FindBy(id="radio247_company")
        public WebElement companyRadioButton;

        @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")
        public WebElement saveButton;

        @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[3]/button")
        public WebElement actionDropDownButton;

        @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol/li[2]")
        public WebElement creteadCardName;


    }



