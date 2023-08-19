package com.avenuee.tests;

import com.avenuee.pages.DashBoardPage;
import com.avenuee.pages.RegisterUserPage;
import com.avenuee.utilities.BaseClass;
import com.avenuee.utilities.BrowserUtils;
import com.avenuee.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterUserTest extends BaseClass {

    DashBoardPage dashBoardPage=new DashBoardPage();
    RegisterUserPage registerUserPage =new RegisterUserPage();
    @BeforeMethod
    public void setUpMethod(){
        driver.get(ConfigurationReader.getProperty("automation.baseurl") +
                "/login");


    }
//    @Test
//    public void CreateAccountTest() throws InterruptedException {
//
//        BrowserUtils.pageVerification("Automation Exercise - Signup / Login", driver.getTitle());
//
//        dashBoardPage.clickOnSignUpLink();
//        Assert.assertTrue(dashBoardPage.isNameFieldDisplayed());
//        registerUserPage.clickOnSignUpLink();
//    }


    @Test
    public void CreateAccount() throws InterruptedException {

        BrowserUtils.pageVerification("Automation Exercise - Signup / Login", driver.getTitle());

        dashBoardPage.clickOnSignUpLink();
        registerUserPage.SignUp();
        registerUserPage.clickOnMrRadioBtn();
        registerUserPage.SignUp2();

       Assert.assertTrue(registerUserPage.isMessageDisplayedCreateAccount());
    }




}
