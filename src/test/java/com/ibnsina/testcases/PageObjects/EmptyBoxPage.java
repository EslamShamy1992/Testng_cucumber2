package com.ibnsina.testcases.PageObjects;
import com.ibnsina.testcases.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class EmptyBoxPage extends BasePage {
    public EmptyBoxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath= "//*[@id=\"kt_content\"]/div/div/kt-tms-reports/kt-trip-empty-box-report-list/kt-portlet/div/kt-portlet-body/div[1]/form/div/div[2]/div[1]/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button")
    private WebElement Click_on_calender;
    @FindBy(xpath = "//*[@id=\"mat-datepicker-0\"]/mat-calendar-header/div/div/button[2]")
    private WebElement Click_on_back_arrow;
    @FindBy(xpath = "//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[1]/td[2]")
    private WebElement Click_on_1;
    @FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/kt-tms-reports/kt-trip-empty-box-report-list/kt-portlet/div/kt-portlet-body/div[1]/form/div/div[1]/div/button[2]/span/span")
    private WebElement Click_on_search_button;
    @FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/kt-tms-reports/kt-trip-empty-box-report-list/kt-portlet/div/kt-portlet-body/mat-table/mat-row/mat-cell[8]")
    private WebElement point_name;

    public void setClick_on_calender() throws InterruptedException {
        Thread.sleep(9000);
        Click_on_calender.click();

    }

    public void setClick_on_back_arrow() {
        Click_on_back_arrow.click();
    }

    public void setClick_on_1() {
        Click_on_1.click();
    }

    public void setClick_on_search_button() {
        Click_on_search_button.click();
    }

    public boolean getPointName() {
        return point_name.isDisplayed();
    }
}
