package com.velocityEcom.utils;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Utility {
    public static String readDataFromPropertiesFile(String key) throws IOException {
        FileInputStream myFile = new FileInputStream("C:\\Users\\nihar\\IdeaProjects\\EcomBDD\\src\\main\\resources\\config.properties");
        Properties properties = new Properties();
        properties.load(myFile);
        System.out.println("readDataFromPropertiesFile" + key);
        String value = properties.getProperty(key);
        return value;
    }

    public static String readDataFromExcel(int row, int cell) throws IOException {
        FileInputStream myFile = new FileInputStream("C:\\Users\\nihar\\OneDrive\\Documents\\Test.xlsx");
        String value = WorkbookFactory.create(myFile).getSheet("Sheet8").getRow(row).getCell(cell).getStringCellValue();
        System.out.println("readDataFromExcel: " + "row- " + row + "cell- " + cell);
        return value;
    }

    public static void takeScreenshot(WebDriver driver, String fileName) throws IOException {
        String timestamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String projectPath = System.getProperty("user.dir");
        File destination = new File(projectPath + "/ScreenshotEvidence/" + fileName + timestamp + ".png");
        System.out.println("screenshot taken at " + destination);
        FileHandler.copy(source, destination);
    }

    public static void scrollIntoView(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        System.out.println("scrolling into view");
    }
}
