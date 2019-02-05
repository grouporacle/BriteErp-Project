package com.BriteErp.pages;
import com.BriteErp.Utilities.ConfigurationReader;
import com.BriteErp.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public boolean isManager;
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(id = "login")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"wrapwrap\"]/main/div/form/div[4]/button")
    public WebElement loginButton;


    public void EnterloginInfo(String usr, String pass) {
        username.sendKeys(usr);
        password.sendKeys(pass);

    }
    public void login(String usr, String pass){
        username.sendKeys(usr);
        password.sendKeys(pass);
        loginButton.click();
    }
    public void ClickLogin(){
        loginButton.click();
    }

    public void open() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div/div[2]/a[2]")).click();

    }
    public void loginAsManager(){
        username.sendKeys(ConfigurationReader.getProperty("Musername"));
        password.sendKeys(ConfigurationReader.getProperty("Mpassword"));
        loginButton.click();
        isManager = true;
    }
    public void loginAsUser(){
        username.sendKeys(ConfigurationReader.getProperty("Uusername"));
        password.sendKeys(ConfigurationReader.getProperty("Upassword"));
        loginButton.click();
        isManager = false;
    }
}


