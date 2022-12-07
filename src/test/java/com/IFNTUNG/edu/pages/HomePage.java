package com.IFNTUNG.edu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), 'My Account')]")
    private WebElement myAccountMenu;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickOnMyAccountButton(){
        myAccountMenu.click();
        return new LoginPage(driver);
    }
}
