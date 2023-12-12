package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'top-menu notmobile']")
    WebElement topMenu;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement nopcommerceLogo;
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='My account']")
    WebElement clickOnMyAccountLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'top-menu notmobile']/li")
    List<WebElement> menuTop;

    public void selectTopMenu(String topMenu) {
        for (WebElement allMenu : menuTop) {
            if (allMenu.getText().equalsIgnoreCase(topMenu)) {
                clickOnElement(allMenu);
                break;
            }
        }
    }

    public boolean nopCommerceLogoIsDisplayed() {
        CustomListeners.test.log(Status.PASS, "Verify nopcommerce logo is displayed.");
        return nopcommerceLogo.isDisplayed();
    }

    public void clickOnLoginLink() {
        CustomListeners.test.log(Status.PASS, "Click on login link.");
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        CustomListeners.test.log(Status.PASS, "Click on Register link.");
        clickOnElement(registerLink);
    }

    public void clickOnMyAccountLink() {
        CustomListeners.test.log(Status.PASS, "Click on My Account link.");
        clickOnElement(clickOnMyAccountLink);
    }

    public void clickOnTopMenu() {
        CustomListeners.test.log(Status.PASS, "Click on Top menu link.");
        clickOnElement(topMenu);
    }

}
