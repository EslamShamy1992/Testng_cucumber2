package com.ibnsina.testcases.PageObjects;

import com.ibnsina.testcases.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BirthdatePage extends BasePage {
    public BirthdatePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath= ("//*[@id=\"gender\"]/div[1]"))
    private WebElement Gender;
    @FindBy(xpath = ("//*[@id=\"gender\"]/div[2]/ul/li[1]"))
    private WebElement Male;
    @FindBy(id= ("input_birth_date"))
    private WebElement birthdate;
    @FindBy(id= ("acceptTC"))
    private WebElement TermsCondition;
    @FindBy(xpath= ("//*[@id=\"confirmBtn\"]/span[3]"))
    private WebElement SaveButton;



    public void GenderMale(){

        Gender.click();

    }
    public void Male1(){

       Male.click();

    }
    public void Birth_Date(){

        birthdate.sendKeys("21/01/1992");

    }
    public void Terms_Condition(){

        TermsCondition.click();

    }
    public void Save_Button(){

        SaveButton.click();

    }
}
