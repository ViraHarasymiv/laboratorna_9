package com.IFNTUNG.edu.pages;

import com.IFNTUNG.edu.utils.ConfigurationReader;
import com.IFNTUNG.edu.utils.StringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage{
    private final String USER_NAME = ConfigurationReader.get().getUserName();
    private final String USER_LAST_NAME = ConfigurationReader.get().getUserLastName();
    private final String USER_BIRTHDAY = ConfigurationReader.get().getUserBirthDay();
    private final int FIX_LENGTH = 8;
    private final String USER_EMAIL = StringUtils.generateRandomEmail(FIX_LENGTH);
    private final String USER_COMPANY = ConfigurationReader.get().getUserCompany();
    private final String USER_STREET = ConfigurationReader.get().getUserStreet();
    private final String USER_POSTCODE = ConfigurationReader.get().getUserPostCode();
    private final String USER_CITY = ConfigurationReader.get().getUserCity();
    private final String USER_STATE = ConfigurationReader.get().getUserState();
    private final String TELEPHONE_NUMBER = ConfigurationReader.get().getTelephoneNumber();
    private final String PASSWORD = ConfigurationReader.get().getPassword();

    @FindBy(xpath = "//input[@value='m']")
    private WebElement genderRadioButton;
    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastNameField;
    @FindBy(xpath = "//input[@class='hasDatepicker']")
    private WebElement dateOfBirth;
    @FindBy(xpath = "//input[@name='email_address']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@name='company']")
    private WebElement companyNameField;
    @FindBy(xpath = "//input[@name='street_address']")
    private WebElement streetAddressField;
    @FindBy(xpath = "//input[@name='postcode']")
    private WebElement postCodeField;
    @FindBy(xpath = "//input[@name='city']")
    private WebElement cityField;
    @FindBy(xpath = "//input[@name='state']")
    private WebElement stateField;
    @FindBy(xpath = "//select[@name='country']")
    private WebElement selectCountryMenu;
    @FindBy(xpath = "//option[contains(text(), 'Ukraine')]")
    private WebElement ukraineOption;
    @FindBy(xpath = "//input[@name='telephone']")
    private WebElement telephoneNumber;
    @FindBy(xpath = "//input[@name='newsletter']")
    private WebElement newsletterCheckbox;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@name='confirmation']")
    private WebElement passwordFieldConfirmation;
    @FindBy(xpath = "//span[contains(text(), 'Continue')]")
    private WebElement submitButton;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public CreateAccountPage selectGender() {
        genderRadioButton.click();
        return this;
    }

    public CreateAccountPage enterFirstName() {
        firstNameField.sendKeys(USER_NAME);
        return this;
    }

    public CreateAccountPage enterLastName() {
        lastNameField.sendKeys(USER_LAST_NAME);
        return this;
    }

    public CreateAccountPage enterDateOfBirth() {
        dateOfBirth.sendKeys(USER_BIRTHDAY);
        dateOfBirth.sendKeys(Keys.RETURN);
        return this;
    }

    public CreateAccountPage enterUserEmail() {
        emailField.sendKeys(USER_EMAIL);
        return this;
    }

    public CreateAccountPage enterCompanyName() {
        companyNameField.sendKeys(USER_COMPANY);
        return this;
    }

    public CreateAccountPage enterStreetAddress() {
        streetAddressField.sendKeys(USER_STREET);
        return this;
    }

    public CreateAccountPage enterPostCode() {
        postCodeField.sendKeys(USER_POSTCODE);
        return this;
    }

    public CreateAccountPage enterUserCity() {
        cityField.sendKeys(USER_CITY);
        return this;
    }

    public CreateAccountPage enterUserState() {
        stateField.sendKeys(USER_STATE);
        return this;
    }

    public CreateAccountPage selectCountry() {
        selectCountryMenu.click();
        ukraineOption.click();
        return this;
    }

    public CreateAccountPage enterTelephoneNumber() {
        telephoneNumber.sendKeys(TELEPHONE_NUMBER);
        return this;
    }

    public CreateAccountPage checkNewsLetterCheckBox() {
        newsletterCheckbox.click();
        return this;
    }

    public CreateAccountPage createPassword() {
        passwordField.sendKeys(PASSWORD);
        passwordFieldConfirmation.sendKeys(PASSWORD);
        return this;
    }

    public AccountSuccessPage submitEnteredInformation() {
        submitButton.click();
        return new AccountSuccessPage(driver);
    }
}
