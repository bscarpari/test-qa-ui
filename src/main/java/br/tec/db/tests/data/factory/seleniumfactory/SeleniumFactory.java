package br.tec.db.tests.data.factory.seleniumfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFactory {
    public static ChromeOptions options = new ChromeOptions();
    public static WebDriver driver;
    public static WebDriverWait wait;

    public void initBrowser(String url) {
        String driverPath = "driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 40);
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void tearDown() {
        driver.close();
    }
}