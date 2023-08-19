package com.avenuee.utilities;

//package com.melon.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BrowserUtils extends BaseClass{

    public static void pageVerification(String exp, String url){
        Assert.assertEquals(exp, url);
    }

    public static void selectByVisibleText(WebElement elm, String text){
        select = new Select(elm);
        select.selectByVisibleText(text);
    }
    public static void actionClass(WebElement elm) {
        Actions actions = new Actions(driver);

        actions.moveToElement(elm).perform();
    }


    public static void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }
    public static void switchToAlert() {
       Alert alert = driver.switchTo().alert();
        alert.accept();


    }

    public static void switchToCloseAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();


    }
}

