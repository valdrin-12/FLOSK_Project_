package com.avenuee.pages;

import com.avenuee.utilities.BasePage;
import com.avenuee.utilities.BrowserUtils;
import com.avenuee.utilities.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartBrandPage extends BasePage {

    @FindBy(xpath="//li/a[@href='/brand_products/Polo']")
    private WebElement poloBrand;

    @FindBy(xpath="//li/a[@href='/product_details/1']")
    private WebElement viewProductItem;

    @FindBy(xpath="//*[@class='brands-name']/ul/li")
    private WebElement brandsBtn;

    @FindBy(xpath="//li/a[@href='/brand_products/Biba']")
    private WebElement bibaBtn;

public void clickOnBrand() throws InterruptedException {


    List<WebElement> brandElements = driver.findElements(By.xpath("//*[@class='brands-name']/ul/li"));

    for (WebElement brandElement : brandElements) {
        Thread.sleep(2000);

        BrowserUtils.actionClass(brandsBtn);
        Thread.sleep(2000);

        WaitUtils.waitForElementToBeVisible(brandsBtn);
        Thread.sleep(2000);

        brandElement.click();
        // You can add further actions or assertions here
        driver.navigate().back();// Navigate back to the brands list page


    }



//        BrowserUtils.actionClass(viewProductItem);
//        WaitUtils.waitForElementToBeVisible(viewProductItem);


    }

    public void clickOnItemProduct(){

        viewProductItem.click();
    }





}
