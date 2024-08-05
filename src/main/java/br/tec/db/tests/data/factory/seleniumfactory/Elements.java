package br.tec.db.tests.data.factory.seleniumfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Elements extends SeleniumFactory {
    public static WebDriverWait wait;

    public static WebElement element(By by) {
        return driver.findElement(by);
    }

    public static void waitElement(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static void waitElementToBeClickable(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void performInteraction(By by, String interactionType) {
        WebElement element = element(by);

        switch (interactionType) {
            case "hover":
                Actions actions = new Actions(driver);
                actions.moveToElement(element).perform();
                break;
            default:
                System.out.println("Invalid interaction type");
                break;
        }
    }

    public static void initialize(WebDriver driver, Duration timeoutInSeconds) {
        wait = new WebDriverWait(driver, timeoutInSeconds);
    }
}
