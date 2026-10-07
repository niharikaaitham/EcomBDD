package com.velocityEcom.driverfactory;

import com.velocityEcom.utils.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.time.Duration;

public class DriverFactory {
    static WebDriver driver;

    public static WebDriver setBrowser(String browser) throws IOException, InterruptedException {
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("edge")) {
            driver = new EdgeDriver();
        } else if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        }
        System.out.println("setting browser as "+browser);
        driver.get(Utility.readDataFromPropertiesFile("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Thread.sleep(3000);
        return driver;
    }
    public static WebDriver getDriver(){
        return driver;
    }
}
