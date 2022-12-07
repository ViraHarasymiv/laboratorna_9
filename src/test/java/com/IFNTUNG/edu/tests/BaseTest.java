package com.IFNTUNG.edu.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected WebDriver driver;
    private static final String OSCOMMERCE_URL = "http://practice.bpbonline.com/index.php";

    @BeforeSuite
    public void beforeSuite(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeClass
    public void setDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(OSCOMMERCE_URL);
    }

    @AfterSuite
    public void afterSuite(){
        if(driver != null){
            driver.quit();
        }
    }
}
