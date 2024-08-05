package br.tec.db.tests.components;

import org.openqa.selenium.By;
import br.tec.db.tests.page.BasePage;

public class Transference extends BasePage {
    private static final By transferBtn = By.id("btn-TRANSFERÊNCIA");
    private static final By accountNumber = By.xpath("//*[@id=\"__next\"]/div/div[3]/form/div[1]/div[1]/input");
    private static final By accountDigit = By.xpath("//*[@id=\"__next\"]/div/div[3]/form/div[1]/div[2]/input");
    private static final By transferenceValue = By.cssSelector("#__next > div > div.transfer__ContainerForm-sc-1yjpf2r-8.gasnNO > form > div:nth-child(2) > input");
    private static final By transferenceDescription = By.cssSelector("#__next > div > div.transfer__ContainerForm-sc-1yjpf2r-8.gasnNO > form > div:nth-child(3) > input");
    private static final By transferenceBtn = By.cssSelector("#__next > div > div.transfer__ContainerForm-sc-1yjpf2r-8.gasnNO > form > button");
    private static final By closeModalBtn = By.id("btnCloseModal");

    public void doTransference(String targetAccountNumber, String targetAccountDigit, String value, String description) {
        clickWithWait(transferBtn);
        fillInput(accountNumber, targetAccountNumber);
        fillInput(accountDigit, targetAccountDigit);
        fillInput(transferenceValue, value);
        fillInput(transferenceDescription, description);
        clickWithWait(transferenceBtn);
        waitElementToBeClickable(closeModalBtn);
    }
}
