package br.tec.db.tests.test;

import br.tec.db.tests.data.factory.seleniumfactory.SeleniumFactory;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
    SeleniumFactory seleniumFactory = new SeleniumFactory();

    @Before
    public void openBrowser() {
        seleniumFactory.initBrowser("https://bugbank.netlify.app/");
    }

    @After
    public void closeBrowser() {
        seleniumFactory.tearDown();
    }
}