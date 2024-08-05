package br.tec.db.tests.test;

import br.tec.db.tests.components.Transference;
import br.tec.db.tests.data.dto.RegisterDTO;
import br.tec.db.tests.data.factory.datafaker.RegisterData;
import br.tec.db.tests.page.Homepage;
import br.tec.db.tests.page.LoginPage;
import br.tec.db.tests.page.RegisterPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Owner("Bruno Scarpari")
@Epic("Transferência")
@Link(name = "Website", url = "https://bugbank.netlify.app/")
public class TransferenceTest extends BaseTest {
    Homepage homepage = new Homepage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Transference transference = new Transference();

    @Test
    @Feature("Transferência bancária")
    @Story("US003 - Transferência entre contas")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("C3 - Realizar Transferência entre Contas")
    @Description("Verifica se é possível realizar transferência entre contas depois de criar 2 usuários como massa de dados")
    public void makeATransferenceToOtherPerson() {
        RegisterDTO userOne = RegisterData.registerWithFixedData(true);
        RegisterDTO userTwo = RegisterData.registerValidData(false);

        registerPage.doRegisterAndGoToHomepage(userOne.getEmail(), userOne.getName(), userOne.getPassword(), userOne.getPasswordConfirmation(), true);
        loginPage.doLogin(userOne.getEmail(), userOne.getPassword());
        String beforeTransferAccountValue = homepage.getCurrentAccountValue();
        System.out.println("================== ANTES =================");
        System.out.println("\n" + userOne.getName() + "(Transferidor)");
        System.out.println("Saldo antigo: " + beforeTransferAccountValue);
        loginPage.doLogout();

        registerPage.clearInputs();
        registerPage.doRegisterAndGoToHomepage(userTwo.getEmail(), userTwo.getName(), userTwo.getPassword(), userTwo.getPasswordConfirmation(), false);
        loginPage.doLogin(userTwo.getEmail(), userTwo.getPassword());
        String targetAccountNumber = homepage.getAccountNumber();
        String targetAccountDigit = homepage.getAccountDigitNumber();
        String beforeTargetAccountValue = homepage.getCurrentAccountValue();
        System.out.println(userTwo.getName() + "(Recebedor)");
        System.out.println("Saldo antigo: " + beforeTargetAccountValue);
        loginPage.doLogout();

        loginPage.doLogin(userOne.getEmail(), userOne.getPassword());
        transference.doTransference(targetAccountNumber, targetAccountDigit, "99.0", "Teste de transferência");
        homepage.goBack();

        String afterTransferAccountValue = homepage.getCurrentAccountValue();
        System.out.println("\n================== DEPOIS =================");
        System.out.println("\n" + userOne.getName() + "(Transferidor)");
        System.out.println("Saldo atual: " + afterTransferAccountValue);
        loginPage.doLogout();

        loginPage.doLogin(userTwo.getEmail(), userTwo.getPassword());
        String afterTargetAccountValue = homepage.getCurrentAccountValue();
        System.out.println("\n" + userTwo.getName() + "(Recebedor)");
        System.out.println("Saldo atual: " + afterTargetAccountValue);
    }
}
