package br.tec.db.tests.page;

import br.tec.db.tests.components.Modal;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private static final Modal modal = new Modal();
    private static final By emailField = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[1]/input");
    private static final By passwordField = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[2]/div/input");
    private static final By signInBtn = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__login > form > div.login__buttons > button.style__ContainerButton-sc-1wsixal-0.otUnI.button__child");
    private static final By signOutBtn = By.cssSelector("");
    private static final By outClick = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__login > form > div.login__link > p");

    public void doLogin(String email, String password) {
        fillInput(emailField, email);
        fillInput(passwordField, password);
        click(signInBtn);
        modal.closeModal();
    }

    public void loginIncorrect(String email, String password) {
        fillInput(emailField, email);
        fillInput(passwordField, password);
        click(signInBtn);
    }

    public void doLogout() {
        click(signOutBtn);
    }
}