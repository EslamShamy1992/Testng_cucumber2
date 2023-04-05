package com.ibnsina.testcases.TestCases;

import com.ibnsina.testcases.Base.BaseTest;
import com.ibnsina.testcases.PageObjects.*;
import com.ibnsina.testcases.Utils.ConfigUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class EvaTask extends BaseTest {

    JumiaHomePage home;
    RegisterationPage register;
    PersonalDetailsPage personaldetails;
    BirthdatePage birthdate;
    ShoppingPage shopping;
    @Test
    public void OpenTheWebSiteAndClickOnTheAccount()  {
        driver.get(ConfigUtils.getInstance().getBaseUrl());
        home= new JumiaHomePage(driver);
        home.Cancel_Button();
        home.Account_Button();
        home.Sign_Button();
    }

    @Test
    public void CreateNewAccount(){
        driver.get(ConfigUtils.getInstance().getBaseUrl());
        home= new JumiaHomePage(driver);
        home.Cancel_Button();
        home.Account_Button();
        home.Sign_Button();
        register= new RegisterationPage(driver);
        register.Enter_Email();
        register.Continue_Button();
        register.Password_1();
        register.Password_2();
        register.Continue_Register_Button();
        personaldetails= new PersonalDetailsPage(driver);
        personaldetails.First_Name();
        personaldetails.Last_Name();
        personaldetails.Phone_Number();
        personaldetails.Submit_Data_Button();
        birthdate= new BirthdatePage(driver);
        birthdate.GenderMale();
        birthdate.Male1();
        birthdate.Birth_Date();
        birthdate.Terms_Condition();
        birthdate.Save_Button();

    }

    @Test
    public void LoginANdAddShirtsToTheCart() throws InterruptedException {
        driver.get(ConfigUtils.getInstance().getBaseUrl());
        home= new JumiaHomePage(driver);
        register= new RegisterationPage(driver);
        shopping= new ShoppingPage(driver);
        home.Cancel_Button();
        home.Account_Button();
        home.Sign_Button();
        register.Enter_Email();
        register.Continue_Button();
        register.Password_1();
        register.Login_Button();
        Thread.sleep(5000);
        WebElement fashion=home.Fashion_Button();
        Actions actions= new Actions(driver);
        actions.moveToElement(fashion).perform();
        home.Shirts_Text();
        WebElement blue= shopping.Blue_Shirt();
        blue.click();
        shopping.Blue_Shirt();
        WebElement addtocart=shopping.Add_To_Cart();
        addtocart.click();
        shopping.AddOne_ToCart();
        shopping.ViewCart_AndCheckOut();
        shopping.Add_Another_Shirt();
        shopping.Add_To_Cart_2();
        shopping.Add_qty();
        shopping.ViewCart_2();
        String subtotal=shopping.Sub_Total().getText();
        Assert.assertEquals(subtotal,"EGP 640.00");


    }





}
