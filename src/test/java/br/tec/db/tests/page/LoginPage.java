package br.tec.db.tests.page;

import br.tec.db.tests.components.Modal;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private static final By emailField = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[1]/input");
    private static final By passwordField = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[2]/div/input");
    private static final By signInBtn = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__login > form > div.login__buttons > button.style__ContainerButton-sc-1wsixal-0.otUnI.button__child");
    private static final By signOutBtn = By.id("btnExit");

    public void clickSignInBtn() {
        click(signInBtn);
    }

    public void fillEmailField(String email) {
        fillInput(emailField, email);
    }

    public void fillPasswordField(String password) {
        fillInput(passwordField, password);
    }

    public void fillLoginFields(String email, String password) {
        fillEmailField(email);
        fillPasswordField(password);
//        waitElementToBeClickable(signOutBtn);
    }

    public void clickSignOutBtn() {
        click(signOutBtn);
    }

    public void doLogin(String email, String password) {
        fillLoginFields(email, password);
        clickSignInBtn();
    }

    public void doLogout() {
        clickSignOutBtn();
    }
}