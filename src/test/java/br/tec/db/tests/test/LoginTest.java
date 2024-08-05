package br.tec.db.tests.test;

import br.tec.db.tests.data.dto.LoginDto;
import br.tec.db.tests.data.factory.datafaker.LoginData;
import br.tec.db.tests.page.LoginPage;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

@Owner("Bruno Scarpari")
@Epic("Autenticação")
@Link(name = "Website", url = "https://bugbank.netlify.app/")
public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    LoginData loginData = new LoginData();

    @Test
    @Feature("Login")
    @Story("US002 - Login")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("C2 - Realizar Login")
    @Description("Verifica se é possível realizar login com dados válidos")
    public void verifyLoginWithValidData() {
        LoginDto loginDto = loginData.loginWithFixedData();
        loginPage.doLogin(loginDto.getEmail(), loginDto.getPassword());
    }
}