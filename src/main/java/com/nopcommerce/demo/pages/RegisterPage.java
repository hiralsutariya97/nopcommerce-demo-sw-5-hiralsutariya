package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement clickOnRegisterLink;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyRegisterText;

    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement genderMale;

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement genderFemale;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameOption;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameOption;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement enterPasswordOption;
    @CacheLookup
    @FindBy(name = "ConfirmPassword")
    WebElement enterConfirmPassword;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameError;
    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameError;
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDay;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthOfBirthDay;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement yearOfBirthDay;
    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailError;
    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordError;
    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordError;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyRegistration;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueTab;

    public void clickOnRegisterLink() {
        clickOnElement(clickOnRegisterLink);
    }

    public String verifyRegisterText() {
        CustomListeners.test.log(Status.PASS, "Verify register text");
        return getTextFromElement(verifyRegisterText);
    }

    public void selectGender(String maleOrFemale) {
        CustomListeners.test.log(Status.PASS, "Select gender." + maleOrFemale);
        switch (maleOrFemale) {
            case "Male":
                clickOnElement(genderMale);
                break;
            case "Female":
                clickOnElement(genderFemale);
                break;
            default:
                break;
        }
    }


    public void firstNameOption(String firstName) {
        CustomListeners.test.log(Status.PASS, "Enter first name." + firstName);
        sendTextToElement(firstNameOption, firstName);
    }

    public void lastNameOption(String lastName) {
        CustomListeners.test.log(Status.PASS, "Enter last name." + lastName);
        sendTextToElement(lastNameOption, lastName);
    }

    public void dateOfBirthDay(String day) {
        CustomListeners.test.log(Status.PASS, "Enter day for date of birth." + day);
        selectByVisibleTextFromDropDown(dateOfBirthDay, day);
    }

    public void dateOfBirthMonth(String month) {
        CustomListeners.test.log(Status.PASS, "Enter month for date of birth." + month);
        selectByVisibleTextFromDropDown(monthOfBirthDay, month);
    }

    public void dateOfBirthYear(String year) {
        CustomListeners.test.log(Status.PASS, "Enter year for date of birth." + year);
        selectByVisibleTextFromDropDown(yearOfBirthDay, year);
    }



    public void enterPasswordOption(String password) {
        CustomListeners.test.log(Status.PASS, "Enter password." + password);
        sendTextToElement(enterPasswordOption, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        CustomListeners.test.log(Status.PASS, "Enter confirm password." + confirmPassword);
        sendTextToElement(enterConfirmPassword, confirmPassword);
    }

    public void clickOnRegisterButton() {
        CustomListeners.test.log(Status.PASS, "Click on register button");
        clickOnElement(registerButton);
    }

    public String verifyFirstNameError() {
        CustomListeners.test.log(Status.PASS, "Verify first name error");
        return getTextFromElement(firstNameError);
    }

    public String verifyLastNameError() {
        CustomListeners.test.log(Status.PASS, "Verify last name error");
        return getTextFromElement(lastNameError);
    }

    public String verifyPasswordError() {
        CustomListeners.test.log(Status.PASS, "Verify password error");
        return getTextFromElement(passwordError);
    }

    public String verifyConfirmPasswordError() {
        CustomListeners.test.log(Status.PASS, "Verify confirm password error");
        return getTextFromElement(confirmPasswordError);
    }

    public String verifyEmailError() {
        CustomListeners.test.log(Status.PASS, "Verify email error");
        return getTextFromElement(emailError);
    }

    public String verifyRegistrationCompleteMessage() {
        CustomListeners.test.log(Status.PASS, "Verify registration complete message");
        return getTextFromElement(verifyRegistration);
    }

    public void clickOnContinueTab() {
        CustomListeners.test.log(Status.PASS, "Click on continue tab");
        clickOnElement(continueTab);
    }
}
