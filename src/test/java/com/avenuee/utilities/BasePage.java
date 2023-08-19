package com.avenuee.utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    protected static WebDriver driver = Driver.getDriver();
    protected static Faker faker = new Faker();

    Actions actions = new Actions(driver);

    // Perform the hover action
    protected static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    public BasePage(){
        PageFactory.initElements(driver, this);
    }
}
