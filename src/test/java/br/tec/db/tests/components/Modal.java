package br.tec.db.tests.components;

import br.tec.db.tests.page.BasePage;
import org.openqa.selenium.By;

public class Modal extends BasePage {
    private static final By modalText = By.cssSelector("#modalText");
    private static final By modalBtnClose = By.cssSelector("#btnCloseModal");

    public String readModalText() {
        return readText(modalText);
    }

    public Boolean isModalTextCorrect(String text) {
        return readText(modalText).contains(text);
    }

    public void closeModal() {
        clickWithWait(modalBtnClose);
    }
}
