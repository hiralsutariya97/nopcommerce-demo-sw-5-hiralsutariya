package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement verifyBuildYourOwnComputerText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorOption;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramOption;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement selectHddOption;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement OsOption;

    @CacheLookup
    @FindBy(xpath = "(//input[@id='product_attribute_5_10'])[1]")
    WebElement msOfficeCheckBoxLocator;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement selectSoftwareOption;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement verifyTextFromPriceHeading;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement clickOnAddToCartButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]")
    WebElement productAddedToCartText;

    public String verifyBuildYourOwnComputerText() {
        CustomListeners.test.log(Status.PASS, "Verify Build Your Own Computer Text");
        return getTextFromElement(verifyBuildYourOwnComputerText);
    }

    public void processorOption(String processor) {
        CustomListeners.test.log(Status.PASS, "Processor selected");
        selectByVisibleTextFromDropDown(processorOption, processor);
    }


    public void selectRamOption(String ram) {
        CustomListeners.test.log(Status.PASS, "Ram selected");
        selectByVisibleTextFromDropDown(ramOption, ram);
    }

    public void selectHddOption(String hdd) {
        CustomListeners.test.log(Status.PASS, "Hdd selected");
        clickOnElement(selectHddOption);
    }

    public void clickOnOsOption(String Os) {
        CustomListeners.test.log(Status.PASS, "Operating System selected");
        clickOnElement(OsOption);
    }

    public void selectSoftwareOption(String software1) {
        CustomListeners.test.log(Status.PASS, "Operating System selected");
        clickOnElement(selectSoftwareOption);
    }

    public String verifyTextFromPriceHeading() {
        CustomListeners.test.log(Status.PASS, "Price Text verified");
        return getTextFromElement(verifyTextFromPriceHeading);
    }

    public void clickOnAddToCartButton() {
        CustomListeners.test.log(Status.PASS, "Product added to cart");
        clickOnElement(clickOnAddToCartButton);
    }

    public String productAddedToCartText() {
        CustomListeners.test.log(Status.PASS, "The product has been added to your shopping cart verified");
        return getTextFromElement(productAddedToCartText);
    }
}
