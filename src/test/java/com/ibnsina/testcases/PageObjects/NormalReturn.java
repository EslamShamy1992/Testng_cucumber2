package com.ibnsina.testcases.PageObjects;

import com.ibnsina.testcases.Base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NormalReturn extends BasePage {

    public NormalReturn(WebDriver driver) {
        super(driver);

    }
    @FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/kt-tms-reports/kt-return-invoices-list/kt-portlet/div/kt-portlet-body/div[1]/form/div/div[2]/div[1]/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button/span")
    private WebElement click_on_return_calander;

    @FindBy(xpath= "//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[1]/td[2]")
    private WebElement click_back_button;
    @FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/kt-tms-reports/kt-return-invoices-list/kt-portlet/div/kt-portlet-body/div[1]/form/div/div[1]/div/button[2]")
    private WebElement click_on_search;
    @FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/kt-tms-reports/kt-return-invoices-list/kt-portlet/div/kt-portlet-body/div[2]/mat-paginator/div/div/div[1]/div")
    private WebElement is_name_displayed;



    public void Click_on_return_calander() throws InterruptedException {
        Thread.sleep(9000);
       click_on_return_calander.click();
    }

    public void Click_on_back_button(){

        click_back_button.click();
    }

    public void Click_on_search() {
        click_on_search.click();
    }
    public boolean Is_displayed() throws InterruptedException {

        JavascriptExecutor jr = (JavascriptExecutor) driver;
        jr.executeScript("arguments[0].scrollIntoView();",is_name_displayed);
        Thread.sleep(3000);
            return   is_name_displayed.isDisplayed();

            }


    }

