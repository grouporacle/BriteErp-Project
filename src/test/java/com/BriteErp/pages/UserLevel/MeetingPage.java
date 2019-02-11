package com.BriteErp.pages.UserLevel;

import com.BriteErp.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MeetingPage {
    public MeetingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]/div[1]")
    public WebElement meetingLink;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/button[2]")
    public WebElement weekLink;

    @FindBy(xpath = "//a[@class='ui-datepicker-prev ui-corner-all']")
    public WebElement arrowButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[5]/a[1]")
    public WebElement date;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/div[2]/a[4]/div[2]")
    public WebElement invalidEventDate;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[45]/td[2]")
    public WebElement invalidTime;

    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/input[1]")
    public WebElement setMeeting;


    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/input[1]")
    public WebElement createMeetingButton;

    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[3]/button[2]")
    public WebElement deleteButton;

   @FindBy(xpath = "/html[1]/body[1]/div[8]/div[1]/div[1]/div[3]/button[1]")
    public WebElement okButtonForDeleting;
}
