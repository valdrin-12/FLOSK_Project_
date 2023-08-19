package com.avenuee.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;


public abstract class BaseClass {

    protected static WebDriver driver = Driver.getDriver();
    protected static Select select;
    protected static Actions actions; // Declare the Actions instance


    //here add action Class

   static Alert alert;

    @BeforeSuite
    public void setUp(){
        driver  = Driver.getDriver();
    }

    @AfterSuite
    public void tearDown(){
        Driver.closeDriver();
    }


    @AfterMethod
    public void takeScreenshot(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()){
            try{
                TakesScreenshot scrShot = ((TakesScreenshot) driver);
                File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
                File destFile = new File(System.getProperty("user.home") +
                        "/Desktop/javaPro/automationFramework/AvenueFramework/target/screenshots-for-failed-testcases/" +
                        result.getName() + ".png");
                FileUtils.copyFile(srcFile, destFile);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
