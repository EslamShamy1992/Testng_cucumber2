package com.ibnsina.testcases.PageObjects;

import com.ibnsina.testcases.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/map-locations/kt-portlet/div/kt-portlet-header/div[1]/span[2]")
    private WebElement logo;
    @FindBy(xpath = "//*[@id=\"aside-menu scroll\"]/ul/li[6]/a/span")
    private WebElement Click_on_TMS_Report;
    @FindBy(xpath = "//*[@id=\"aside-menu scroll\"]/ul/li[6]/div/ul/li[6]/a/span")
    private WebElement Click_on_empty_box;
    @FindBy(xpath = "//*[@id=\"aside-menu scroll\"]/ul/li[6]/div/ul/li[5]/a/span")
    private WebElement click_on_normal_return;
    @FindBy(xpath = "//*[@id=\"kt_quick_user_toggle\"]/span[3]/span")
    private WebElement click_on_user_profile;
    @FindBy(xpath = "//*[@id=\"kt_quick_user\"]/div[2]/div/div[1]/div[2]/a[2]")
    private WebElement click_on_logout;

    public Boolean getIbnsina_logo() {
        return logo.isDisplayed();
}
   public void ClickOnTmsReport(){
       Click_on_TMS_Report.click();
   }

    public EmptyBoxPage ClickOnEmptyBoxReport(){
        Click_on_empty_box.click();
        return new EmptyBoxPage(driver);
    }

    public NormalReturn Click_on_normal_return() {
        click_on_normal_return.click();
        return new NormalReturn(driver);
    }

    public void setClick_on_user_profile(WebElement click_on_user_profile) {
        click_on_user_profile.click();
    }

    public void setClick_on_logout(WebElement click_on_logout) {
        click_on_logout.click();
    }
}
