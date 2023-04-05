package com.ibnsina.testcases.PageObjects;

import com.ibnsina.testcases.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalDetailsPage extends BasePage {
    public PersonalDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id= ("input_first_name"))
    private WebElement FirstName;
    @FindBy(id = ("input_last_name"))
    private WebElement LastName;
    @FindBy(name = ("phone[number]"))
    private WebElement PhoneNumber;
    @FindBy(xpath= ("//*[@id=\"card_profile_details\"]/div[5]/div/button/span[3]"))
    private WebElement SubmitDataButton;

    public void First_Name(){

        FirstName.sendKeys("Eslam");

    }
    public void Last_Name(){

        LastName.sendKeys("Elshamy");

    }
    public void Phone_Number(){

       PhoneNumber.sendKeys("01006838663");

    }
    public void Submit_Data_Button(){

      SubmitDataButton.click();

    }

}
