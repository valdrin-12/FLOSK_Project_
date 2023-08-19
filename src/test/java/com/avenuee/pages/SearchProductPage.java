package com.avenuee.pages;

import com.avenuee.utilities.BasePage;
import com.avenuee.utilities.BrowserUtils;
import com.avenuee.utilities.WaitUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProductPage extends BasePage {


    @FindBy(xpath="//div[@class='container']//input[@type='text' and @name='search' and @id='search_product']")
    private WebElement searchField;

    @FindBy(xpath="(//a[.='View Product'])[1]")
    private WebElement viewProductBtn;

    @FindBy(xpath="(//p[.='Sleeveless Unicorn Print Fit & Flare Net Dress - Multi'])[1]")
    private WebElement productItem;

    @FindBy(xpath="(//a[@class='btn btn-default add-to-cart'])[1]")
    private WebElement firstProductItem;

    @FindBy(xpath="//div[@class='productinfo text-center']/h2[text()='Rs. 500']")
    private WebElement firstProductItemHover;

    @FindBy(xpath="(//a[@data-product-id='1' and contains(@class, 'btn btn-default add-to-cart')])[2]")
    private WebElement firstProductItemAfterHover;

    @FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']")
    private WebElement continueShoppingBtn;

    @FindBy(xpath="//a[.=' Cart']")
    private WebElement cartBtn;

    @FindBy(xpath="(//button[@class='disabled'])[1]")
    private WebElement checkQuantity;

    @FindBy(xpath="//a/u[.='View Cart']")
    private WebElement viewCartBtn;

    @FindBy(xpath="//div/a[@class='btn btn-default check_out']")
    private WebElement checkOutBtn;

    @FindBy(xpath="//a/u[.='Register / Login']")
    private WebElement registerBtn;

    @FindBy(xpath="//a[@data-qa='continue-button']")
    private WebElement continueBtn;

    @FindBy(xpath="//td/a[@class='cart_quantity_delete']")
    private WebElement deleteProductBtn;


    @FindBy(xpath="//p/b[.='Cart is empty!']")
    private WebElement textAfterDeletedProduct;

    @FindBy(xpath="//div/a[.='Place Order']")
    private WebElement placeOrderBtn;

    @FindBy(xpath="//div/h2[.='Payment']")
    private WebElement paymentText;

    @FindBy(xpath="//div/h2[.='Brands']")
    private WebElement brandText;

    @FindBy(xpath="//div/h2[.='Payment']")
    private WebElement paymentMessage;

    @FindBy(xpath="//input[@data-qa='name-on-card']")
    private WebElement nameOfCardField;

    @FindBy(xpath="//input[@data-qa='card-number' and @class='form-control card-number']")
    private WebElement nameNumberOfCardField;



    @FindBy(xpath="//input[@data-qa='cvc' and @name='cvc']")
    private WebElement CVCField;

    @FindBy(xpath="//input[@data-qa='expiry-month']")
    private WebElement monthExpirationField;

    @FindBy(xpath="//input[@data-qa='expiry-year']")
    private WebElement yearExpirationField;

    @FindBy(xpath="//button[@class='form-control btn btn-primary submit-button' and @id='submit']")
    private WebElement payAndConfirmBtn;

    @FindBy(xpath="//div/a[@data-qa='continue-button']")
    private WebElement continueBtnOrderPlaced;








    public void searchProduct() throws InterruptedException {
       // Thread.sleep(3000);

        searchField.sendKeys("ar");

    }
    public boolean isProductDisplayed (){

        return productItem.isDisplayed();
    }
    public boolean isContinueDisplayed (){

        return continueBtn.isDisplayed();
    }
    public void clickOnfirstItemCart(){

        firstProductItemAfterHover.click();


    }
    int expectedCartQuantity = 2;


//    public void clickOnAddCart() {
//
//        BrowserUtils.actionClass(viewProductBtn);
//        WaitUtils.waitForElementToBeVisible(viewProductBtn);
//
//
//        BrowserUtils.actionClass(firstProductItemHover);
//        WaitUtils.waitForElementToBeVisible(firstProductItemHover);
//        firstProductItemAfterHover.click();
//        WaitUtils.waitForElementToBeVisible(continueShoppingBtn);
//        continueShoppingBtn.click();
//        //second click
//        BrowserUtils.actionClass(firstProductItemHover);
//        WaitUtils.waitForElementToBeVisible(firstProductItemHover);
//        firstProductItemAfterHover.click();
//        WaitUtils.waitForElementToBeVisible(continueShoppingBtn);
//        continueShoppingBtn.click();
//        cartBtn.sendKeys(Keys.HOME);
//
//        cartBtn.click();
////        WaitUtils.waitForElementToBeVisible(checkQuantity);
////        String cartQuantityText = checkQuantity.getText();
////        int actualCartQuantity = Integer.parseInt(cartQuantityText);
////
////        Assert.assertEquals(actualCartQuantity, expectedCartQuantity);
////
////        System.out.println("quantity is as we expected");
//
//   }
public void clickOnAddCart(int times) {
    for (int i = 0; i < times; i++) {
        BrowserUtils.actionClass(viewProductBtn);
        WaitUtils.waitForElementToBeVisible(viewProductBtn);

        BrowserUtils.actionClass(firstProductItemHover);
        WaitUtils.waitForElementToBeVisible(firstProductItemHover);
        firstProductItemAfterHover.click();
        WaitUtils.waitForElementToBeVisible(continueShoppingBtn);
        continueShoppingBtn.click();

    }

    cartBtn.sendKeys(Keys.HOME);
    cartBtn.click();
}

    public boolean isCartQuantityVisibleAndEqualToExpected(int expectedCartQuantity) {
        WaitUtils.waitForElementToBeVisible(checkQuantity);

        try {
            String cartQuantityText = checkQuantity.getText();
            int actualCartQuantity = Integer.parseInt(cartQuantityText);

            return actualCartQuantity == expectedCartQuantity;
        } catch (NumberFormatException e) {
            return false; //  it   is not equal
        }
    }



    public void registerWhileCheckout() {
    WaitUtils.waitForElementToBeVisible(viewProductBtn);

        BrowserUtils.actionClass(viewProductBtn);

        BrowserUtils.actionClass(firstProductItemHover);
        WaitUtils.waitForElementToBeVisible(firstProductItemHover);
        firstProductItemAfterHover.click();
        WaitUtils.waitForElementToBeVisible(continueShoppingBtn);
        viewCartBtn.click();
        checkOutBtn.click();
        registerBtn.click();


    }
public void clickOnContinueBtn(){

        continueBtn.click();
}
    public boolean isQuantityTwoDisplayed (){

        return checkQuantity.isDisplayed();
    }

    public void deleteItemCart(){

        deleteProductBtn.click();


    }

    public boolean isTextEmptyCartDisplayed (){
        WaitUtils.waitForElementToBeVisible(textAfterDeletedProduct);

        return textAfterDeletedProduct.isDisplayed();
    }
    public void clickOnCheckOut(){

        checkOutBtn.click();


    }


    public void navigateToPlaceOrder(){


      //  BrowserUtils.actionClass(placeOrderBtn);
        WaitUtils.waitForElementToBeVisible(placeOrderBtn);


    }

    public boolean isPaymentDisplayed (){

        return paymentText.isDisplayed();
    }

    public void paymentCart() {

    WaitUtils.waitForElementToBeVisible(paymentMessage);

        nameOfCardField.sendKeys("Valdrin Q");
        nameNumberOfCardField.sendKeys("112888");
        CVCField.sendKeys("234");
        monthExpirationField.sendKeys("11");
        yearExpirationField.sendKeys("24");
        payAndConfirmBtn.click();
        WaitUtils.waitForElementToBeVisible(continueBtnOrderPlaced);
        //continueBtnOrderPlaced.click();

       // BrowserUtils.actionClass(viewProductBtn);




    }
    public void clickPlaceOrder(){
    placeOrderBtn.click();
       // BrowserUtils.switchToCloseAlert();
     }
    public void closeAlertAfterPlaceOrder(){
        BrowserUtils.switchToCloseAlert();
    }
    public boolean isContinueBtnOrderPlaced (){

        return continueBtnOrderPlaced.isDisplayed();
    }

}
