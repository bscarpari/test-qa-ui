package br.tec.db.tests.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;

@SuppressWarnings("unused")
public class Homepage extends BasePage {
    private static final By titleHomepage = By.cssSelector("#__next > div > div.pages__TitleBackground-sc-1ee1f2s-1.dEBVGQ > h1");
    private static final By subtitleHomepage = By.cssSelector("#__next > div > div.pages__TitleBackground-sc-1ee1f2s-1.dEBVGQ > p");
    private static final By registerBtn = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[2]");
    private static final By loginBtn = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__login > form > div.login__buttons > button.style__ContainerButton-sc-1wsixal-0.otUnI.button__child");
    private static final By digitalAccountNumber = By.id("textAccountNumber");
    private static final By digitalAccountValue = By.id("textBalance");
    private static final By goBackBtn = By.id("btnBack");

    public String getCurrentAccountValue() {
        return readText(digitalAccountValue).replace("Saldo em conta R$ ", "").replace(".", "").replace(",", ".");
    }

    public String getAccountNumber() {
        return readText(digitalAccountNumber).split(": ")[1].split("-")[0];
    }

    public String getAccountDigitNumber() {
        return readText(digitalAccountNumber).split("-")[1];
    }

    public void clickRegister() {
        click(registerBtn);
    }

    public void clickLogin() {
        click(loginBtn);
    }

    public void clearCookiesAndLocalStorage() {
        // limpar cookies e dados do localStorage
        driver.manage().deleteAllCookies();

        // deletar dados do localStorage
        LocalStorage localStorage = ((WebStorage) driver).getLocalStorage();
        localStorage.clear();

        // recarregar a página
        driver.navigate().refresh();
    }

    // ERRO AQUI
    // element click intercepted:
    public void goBack() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(goBackBtn));
    }
}
