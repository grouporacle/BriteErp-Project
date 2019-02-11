package com.BriteErp.pages.UserLevel;

import com.BriteErp.Utilities.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.BriteErp.Utilities.Driver;

import java.util.List;

public class CustomersPage extends Pages {
        public CustomersPage(){
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
        public WebElement customerCardCreateButton;

        @FindBy(xpath ="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/h1[1]/input[1]")
        public WebElement nameField;

        @FindBy(xpath ="(//input[@class='o_radio_input'])[1]")
        public WebElement individRadioButton;

        @FindBy(xpath="(//input[@class='o_radio_input'])[2]")
        public WebElement companyRadioButton;

        @FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")
        public WebElement saveButton;

        @FindBy(xpath = "(//li[@class='active'])[2]")
        public WebElement createdCardName;

        @FindBy(xpath = "(//input[@class='o_field_char o_field_widget o_input o_address_street'])[1]")
        public WebElement streetField1;

        @FindBy(xpath = "(//input[@class='o_field_char o_field_widget o_input o_address_street'])[2]")
        public WebElement streetField2;

        @FindBy(xpath = "//span[@class='o_stat_text o_value text-danger']")
        public WebElement unPublishedLink;

        @FindBy(xpath = "//span[@class='css_publish']")
        public WebElement unPublishOnLocalHost;

        @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[4]/td[2]/div[1]/div[1]/div[1]/input[1]")
        public WebElement tagsDropdown;

        @FindBy(xpath = "/html[1]/body[1]/ul[4]/li[8]/a[1]")
        public WebElement searchMoreLink;

        @FindBy(xpath = "//td[@class='o_data_cell o_readonly_modifier']")
        public List<WebElement> tagsList;

        @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/table[2]/tbody[1]/tr[2]/td[2]/div[1]/input[1]")
        public WebElement phoneField;

        @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/table[2]/tbody[1]/tr[5]/td[2]/input[1]")
        public WebElement emailField;
    }



