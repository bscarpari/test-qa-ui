package br.tec.db.tests.page;

import br.tec.db.tests.components.Modal;
import org.openqa.selenium.By;

public class RegisterPage extends BasePage {
    private static final Modal modal = new Modal();
    private static final By emailInput = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > div:nth-child(2) > input");
    private static final By nameInput = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > div:nth-child(3) > input");
    private static final By passwordInput = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > div:nth-child(4) > div > input");
    private static final By confirmationPwdInput = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > div:nth-child(5) > div > input");
    private static final By toggleAddBalance = By.cssSelector("#toggleAddBalance");
    private static final By btnRegister = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > button");
    private static final By signUpBtn = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[2]");

    public void validRegisterAndGoToHome(String email, String firstName, String password, String passwordConfirm, boolean withBalance) {
        click(signUpBtn);
        fillInput(emailInput, email);
        fillInput(nameInput, firstName);
        fillInput(passwordInput, password);
        fillInput(confirmationPwdInput, passwordConfirm);
        if (withBalance) click(toggleAddBalance);
        click(btnRegister);
        modal.closeModal();
    }
}
