package com.avenuee.tests;

import com.avenuee.pages.DashBoardPage;
import com.avenuee.pages.LogInPage;
import com.avenuee.pages.RegisterUserPage;
import com.avenuee.pages.SearchProductPage;
import com.avenuee.utilities.BaseClass;
import com.avenuee.utilities.BrowserUtils;
import com.avenuee.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterCheckoutTest extends BaseClass {


    DashBoardPage dashBoardPage=new DashBoardPage();
    RegisterUserPage registerUserPage =new RegisterUserPage();
    LogInPage logInPage=new LogInPage();
    SearchProductPage searchProductPage=new SearchProductPage();
    @BeforeMethod
    public void setUpMethod(){
        driver.get(ConfigurationReader.getProperty("automation.baseurl") +
                "/products");
    }
    @Test
    public void registerCheckoutTest() throws InterruptedException {
      //  WaitUtils.waitForElementToBeVisible();

        BrowserUtils.pageVerification("Automation Exercise - All Products", driver.getTitle());
        //Thread.sleep(4000);

        searchProductPage.registerWhileCheckout();
        registerUserPage.SignUp();
        registerUserPage.SignUp2();
        searchProductPage.clickOnContinueBtn();
        dashBoardPage.clickOnCartBtn();
        searchProductPage.clickOnCheckOut();
        searchProductPage.navigateToPlaceOrder();
        searchProductPage.clickPlaceOrder();
        Thread.sleep(2000);//if its visible alert if and else
        searchProductPage.paymentCart();
        Assert.assertTrue(searchProductPage.isContinueBtnOrderPlaced());
    }
}
