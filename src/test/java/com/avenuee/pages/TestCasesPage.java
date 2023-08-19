package com.avenuee.pages;

import com.avenuee.utilities.BasePage;
import com.avenuee.utilities.WaitUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCasesPage extends BasePage {


    @FindBy(xpath="//h2/b[.='Test Cases']")
    private WebElement testCasesText;

    @FindBy(xpath="//h4/a/u[.='Test Case 7: Verify Test Cases Page']")
    private WebElement verifyTestCaseLink;

    @FindBy(xpath="//li[@class='list-group-item' and contains(text(), 'Verify user is navigated to test cases page successfully')]")
    private WebElement navigateSuccessful;


    public void clickOnVerify(){

        WaitUtils.waitForElementToBeVisible(verifyTestCaseLink);

          verifyTestCaseLink.click();
    }

    public boolean isTestCasesTextDisplayed(){

        //WaitUtils.waitForElementToBeVisible(testCasesText);

        return testCasesText.isDisplayed();
    }
    public boolean isNavigateDisplayed(){

        return navigateSuccessful.isDisplayed();
    }
}

