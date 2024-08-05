package br.tec.db.tests.page;

import org.openqa.selenium.By;

@SuppressWarnings("unused")
public class Homepage extends BasePage {
    private static final By titleHomepage = By.cssSelector("#__next > div > div.pages__TitleBackground-sc-1ee1f2s-1.dEBVGQ > h1");
    private static final By subtitleHomepage = By.cssSelector("#__next > div > div.pages__TitleBackground-sc-1ee1f2s-1.dEBVGQ > p");
    private static final By registerBtn = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[2]");
    private static final By loginBtn = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__login > form > div.login__buttons > button.style__ContainerButton-sc-1wsixal-0.otUnI.button__child");

    public String readHomepageInformations() {
        return readText(titleHomepage);
    }

    public String readHomepageSubtitle() {
        return readText(subtitleHomepage);
    }

    public void clickRegister() {
        click(registerBtn);
    }

    public void clickLogin() {
        click(loginBtn);
    }
}
