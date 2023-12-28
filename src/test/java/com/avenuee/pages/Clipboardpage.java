package com.avenuee.pages;

import com.avenuee.utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Clipboardpage extends BasePage {
    @FindBy(css="#example-target button")
    private WebElement button;

    @FindBy(xpath="//input[@name='password']")
    private WebElement passwordField;
    
}
