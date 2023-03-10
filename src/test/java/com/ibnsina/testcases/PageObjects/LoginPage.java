package com.ibnsina.testcases.PageObjects;

import com.ibnsina.testcases.Base.BasePage;
import com.ibnsina.testcases.Utils.ConfigUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="mat-input-0")
   private  WebElement email;
    @FindBy(id = "mat-input-1")
    private WebElement password;
    @FindBy(id = "kt_login_signin_submit")
    private WebElement sign_in_button;

    public void setEmail(){

        email.clear();
        email.sendKeys(ConfigUtils.getInstance().getEmail());
    }
    public void setPassword( ) {
        password.clear();
        password.sendKeys(ConfigUtils.getInstance().getPassword());

    }
    public HomePage click_on_sign_in_button() {
        sign_in_button.click();
        return new HomePage(driver);
    }}
