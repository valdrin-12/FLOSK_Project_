package com.avenuee.tests;

import com.avenuee.pages.DashBoardPage;
import com.avenuee.pages.RegisterUserPage;
import com.avenuee.pages.SearchProductPage;
import com.avenuee.utilities.BaseClass;
import com.avenuee.utilities.BrowserUtils;
import com.avenuee.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveProductFromCartTest extends BaseClass {

    DashBoardPage dashBoardPage=new DashBoardPage();
    RegisterUserPage registerUserPage =new RegisterUserPage();
    SearchProductPage searchProductPage=new SearchProductPage();
    @BeforeMethod
    public void setUpMethod(){
        driver.get(ConfigurationReader.getProperty("automation.baseurl") +
                "/products");


    }

    @Test
    public void removeProductFromCart() throws InterruptedException {

        BrowserUtils.pageVerification("Automation Exercise - All Products", driver.getTitle());


        int timesToAddToCart = 2;
        searchProductPage.clickOnAddCart(timesToAddToCart);

        Thread.sleep(1000);
        searchProductPage.deleteItemCart();

        Assert.assertTrue(searchProductPage.isTextEmptyCartDisplayed());

    }


}
