package com.ibnsina.testcases.Driverfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class factory {



    public static WebDriver driver;

    public static WebDriver intializeDriver(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.manage().window().maximize();
        return driver;
    }


}
