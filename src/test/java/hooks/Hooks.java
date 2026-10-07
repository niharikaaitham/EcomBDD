package hooks;

import com.velocityEcom.driverfactory.DriverFactory;
import com.velocityEcom.utils.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import java.io.IOException;
import java.time.Duration;

public class Hooks {
    @Before
    public void launchBrowser() throws IOException, InterruptedException {
        DriverFactory.setBrowser(Utility.readDataFromPropertiesFile("browser"));
    }

    @After(order = 1)
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(9000);
        DriverFactory.getDriver().quit();
        System.out.println("closing browser");
    }

    @After(order = 2)
    public void takeScreenshot(Scenario scenario) throws InterruptedException {
        if(scenario.isFailed()) {
            Thread.sleep(4000);
            byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
            Reporter.log("Taking screenshot", true);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }
}
