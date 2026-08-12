package com.velocityEcom.hooks;

import com.velocityEcom.driverfactory.DriverFactory;
import com.velocityEcom.utils.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;
import java.time.Duration;

public class Hooks {
    @Before
    public void launchBrowser() throws IOException {
        DriverFactory.setBrowser(Utility.readDataFromPropertiesFile("browser"));
        DriverFactory.getDriver().get(Utility.readDataFromPropertiesFile("url"));
        DriverFactory.getDriver().manage().window().maximize();
        DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    @After
    public void closeBrowser(){
        DriverFactory.getDriver().quit();
        System.out.println("closing browser");
    }
}
