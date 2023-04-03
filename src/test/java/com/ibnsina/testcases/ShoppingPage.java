package com.ibnsina.testcases.PageObjects;

import com.ibnsina.testcases.Base.BasePage;

import org.openqa.selenium.*;

import org.openqa.selenium.support.FindBy;

public class ShoppingPage extends BasePage {
    public ShoppingPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath= ("//*[@id=\"jm\"]/main/div[2]/div[3]/section/div[1]/article[7]/a/div[2]/h3"))
    private WebElement blueShirt;
    @FindBy(id= ("add-to-cart"))
    private WebElement AddToCart;
    @FindBy(xpath= ("//*[@id=\"pop\"]/div/section/div/div/div[1]/form/button[2]"))
    private WebElement AddOneToCart;
    @FindBy(xpath = ("//*[@id=\"pop\"]/div/section/div/footer/a/text()"))
    private WebElement ViewCartAndCheckOut;
    @FindBy(xpath = ("//*[@id=\"jm\"]/main/div/div[3]/div[2]/div/section/div/div/div[1]/article/a/img"))
    private WebElement AnotherShirt;
    @FindBy(xpath = ("//*[@id=\"add-to-cart\"]/button"))
    private WebElement AddToCart2;
    @FindBy(xpath = ("//*[@id=\"pop\"]/div/section/div/div/div[1]/form/button[2]"))
    private WebElement Addqty;
    @FindBy(xpath = ("//*[@id=\"pop\"]/div/section/div/footer/a"))
    private WebElement ViewCart2;
    @FindBy(xpath = ("//*[@id=\"jm\"]/main/div/div[2]/div/article/div[1]/p[2]"))
    private WebElement SubTotal;

    public WebElement Blue_Shirt() {

        JavascriptExecutor js=  (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",blueShirt);
        return blueShirt;


    }
    public WebElement Add_To_Cart()  {

        JavascriptExecutor js=  (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",AddToCart);
       return  AddToCart;

    }
    public void AddOne_ToCart()  {
        AddOneToCart.click();

    }
    public void ViewCart_AndCheckOut(){

        ViewCartAndCheckOut.click();
    }

    public void Add_Another_Shirt()  {

        AnotherShirt.click();
    }
    public void Add_To_Cart_2(){

        AddToCart2.click();
    }
    public void Add_qty(){

        Addqty.click();
    }
    public void ViewCart_2(){

        ViewCart2.click();
    }
    public WebElement Sub_Total(){

        return SubTotal;
    }

}
