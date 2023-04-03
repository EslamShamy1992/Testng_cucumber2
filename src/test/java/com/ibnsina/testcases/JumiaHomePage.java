package com.ibnsina.testcases.PageObjects;

import com.ibnsina.testcases.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class JumiaHomePage extends BasePage {
    public JumiaHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath= ("//*[@id=\"pop\"]/div/section/button"))
    private WebElement CancelButton;
    @FindBy(xpath = ("//*[@id=\"jm\"]/header/section/div[2]/div[1]/label"))
    private WebElement AccountButton;
    @FindBy(xpath = ("//*[@id=\"dpdw-login-box\"]/div/div/a"))
    private WebElement SignInButton;
    @FindBy(xpath = ("//*[@id=\"jm\"]/main/div[1]/div[1]/div[1]/div/a[2]"))
    private WebElement FashionButton;
    @FindBy(xpath = ("//*[@id=\"jm\"]/main/div[1]/div[1]/div[1]/div/div[2]/div/div[2]/div[1]/a[5]"))
    private WebElement Shirts;
    @FindBy(xpath = ("//*[@id=\"jm\"]/article/div/button/span"))
    private WebElement CancelPolicy;
    public void Cancel_Button(){

        CancelButton.click();

    }
    public void Account_Button(){

        AccountButton.click();
    }
    public void Sign_Button(){

        SignInButton.click();
    }

    public WebElement Fashion_Button(){

     return FashionButton;
    }
    public void Shirts_Text(){

        Shirts.click();
    }
    public void Cancel_policy(){

        CancelPolicy.click();
    }
}
