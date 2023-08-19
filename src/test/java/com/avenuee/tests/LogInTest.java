package com.avenuee.tests;

import com.avenuee.pages.DashBoardPage;
import com.avenuee.pages.LogInPage;
import com.avenuee.pages.RegisterUserPage;
import com.avenuee.utilities.BaseClass;
import com.avenuee.utilities.BrowserUtils;
import com.avenuee.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTest extends BaseClass {


    DashBoardPage dashBoardPage=new DashBoardPage();
    RegisterUserPage registerUserPage =new RegisterUserPage();
    LogInPage logInPage=new LogInPage();

    @BeforeMethod
    public void setUpMethod(){
        driver.get(ConfigurationReader.getProperty("automation.baseurl") +
                "/login");


    }
    @Test
    public void logInTest() throws InterruptedException {

        BrowserUtils.pageVerification("Automation Exercise - Signup / Login", driver.getTitle());

        logInPage.SignIn();

        Assert.assertTrue(logInPage.isLoggedInDisplayed());

    }
}
