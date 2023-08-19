package com.avenuee.tests;

import com.avenuee.pages.DashBoardPage;
import com.avenuee.pages.RegisterUserPage;
import com.avenuee.pages.TestCasesPage;
import com.avenuee.utilities.BaseClass;
import com.avenuee.utilities.BrowserUtils;
import com.avenuee.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifySubscriptionTest extends BaseClass {

    DashBoardPage dashBoardPage=new DashBoardPage();
    RegisterUserPage registerUserPage =new RegisterUserPage();
    TestCasesPage testCasesPage=new TestCasesPage();
    @BeforeMethod
    public void setUpMethod(){
        // dashBoardPage.clickOnTestCaseBtn();
        driver.get(ConfigurationReader.getProperty("automation.baseurl"));


    }
    @Test
    public void VerifySubscription() throws InterruptedException {

        BrowserUtils.pageVerification("Automation Exercise", driver.getTitle());
        dashBoardPage.subscriptionFieldM();

        Assert.assertTrue(dashBoardPage.isSuccessfulTextPresent());

    }
}
