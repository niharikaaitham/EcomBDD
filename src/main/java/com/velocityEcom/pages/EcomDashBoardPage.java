package com.velocityEcom.pages;

import com.velocityEcom.driverfactory.DriverFactory;
import com.velocityEcom.utils.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcomDashBoardPage {
    //variables--> WebElements
    @FindBy(xpath = "(//div[@class='stat-value'])[1]")
    private WebElement totalProducts;
    @FindBy(xpath = "(//div[@class='stat-value'])[2]")
    private WebElement totalOrders;
    @FindBy(xpath = "(//div[@class='stat-value'])[3]")
    private WebElement lowStockItems;
    @FindBy(xpath = "(//div[@class='stat-value'])[4]")
    private WebElement pendingOrders;
    @FindBy(xpath = "(//div[@class='stat-value'])[5]")
    private WebElement totalRevenue;
    @FindBy(xpath = "(//div[@class='stat-value'])[6]")
    private WebElement backOrder;

    //constructor
    public EcomDashBoardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //methods

    public String getTotalOrders() {
        Utility.scrollIntoView(DriverFactory.getDriver(),totalOrders);
        System.out.println("getting  totalOrders");
        return totalOrders.getText();
    }

    public String getTotalProducts() {
        Utility.scrollIntoView(DriverFactory.getDriver(),totalProducts);
        System.out.println("getting total products");
        return totalProducts.getText();
    }

   public String getLowStockItems() {
        Utility.scrollIntoView(DriverFactory.getDriver(),lowStockItems);
        System.out.println("getting low stock items");
        return lowStockItems.getText();
    }

    public String getPendingOrders() {
        Utility.scrollIntoView(DriverFactory.getDriver(),pendingOrders);
        System.out.println("getting pending orders");
        return pendingOrders.getText();
    }

    public String getTotalRevenue() {
        Utility.scrollIntoView(DriverFactory.getDriver(),totalRevenue);
        System.out.println("getting total revenue");
        return totalRevenue.getText();
    }

    public String getBackOrder() {
        Utility.scrollIntoView(DriverFactory.getDriver(),backOrder);
        System.out.println("getting back order");
        return backOrder.getText();
    }

}
