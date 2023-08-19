package com.avenuee.tests;

import com.avenuee.pages.ContactUsPage;
import com.avenuee.pages.DashBoardPage;
import com.avenuee.pages.LogInPage;
import com.avenuee.pages.RegisterUserPage;
import com.avenuee.utilities.BaseClass;
import com.avenuee.utilities.BrowserUtils;
import com.avenuee.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactUsTest extends BaseClass {


    DashBoardPage dashBoardPage=new DashBoardPage();
    RegisterUserPage registerUserPage =new RegisterUserPage();
    LogInPage logInPage=new LogInPage();
    ContactUsPage contactUsPage=new ContactUsPage();

    @BeforeMethod
    public void setUpMethod(){
        driver.get(ConfigurationReader.getProperty("automation.baseurl") +
                "/contact_us");


    }
    @Test
    public void contactUsTest() throws InterruptedException {

        BrowserUtils.pageVerification("Automation Exercise - Contact Us", driver.getTitle());
        contactUsPage.contactUs();
        Assert.assertTrue(contactUsPage.isMessageDisplayedcontact());

    }
}
