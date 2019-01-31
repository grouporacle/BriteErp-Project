package com.BriteErp.pages;
import com.BriteErp.Utilities.ConfigurationReader;
import com.BriteErp.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='list-group-item'])[2]")
    public WebElement briteErpDemoGroup;

    @FindBy(id = "login")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"wrapwrap\"]/main/div/form/div[4]/button")
    public WebElement loginButton;


    public void login(String usr, String pass) {
        username.sendKeys(usr);
        password.sendKeys(pass);
        loginButton.click();
    }

    public void open() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
}


