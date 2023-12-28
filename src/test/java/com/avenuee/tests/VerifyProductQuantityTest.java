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

public class VerifyProductQuantityTest extends BaseClass {

    DashBoardPage dashBoardPage=new DashBoardPage();
    RegisterUserPage registerUserPage =new RegisterUserPage();
    SearchProductPage searchProductPage=new SearchProductPage();
    @BeforeMethod
    public void setUpMethod(){
        driver.get(ConfigurationReader.getProperty("automation.baseurl") +
                "/products");
    }
    @Test
    public void verifyQuantity() throws InterruptedException {

        BrowserUtils.pageVerification("Automation Exercise - All Products", driver.getTitle());

        int timesToAddToCart = 2;
        searchProductPage.clickOnAddCart(timesToAddToCart);
        // searchProductPage.clickOnAddCart();
        Thread.sleep(4000);
       // Thread.sleep(4000);
        // Verify that the cart quantity is as expected
        boolean isQuantityDisplayed = searchProductPage.isCartQuantityVisibleAndEqualToExpected(2);
        Assert.assertTrue(isQuantityDisplayed, "Cart quantity is not displayed as expected.");
        System.out.println("Quantity is as we expected");
       // Assert.assertTrue(searchProductPage.isQuantityTwoDisplayed());











    }

}
