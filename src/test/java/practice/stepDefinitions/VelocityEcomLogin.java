package practice.stepDefinitions;

import io.cucumber.java.en.*;
import org.testng.Reporter;

public class VelocityEcomLogin {
    @Given("user is on ecom login page")
    public void user_is_on_ecom_login_page() {
        Reporter.log("user has landed on ecom login page",true);
    }
    @When("user clicks on admin button")
    public void user_clicks_on_admin_button() {
        Reporter.log("user clicks on admin button",true);

    }
    @When("user enters username as {string}")
    public void user_enters_username_as(String username) {
        Reporter.log("user enters username as 9923478751",true);

    }
    @When("user enters password as {string}")
    public void user_enters_password_as(String password) {
        Reporter.log("user enters password as Velocity@123",true);

    }
    @When("user clicks on access dashboard")
    public void user_clicks_on_access_dashboard() {
        Reporter.log("user clicks on access dashboard",true);

    }
    @Then("user navigates to dashboard page")
    public void user_navigates_to_dashboard_page() {
        Reporter.log("user navigates to dashboard page",true);

    }
    @When("user clicks on customer button")
    public void user_clicks_on_customer_button() {
        Reporter.log("user clicks on customer button",true);

    }
    @Then("user navigates to products page")
    public void user_navigates_to_products_page() {
        Reporter.log("user navigates to products page",true);

    }

}
