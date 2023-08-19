package com.avenuee.pages;

import com.avenuee.utilities.BasePage;
import com.avenuee.utilities.WaitUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage {

    @FindBy(xpath="//li/a[.=' Signup / Login']")
    private WebElement signUpLink;

    @FindBy(xpath="//input[@id='susbscribe_email']")
    private WebElement subscriptionField;

    @FindBy(xpath="//button[@type='submit' and @id='subscribe']")
    private WebElement subscribeBtn;

    @FindBy(xpath="//div[@class='alert-success alert']")
    private WebElement successfullySubscribeText;

    @FindBy(xpath="//li/a[.=' Cart']")
    private WebElement cartBtn;

    @FindBy(xpath="//a[@href='/products' and @style='color: orange;']/i[@class='material-icons card_travel'][@style='font-size: 16px;']\n")
    private WebElement productBtn;

    @FindBy(xpath="//li/a[.=' Contact us']")
    private WebElement contactUsBtn;

    @FindBy(xpath="//li/a[.=' Test Cases']")
    private WebElement testCasesBtn;

    @FindBy(xpath="//input[@name='name']")
    private WebElement nameField;

    @FindBy(xpath="(//input[@name='email'])[2]")
    private WebElement emailFieldSign;

    @FindBy(xpath="//a[@class='get-in-touch']")
    private WebElement getInTouchBtn;
    public void clickOnSignUpLink(){
       signUpLink.click();
    }
    public void clickOnTestCaseBtn(){
        testCasesBtn.click();
    }
    public void clickOnProductBtn(){
        productBtn.click();
    }
    public boolean isNameFieldDisplayed (){

        return nameField.isDisplayed();
    }
    public boolean isSuccessfulTextPresent (){
        WaitUtils.waitForElementToBeVisible(successfullySubscribeText);
        return successfullySubscribeText.isDisplayed();
    }
    public void clickOnGetInTouch(){

       // WaitUtils.waitForElementToBeClickableAndClick(coverBtn);
      getInTouchBtn.click();
    }
    public void clickOnSubscribeBtn(){
        // WaitUtils.waitForElementToBeClickableAndClick(coverBtn);
        subscribeBtn.click();
    }
    public void subscriptionFieldM(){
        subscriptionField.sendKeys(Keys.END);
        subscriptionField.sendKeys("valdrin.qerimi1@gmail.com");
        clickOnSubscribeBtn();
    }
    public void clickOnCartBtn(){
        cartBtn.click();
    }
}


