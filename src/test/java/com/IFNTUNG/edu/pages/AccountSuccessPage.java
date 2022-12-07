package com.IFNTUNG.edu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSuccessPage extends BasePage{

    @FindBy(xpath = "//h1")
    private WebElement actualMessage;

    public AccountSuccessPage(WebDriver driver) {
        super(driver);
    }
    public String getActualMessage(){
        waitForElementToAppear(actualMessage);
        return actualMessage.getText();
    }
}
