package br.tec.db.tests.test;

import br.tec.db.tests.data.factory.datafaker.LoginData;
import br.tec.db.tests.data.factory.datafaker.RegisterData;
import br.tec.db.tests.page.Homepage;
import br.tec.db.tests.page.LoginPage;
import br.tec.db.tests.page.RegisterPage;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

@Owner("Bruno Scarpari")
@Epic("Transferência")
@Link(name = "Website", url = "https://bugbank.netlify.app/")
public class TransferenceTest {
    Homepage homepage = new Homepage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    LoginData loginData = new LoginData();
    RegisterData registerData = new RegisterData();

    @Test
    @Feature("Transferência bancária")
    @Story("US003 - Transferência entre contas")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("C3 - Realizar Transferência entre Contas")
    @Description("Verifica se é possível realizar transferência entre contas depois de criar 2 usuários como massa de dados")
    public void verifyLoginWithValidData() {
        // Todo: OBS.: impedido de prosseguir com os testes porque o website não está salvando os dados de login no localStorage
    }
}
