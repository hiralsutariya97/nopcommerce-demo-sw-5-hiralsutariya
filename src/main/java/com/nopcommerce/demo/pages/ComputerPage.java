package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computersText;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement mouseHoverOnComputersTab;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement clickOnDesktopsLink;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]")
    WebElement clickOnNotebooksLink;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]")
    WebElement clickOnSoftwareLink;


    public String verifyComputersText() {
        CustomListeners.test.log(Status.PASS, "Verify computers text.");
        return getTextFromElement(computersText);
    }

    public void mouseHoverOnComputersTab() {
        CustomListeners.test.log(Status.PASS, "Mouse Hovered on Computers Tab");
        mouseHoverToElementAndClick(mouseHoverOnComputersTab);
    }

    public void clickOnDesktopsTab() {
        CustomListeners.test.log(Status.PASS, "Clicked on Desktops Link.");
        clickOnElement(clickOnDesktopsLink);
    }

    public void clickOnNotebooksLink() {
        CustomListeners.test.log(Status.PASS, "Clicked on Notebooks Link.");
        clickOnElement(clickOnNotebooksLink);
    }

    public void clickOnSoftwareLink() {
        CustomListeners.test.log(Status.PASS, "Click on Software Link.");
        clickOnElement(clickOnSoftwareLink);
    }

}
