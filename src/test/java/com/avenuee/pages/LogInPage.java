package com.avenuee.pages;

import com.avenuee.utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {

    @FindBy(xpath="(//input[@name='email'])[1]")
    private WebElement emailField;

    @FindBy(xpath="//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath="//button[@type=\"submit\" and @data-qa=\"login-button\" and @class=\"btn btn-default\"]")
    private WebElement logInBtn;

    @FindBy(xpath="//a/i[@class='fa fa-user']")
    private WebElement loggedinAsField;


    public void SignIn(){
        // String password=faker.internet().password();
     //  emailField.sendKeys(faker.name().firstName());
        emailField.sendKeys("valdrin.qerimi1@gmail.com");
        passwordField.sendKeys("1256789");
        ClickLoginBtn();
    }
    public void ClickLoginBtn(){

        logInBtn.click();
    }

    public boolean isLoggedInDisplayed (){

        return loggedinAsField.isDisplayed();
    }

}
