package com.ibnsina.testcases.TestCases;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class EdTask {

    public static WebDriver driver;
    @Test
    public void Add_Program_For_Fav_List(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(options);
        driver.get("https://www.educatly.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.findElement(By.id("login_email")).sendKeys("eslam_shamy@hotmail.com");
        driver.findElement(By.id("login_password")).sendKeys("1234567");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/a[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"424286\"]/div[1]/div[1]/div[2]/div[2]")).click();
        driver.findElement(By.cssSelector(".styles_header__start__title__favourite__NXwXn")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/div[1]/div[2]/div[3]")).click();
        boolean isdisplayed=  driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/div[2]/div/div[2]/div/div/div[4]/a")).isDisplayed();
        Assert.assertTrue(isdisplayed);
        driver.quit();
    }

    @Test
    public void Change_the_currency_to_Euro(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(options);
        driver.get("https://www.educatly.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.findElement(By.id("login_email")).sendKeys("eslam_shamy@hotmail.com");
        driver.findElement(By.id("login_password")).sendKeys("1234567");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/a[3]")).click();
        WebElement tuition= driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[3]/a/div/div[3]/div[2]/div/div/div[7]/div[1]/span"));
        JavascriptExecutor js=  (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",tuition);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/button")).click();
        tuition.click();
        WebElement currency=  driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div[3]/a/div/div[3]/div[2]/div/div/div[7]/div[2]/div/div"));
        currency.click();
        WebElement dropdown= driver.findElement(By.id("currency"));
        dropdown.click();
        driver.findElement(By.xpath("//*[@id=\"0\"]/div")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]/span")).click();
        String programlist= driver.findElement(By.xpath("//*[@id=\"416555\"]/div[1]/div[1]/div[3]")).getText();
        Assert.assertEquals(programlist,"15,764.00 USD / Year");
        driver.findElement(By.xpath("//*[@id=\"416555\"]/div[1]/div[1]/div[2]/div[2]/span")).click();
        String usd= driver.findElement(By.xpath("//*[@id=\"program-facts\"]/div[2]/div/div[2]/div[3]")).getText();
        Assert.assertEquals(usd,"USD 15,764.00");
        driver.quit();

    }
}
