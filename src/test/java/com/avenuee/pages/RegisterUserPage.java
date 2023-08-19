package com.avenuee.pages;

import com.avenuee.utilities.BasePage;
import com.avenuee.utilities.BrowserUtils;
import com.avenuee.utilities.WaitUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterUserPage extends BasePage {

    @FindBy(xpath="//li/a[.=' Signup / Login']")
    private WebElement signUpLink;

    @FindBy(xpath="//input[@name='name']")
    private WebElement nameField;

    @FindBy(xpath="(//input[@name='email'])[2]")
    private WebElement emailFieldSign;

    @FindBy(xpath="//button[.='Signup']")
    private WebElement signUpBtn;

    @FindBy(xpath="//h2/b[.='Enter Account Information']")
    private WebElement enterAccountMessage;

    @FindBy(xpath="//div[@id='uniform-id_gender1']")
    private WebElement MrRadioBtn;


    @FindBy(xpath="//input[@id='password']")
    private WebElement pswField;

    @FindBy(xpath="//select[@id='days']")
    private WebElement daysDropdown;

    @FindBy(xpath="//select[@id='months']")
    private WebElement monthsDropdown;

    @FindBy(xpath="//select[@id='years']")
    private WebElement yearsDropdown;

    @FindBy(xpath="//label[@for='newsletter']")
    private WebElement newsLetterCheckBox;

    @FindBy(xpath="//label[@for='optin']")
    private WebElement specialOfferCheckBox;

    @FindBy(xpath="//input[@name='first_name']")
    private WebElement firstName;

    @FindBy(xpath="//input[@name='last_name']")
    private WebElement lastName;

    @FindBy(xpath="//input[@id='company']")
    private WebElement companyName;

    @FindBy(xpath="//input[@id='address1']")
    private WebElement addressField;

    @FindBy(xpath="//input[@id='address2']")
    private WebElement secondAddressField;

    @FindBy(xpath="//select[@id='country']")
    private WebElement countryDropDown;

    @FindBy(xpath="//input[@id='state']")
    private WebElement stateField;

    @FindBy(xpath="//input[@id='city']")
    private WebElement cityField;

    @FindBy(xpath="//input[@id='zipcode']")
    private WebElement zipCodeField;

    @FindBy(xpath="//input[@id='mobile_number']")
    private WebElement phoneField;

    @FindBy(xpath="//b[.='Account Created!']")
    private WebElement messageAccountCreated;

    @FindBy(xpath="//button[@type='submit' and @class='btn btn-default' and @data-qa='create-account'] ")
    private WebElement createAccountBtn;




    public void SignUp(){
       // String password=faker.internet().password();

        nameField.sendKeys("Valdrin Qerimi");
    //  String emailFieldSign = faker.internet().emailAddress();



        emailFieldSign.sendKeys(faker.internet().emailAddress());
        clickOnSignUpBtn();


        WaitUtils.waitForElementToBeVisible(enterAccountMessage);

    }
    public void SignUp2() throws InterruptedException {
        WaitUtils.waitForElementToBeVisible(pswField);

        pswField.sendKeys("1256789");
        BrowserUtils.actionClass(daysDropdown);
        WaitUtils.waitForElementToBeVisible(daysDropdown);


        BrowserUtils.selectByVisibleText(daysDropdown, "18");
        WaitUtils.waitForElementToBeVisible(monthsDropdown);

        BrowserUtils.selectByVisibleText(monthsDropdown, "November");
        BrowserUtils.selectByVisibleText(yearsDropdown, "1990");
        WaitUtils.waitForElementToBeVisible(newsLetterCheckBox);

        BrowserUtils.actionClass(newsLetterCheckBox);
        WaitUtils.waitForElementToBeVisible(newsLetterCheckBox);
        clickOnCheckBox();
        BrowserUtils.actionClass(firstName);

        firstName.sendKeys("Valdrin");
        lastName.sendKeys("Qerimi");
        WaitUtils.waitForElementToBeVisible(companyName);

        companyName.sendKeys("ERA");
        BrowserUtils.actionClass(addressField);
        WaitUtils.waitForElementToBeVisible(addressField);
        addressField.sendKeys("Prishtine 9427");
        BrowserUtils.actionClass(secondAddressField);
        WaitUtils.waitForElementToBeVisible(secondAddressField);

        secondAddressField.sendKeys("Gjilan Kosove");
        BrowserUtils.selectByVisibleText(countryDropDown, "United States");
        WaitUtils.waitForElementToBeVisible(stateField);

        stateField.sendKeys("Kosova");
        cityField.sendKeys("Gjilan");
        WaitUtils.waitForElementToBeVisible(zipCodeField);

        zipCodeField.sendKeys("10000");
        WaitUtils.waitForElementToBeVisible(phoneField);

        phoneField.sendKeys("04444444");
        WaitUtils.waitForElementToBeVisible(createAccountBtn);

        clickOnCreateAcc();












    }


    public void clickOnSignUpLink(){
        signUpLink.click();

    }
    public void clickOnMrRadioBtn(){
        MrRadioBtn.click();

    }

    public boolean isAccountCreatedDisplayed (){

        return nameField.isDisplayed();
    }
    public void clickOnSignUpBtn(){
        signUpBtn.click();

    }

    public boolean isMessageDisplayed (){

        return enterAccountMessage.isDisplayed();
    }

    public boolean isMessageDisplayedCreateAccount (){//this method used for assertion after all steps in creating User

        return messageAccountCreated.isDisplayed();
    }


    public void clickOnCheckBox(){
        newsLetterCheckBox.click();

    }
    public void clickOnCreateAcc(){
        createAccountBtn.click();

    }





}
