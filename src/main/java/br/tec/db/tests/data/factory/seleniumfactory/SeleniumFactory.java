package br.tec.db.tests.data.factory.seleniumfactory;

import br.tec.db.tests.utils.ConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumFactory {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public void initBrowser() {
        ConfigProperties.initializePropertyFile();

        switch (ConfigProperties.properties.getProperty("BrowserType")) {
            case "firefox":
                driver = new FirefoxDriver();
                wait = new WebDriverWait(driver, Duration.ofSeconds(5));
                driver.get(ConfigProperties.properties.getProperty("AppURL"));
                driver.manage().window().maximize();
                break;
            case "edge":
                driver = new EdgeDriver();
                wait = new WebDriverWait(driver, Duration.ofSeconds(5));
                driver.get(ConfigProperties.properties.getProperty("AppURL"));
                driver.manage().window().maximize();
                break;
            default:
                driver = new ChromeDriver();
                wait = new WebDriverWait(driver, Duration.ofSeconds(5));
                driver.get(ConfigProperties.properties.getProperty("AppURL"));
                driver.manage().window().maximize();
                break;
        }
    }

    public void tearDown() {
        driver.quit();
    }
}