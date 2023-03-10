package com.ibnsina.testcases.TestCases;
import com.ibnsina.testcases.Base.BaseTest;
import com.ibnsina.testcases.PageObjects.EmptyBoxPage;
import com.ibnsina.testcases.PageObjects.HomePage;
import com.ibnsina.testcases.PageObjects.LoginPage;
import com.ibnsina.testcases.PageObjects.NormalReturn;
import com.ibnsina.testcases.Utils.ConfigUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
public class dummy extends BaseTest {
    @Test(priority = 1)
    public void should_be_ableToLogin()  {
        driver.get(ConfigUtils.getInstance().getBaseUrl());
        LoginPage login= new LoginPage(driver);
        login.setEmail();
        login.setPassword();
        HomePage homepage= login.click_on_sign_in_button();
      Boolean is_logo_displayed=homepage.getIbnsina_logo();
        Assert.assertTrue(is_logo_displayed);
    }

    @Test(priority = 2)
    public void should_be_ableToOpenEmptyBoxReport() throws InterruptedException {
        driver.get(ConfigUtils.getInstance().getBaseUrl());
        LoginPage login= new LoginPage(driver);
        login.setEmail();
        login.setPassword();
        HomePage homepage=login.click_on_sign_in_button();
        homepage.ClickOnTmsReport();
        EmptyBoxPage empty= homepage.ClickOnEmptyBoxReport();
        empty.setClick_on_calender();
        empty.setClick_on_back_arrow();
        empty.setClick_on_1();
        empty.setClick_on_search_button();
      boolean actual_result= empty.getPointName();
      Assert.assertTrue(actual_result);

    }
    @Test(priority = 3)
    public void should_be_able_ToOpenNormalReturnReport() throws InterruptedException {
        Thread.sleep(9000);
        driver.get(ConfigUtils.getInstance().getBaseUrl());
        LoginPage login= new LoginPage(driver);
        login.setEmail();
        login.setPassword();
        HomePage homepage= login.click_on_sign_in_button();
        homepage.ClickOnTmsReport();
        NormalReturn normalReturn= homepage.Click_on_normal_return();
        normalReturn.Click_on_return_calander();
        normalReturn.Click_on_back_button();
       normalReturn.Click_on_search();
       boolean actual_result= normalReturn.Is_displayed();
       Assert.assertTrue(actual_result);

    }
}
