package practice.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.testng.Reporter;

public class VelocityEcomHooks {
    @Before(order=1)
    public void setUpBrowser(){
        Reporter.log("browser set to chrome",true);
    }
    @After(order=1)
    public void tearDown(){
        Reporter.log("close browser",true);
    }
    @Before(order=2)
    public void launchUrl(){
        Reporter.log("open Url",true);
    }
    @After(order=2)
    public void closeUrl(){
        Reporter.log("application logOut",true);
    }
    @BeforeStep
    public void beforeStep(){
        Reporter.log("before step",true);
    }
    @AfterStep
    public void afterStep(){
        Reporter.log("after step",true);
    }
}
