package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class RegisterTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();

    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {

        //Click on Register Link
        registerPage.clickOnRegisterLink();

        //Verify "Register" text
        String expected = "Register";
        Assert.assertEquals(registerPage.verifyRegisterText(),expected,"Register tab does not display");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {

        //Click on Register Link
        registerPage.clickOnRegisterLink();

        //Click on "REGISTER" button
        registerPage.clickOnRegisterButton();

        //Verify the error message "First name is required."
        String expected2 = "First name is required.";
        Assert.assertEquals(registerPage.verifyFirstNameError(),expected2,"Error Message");

        //Verify the error message "Last name is required."
        String expected3 = "Last name is required.";
        Assert.assertEquals(registerPage.verifyLastNameError(),expected3,"Error message");

        //Verify the error message "Email is required."
        String expected4 = "Email is required.";
        Assert.assertEquals(registerPage.verifyEmailError(),expected4,"Error Message");

        //Verify the error message "Password is required."
        String expected5 = "Password is required.";
        Assert.assertEquals(registerPage.verifyPasswordError(),expected5,"Error Message");

        //Verify the error message "Password is required."
        String expected6 = "Password is required.";
        Assert.assertEquals(registerPage.verifyConfirmPasswordError(),expected6,"Error Message");
    }

    @Test (groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully() throws InterruptedException {

        //Click on Register Link
        registerPage.clickOnRegisterLink();

        //Select gender "Female"
        registerPage.selectGender("Female");

        //Enter firstname
        registerPage.firstNameOption("Hiral");

        //Enter lastname
        registerPage.lastNameOption("Sutariya");

        //Select day
        registerPage.dateOfBirthDay("07");

        //Select month
        registerPage.dateOfBirthMonth("March");

        //Select year
        registerPage.dateOfBirthYear("1990");
        Thread.sleep(2000);

        //Enter email
        //enterEmailAddress();

        //Enter password
        registerPage.enterPasswordOption("Hiral123");

        //Enter Confirm Password
        registerPage.enterConfirmPassword("Hiral123");

        //Click on "REGISTER" button
        registerPage.clickOnRegisterButton();

        //Verify message "Your registration completed"
        String expected7 = "Your registration completed";
        Assert.assertEquals(registerPage.verifyRegistrationCompleteMessage(),expected7,"Error Message");

    }
}
