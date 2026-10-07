package com.velocityEcom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcomInventoryUpdatePage {
    @FindBy(xpath = "//a[text()='Inventory Update']")
    private WebElement inventoryUpdateButton;

    //variable-->private and methods-->public-->encapsulation concept
    @FindBy(xpath = "(//div[@class='stat-value'])[1]")
    private WebElement totalEntries;

    @FindBy(xpath = "(//div[@class='stat-value'])[2]")
    private WebElement Open_Partial;

    @FindBy(xpath = "(//div[@class='stat-value'])[3]")
    private WebElement fullyReceived;

    //constructor-->no return value like void
    public EcomInventoryUpdatePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //actions-->methods
    public void clickOnInventoryUpdateButton() {
        inventoryUpdateButton.click();
        System.out.println("clicking on clickOnInventoryUpdateButton");

    }

    public String getTotalEntries() {
        System.out.println("getting getTotalEntries");
        return totalEntries.getText();
    }

    public String Open_PartialOrders() {
        System.out.println("getting Open_Partial Orders");
        return totalEntries.getText();
    }

    public String fullyReceivedOrders() {
        System.out.println("getting fullyReceived Orders");
        return totalEntries.getText();
    }
}
