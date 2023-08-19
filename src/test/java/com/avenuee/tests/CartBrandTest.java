package com.avenuee.tests;

import com.avenuee.pages.CartBrandPage;
import com.avenuee.pages.DashBoardPage;
import com.avenuee.pages.RegisterUserPage;
import com.avenuee.pages.SearchProductPage;
import com.avenuee.utilities.BaseClass;
import com.avenuee.utilities.BrowserUtils;
import com.avenuee.utilities.ConfigurationReader;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartBrandTest extends BaseClass {

    DashBoardPage dashBoardPage=new DashBoardPage();
    RegisterUserPage registerUserPage =new RegisterUserPage();
    SearchProductPage searchProductPage=new SearchProductPage();

    CartBrandPage cartBrandPage=new CartBrandPage();
    @BeforeMethod
    public void setUpMethod(){
        driver.get(ConfigurationReader.getProperty("automation.baseurl") +
                "/products");


    }

    @Test
    public void clickBrand() throws InterruptedException {

        BrowserUtils.pageVerification("Automation Exercise - All Products", driver.getTitle());


        cartBrandPage.clickOnBrand();

//        Thread.sleep(15000);
//        cartBrandPage.NavigateItemProduct();
//
//        cartBrandPage.clickOnItemProduct();









    }

}
