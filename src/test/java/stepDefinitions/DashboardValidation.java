package stepDefinitions;

import com.velocityEcom.driverfactory.DriverFactory;
import com.velocityEcom.pages.EcomDashBoardPage;
import com.velocityEcom.pages.EcomInventoryUpdatePage;
import com.velocityEcom.pages.EcomLoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class DashboardValidation {
    EcomLoginPage ecomLoginPage = new EcomLoginPage(DriverFactory.getDriver());
    EcomDashBoardPage ecomDashBoardPage = new EcomDashBoardPage(DriverFactory.getDriver());
    EcomInventoryUpdatePage ecomInventoryUpdatePage = new EcomInventoryUpdatePage(DriverFactory.getDriver());
    SoftAssert softAssert = new SoftAssert();

    @Given("user clicks on admin button on VelocityEcom application")
    public void user_clicks_on_admin_button_on_velocity_ecom_application() {
        ecomLoginPage.clickOnAdminButton();
    }

    @When("user enters username as {string} on VelocityEcom application")
    public void user_enters_username_as_on_velocity_ecom_application(String username) {
        ecomLoginPage.enterUserName(username);
    }

    @When("user enters password as {string} on VelocityEcom application")
    public void user_enters_password_as_on_velocity_ecom_application(String password) {
        ecomLoginPage.enterPassword(password);
    }

    @When("user clicks on access dashboard button on VelocityEcom application")
    public void user_clicks_on_access_dashboard_button_on_velocity_ecom_application() {
        ecomLoginPage.clickOnAccessDashBoardButton();
//        Assert.fail();
    }

    @Then("user navigates to dashboard page and validates details")
    public void user_navigates_to_dashboard_page_and_validates_details() throws InterruptedException {
        Thread.sleep(2000);
        //getTotal orders
        String actualTotalOrders = ecomDashBoardPage.getTotalOrders();
        //getTotalProducts
        String actualTotalProducts = ecomDashBoardPage.getTotalProducts();
        Reporter.log("total orders are" + actualTotalOrders, true);
        Reporter.log("total orders are" + actualTotalProducts, true);
        softAssert.assertNotNull(actualTotalOrders, "actual total orders are Null, TC failed");
        softAssert.assertNotNull(actualTotalProducts, "actual total products are Null, TC failed");
        softAssert.assertAll();
    }

    @And("user clicks on Inventory update on VelocityEcom application")
    public void userClicksOnInventoryUpdateOnVelocityEcomApplication() throws InterruptedException {
        ecomInventoryUpdatePage.clickOnInventoryUpdateButton();
        Thread.sleep(4000);
    }

    @Then("user navigates to Inventory update page and validates details")
    public void userNavigatesToInventoryUpdatePageAndValidatesDetails() {
        Reporter.log("Total entries are " + ecomInventoryUpdatePage.getTotalEntries(), true);
        Reporter.log("Total open_partial orders are " + ecomInventoryUpdatePage.Open_PartialOrders(), true);
        Reporter.log("Total fully received orders are " + ecomInventoryUpdatePage.fullyReceivedOrders(), true);
   String expectedTotalEntries="106";
   String actualTotalEntries=ecomInventoryUpdatePage.getTotalEntries();
   Assert.assertEquals(actualTotalEntries,expectedTotalEntries,"actual and expected entries are not matching, TC failed");

    }
}
