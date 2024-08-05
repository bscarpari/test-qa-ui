package br.tec.db.tests.test;

import br.tec.db.tests.data.factory.seleniumfactory.Elements;
import br.tec.db.tests.data.factory.seleniumfactory.SeleniumFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.time.Duration;

import static br.tec.db.tests.data.factory.seleniumfactory.SeleniumFactory.driver;

public class BaseTest {
    static SeleniumFactory seleniumFactory = new SeleniumFactory();

    @BeforeAll
    public static void waitUntilBrowserIsOpen() {
        Elements.initialize(driver, Duration.ofMillis(500));
    }

    @BeforeAll
    public static void openBrowser() {
        seleniumFactory.initBrowser();
    }

    @AfterAll
    public static void closeBrowser() {
        seleniumFactory.tearDown();
    }
}