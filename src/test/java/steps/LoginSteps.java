package steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class LoginSteps {

    WebDriver driver;

    @Given("user open the website and go to login page")
        public void user_open_the_website_and_go_to_login_page(){
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://tms-qa.ibnsina-pharma.com/auth/login");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));

        }
        @When("user fill the email as {string} and {string} and clicks on login button")
    public void user_fill_the_email_and_password_and_clicks_on_login_button(String username,String Password){
        WebElement email= driver.findElement(By.id("mat-input-0"));
        email.clear();
        email.sendKeys(username);
        WebElement password=driver.findElement(By.id("mat-input-1"));
        password.clear();
        password.sendKeys(Password);
        driver.findElement(By.id("kt_login_signin_submit")).click();
        }

        @Then("user will be redirected to home page")
    public void user_will_be_redirected_to_home_page(){
        boolean isdisplayed=driver.findElement(By.xpath("//*[@id=\"kt_quick_user_toggle\"]/span[1]")).isDisplayed();
            Assert.assertTrue(isdisplayed);
        }
        @Then("error message should appears")
    public void error_message_should_appears(){
      boolean erromessage=  driver.findElement(By.xpath("//*[@id=\"kt_login\"]/div[2]/kt-login/div/div/kt-auth-notice/div/div")).isDisplayed();
      Assert.assertTrue(erromessage);
        }
    @And("click on tms report and point")
    public void click_on_tms_report_and_point(){
        WebElement tmsreport=driver.findElement(By.xpath("//*[@id=\"kt_header_menu\"]/ul/li[4]/a/span[2]"));
        tmsreport.click();
        driver.findElement(By.xpath("//*[@id=\"kt_header_menu\"]/ul/li[4]/div/ul/li[3]/a/span[2]")).click();

    }


    @Then("point report is opened")
    public void point_report_is_opened(){
       boolean roundfield = driver.findElement(By.id("mat-input-11")).isDisplayed();
       Assert.assertTrue(roundfield);

    }

    @And("click on tms report and expire")
    public void click_On_Tms_Report_And_Expire() {
        WebElement tmsreport=driver.findElement(By.xpath("//*[@id=\"kt_header_menu\"]/ul/li[4]/a/span[2]"));
        tmsreport.click();
        driver.findElement(By.xpath("//*[@id=\"kt_header_menu\"]/ul/li[4]/div/ul/li[4]/a/span[2]")).click();
    }

    @Then("expire report is opend")
    public void expire_Report_Is_Opend() {
        boolean tripstatus =driver.findElement(By.xpath("//*[@id=\"mat-select-7\"]/div/div[1]/span")).isDisplayed();
        Assert.assertTrue(tripstatus);
    }
}
