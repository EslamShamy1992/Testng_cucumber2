package com.ibnsina.testcases.PageObjects;

import com.ibnsina.testcases.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterationPage extends BasePage {
    public RegisterationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id= ("input_identifierValue"))
    private WebElement EnterEmail;
    @FindBy(xpath = ("//*[@type='submit']"))
    private WebElement ContinueButton;
    @FindBy(name = ("password"))
    private WebElement Password1;
    @FindBy(xpath= ("//*[@id=\"card_password\"]/div[4]/label/input"))
    private WebElement ConfirmPassword;
    @FindBy(xpath= ("//*[@id=\"card_password\"]/div[5]/div/button/span[3]"))
    private WebElement ContinueRegisterButton;
    @FindBy(xpath= ("//*[@id=\"loginButton\"]/span[3]"))
    private WebElement  loginButton;

    public void Enter_Email(){

      EnterEmail.sendKeys("Eslamelshamy1992@gmail.com");

    }
    public void Continue_Button(){

      ContinueButton.click();

    }
    public void Password_1(){

      Password1.sendKeys("Eslam1992@");

    }
    public void Password_2(){

      ConfirmPassword.sendKeys("Eslam1992@");

    }
    public void Continue_Register_Button(){

       ContinueRegisterButton.click();

    }
    public void Login_Button(){

        loginButton.click();
    }
}
