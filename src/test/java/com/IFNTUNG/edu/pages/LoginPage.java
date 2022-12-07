package com.IFNTUNG.edu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//span[contains(text(), 'Continue')]")
    private WebElement continueButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public CreateAccountPage clickOnContinueButton(){
        continueButton.click();
        return new CreateAccountPage(driver);
    }
}
