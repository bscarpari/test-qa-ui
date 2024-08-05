package br.tec.db.tests.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class RegisterPage extends BasePage {
    private static final By registerBtn = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__login > form > div.login__buttons > button.style__ContainerButton-sc-1wsixal-0.ihdmxA.button__child");
    private static final By emailField = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > div:nth-child(2) > input");
    private static final By nameField = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > div:nth-child(3) > input");
    private static final By passwordField = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > div:nth-child(4) > div > input");
    private static final By passworldConfirmField = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > div:nth-child(5) > div > input");
    private static final By isAccountWithBalance = By.id("toggleAddBalance");
    private static final By registerSubmitBtn = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > button");
    private static final By modalCloseBtn = By.id("btnCloseModal");

    public void clickRegisterBtn() {
        click(registerBtn);
    }

    public void fillEmailField(String email) {
        fillInput(emailField, email);
    }

    public void fillNameField(String name) {
        fillInput(nameField, name);
    }

    public void fillPasswordField(String senha) {
        fillInput(passwordField, senha);
    }

    public void fillPassworldConfirmField(String senha) {
        fillInput(passworldConfirmField, senha);
    }

    public void clickIsAccountWithBalance() {
//        waitElementToBeClickable(modalCloseBtn);
        click(isAccountWithBalance);
    }

    public void clickRegisterSubmitBtn() {
        click(registerSubmitBtn);
    }

    public void clickModalCloseBtn() {
        waitElementToBeClickable(modalCloseBtn);
        click(modalCloseBtn);
    }

    public void fillTheRegisterForm(String email, String name, String password, String passwordConfirm) {
        fillEmailField(email);
        fillNameField(name);
        fillPasswordField(password);
        fillPassworldConfirmField(passwordConfirm);
        waitElement(isAccountWithBalance);
    }

    public void doRegisterAndGoToHomepage(String email, String name, String password, String passwordConfirmation, boolean withBalance) {
        clickRegisterBtn();
        fillTheRegisterForm(email, name, password, passwordConfirmation);

        if (withBalance) {
            try {
                waitElementToBeClickable(isAccountWithBalance);
                click(isAccountWithBalance);
            } catch (Exception e) {
                // Use JavaScript to click the element if intercepted
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();", driver.findElement(isAccountWithBalance));
            }
        }

        clickRegisterSubmitBtn();
        clickModalCloseBtn();
    }

    public void clearInputs() {
        clearInput(emailField);
        clearInput(nameField);
        clearInput(passwordField);
        clearInput(passworldConfirmField);
    }
}
