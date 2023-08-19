package com.avenuee.pages;

import com.avenuee.utilities.BasePage;
import com.avenuee.utilities.BrowserUtils;
import com.avenuee.utilities.WaitUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {

    @FindBy(xpath="//input[@class='form-control' and @name='name']")
    private WebElement nameFieldc;

    @FindBy(xpath="//input[@class='form-control' and @name='email']")
    private WebElement emailFieldc;

    @FindBy(xpath="//input[@class='form-control' and @name='subject']")
    private WebElement subjectFieldc;

    @FindBy(xpath="//textarea[@class='form-control' and @id='message']")
    private WebElement messageFieldc;

    @FindBy(xpath="//input[@class='form-control' and @name='upload_file']")
    private WebElement uploadFileBtn;

    @FindBy(xpath="//input[@type='submit' and @data-qa='submit-button']")
    private WebElement submitBtn;
    @FindBy(xpath="//div[@class='status alert alert-success' and contains(text(), 'Success! Your details have been submitted successfully.')]\n")
    private WebElement messagesuccessContactUS;




    public void contactUs() throws InterruptedException {
        // String password=faker.internet().password();

        nameFieldc.sendKeys("Valdrin Qerimi");
        //  String emailFieldSign = faker.internet().emailAddress();

        emailFieldc.sendKeys("valdrin.qerimi1@gmail.com");

        subjectFieldc.sendKeys("Hello");
        messageFieldc.sendKeys("I hope this email finds you well." +
                " I am writing to bring to your attention an issue " +
                "I have encountered with my recent order, Order ID #[Order Number], " +
                "placed on [Order Date]. Unfortunately," +
                " I have not yet received the product that I ordered.");///Users/macbookpro/Desktop/javaPro/automationFramework/AvenueFramework
        //  UPLOAD
        uploadFileBtn.sendKeys("/Users/macbookpro/Desktop/Test.rtf");
        WaitUtils.waitForElementToBeVisible(submitBtn);
      //  clickOnChooseFile();
        Thread.sleep(4000);
        clickOnSubmitBtn();
        Thread.sleep(4000);
        BrowserUtils.switchToAlert();
    }
    public void clickOnChooseFile(){
        uploadFileBtn.click();
    }
    public void clickOnSubmitBtn(){
        submitBtn.click();
    }
    public boolean isMessageDisplayedcontact(){
        return messagesuccessContactUS.isDisplayed();
    }
}
