package com.velocityEcom.pages;

import com.velocityEcom.driverfactory.DriverFactory;
import com.velocityEcom.utils.Utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcomLoginPage {
    //variables-->webElements
    @FindBy(id = "tab-admin")
    private WebElement adminButton;
    @FindBy(id = "admin-username")
    private WebElement userNameField;
    @FindBy(id = "admin-password")
    private WebElement passwordField;
    @FindBy(id = "btn-admin-signin")
    private WebElement accessDashboardButton;

    //constructor
    public EcomLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //methods

    public void clickOnAdminButton() {
        adminButton.click();
        System.out.println("clicking on admin button");
    }

    public void enterUserName(String username) {
        Utility.scrollIntoView(DriverFactory.getDriver(), userNameField);
        userNameField.sendKeys(username);
        System.out.println("entering username");
    }

    public void enterPassword(String password) {
        Utility.scrollIntoView(DriverFactory.getDriver(), passwordField);
        passwordField.sendKeys(password);
        System.out.println("entering password");
    }

    public void clickOnAccessDashBoardButton() {
        Utility.scrollIntoView(DriverFactory.getDriver(), accessDashboardButton);
//        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,9000)");
        accessDashboardButton.click();
        System.out.println("clicking on access dashboard button");
    }
}
