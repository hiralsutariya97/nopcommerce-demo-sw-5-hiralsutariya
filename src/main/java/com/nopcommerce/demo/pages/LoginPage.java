package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement enterEmailAddress;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement verifyLogoutLinkIsDisplayed;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement verifyLoginLink;

    public void enterEmailID(String email) {
        CustomListeners.test.log(Status.PASS, "Enter email." + email);
        sendTextToElement(enterEmailAddress, email);
    }

    public void enterPassword(String password) {
        CustomListeners.test.log(Status.PASS, "Enter password." + password);
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        CustomListeners.test.log(Status.PASS, "Click on login button");
        clickOnElement(loginButton);
    }

    public String verifyWelcomeText() {
        CustomListeners.test.log(Status.PASS, "Verify welcome text");
        return getTextFromElement(welcomeText);
    }

    public String verifyErrorMessage() {
        CustomListeners.test.log(Status.PASS, "Verify error message");
        return getTextFromElement(errorMessage);
    }

    public void clickOnLogoutLink() {
        CustomListeners.test.log(Status.PASS, "Click on logout link.");
        clickOnElement(logout);
    }

    public String verifyLogoutLinkIsDisplayed() {
        CustomListeners.test.log(Status.PASS, "Logout link is displayed.");
        return getTextFromElement(verifyLogoutLinkIsDisplayed);
    }

    public String verifyLoginLink() {
        CustomListeners.test.log(Status.PASS, "Log in link is displayed.");
        return getTextFromElement(verifyLoginLink);
    }
}
