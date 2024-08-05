package br.tec.db.tests.test;

import br.tec.db.tests.data.dto.RegisterDTO;
import br.tec.db.tests.data.factory.datafaker.RegisterData;
import br.tec.db.tests.page.RegisterPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Owner("Bruno Scarpari")
@Epic("Autenticação")
@Link(name = "Website", url = "https://bugbank.netlify.app/")
public class RegisterTest extends BaseTest {
    RegisterPage registerPage = new RegisterPage();
    RegisterData registerData = new RegisterData();

    @Test
    @Feature("Registro")
    @Story("US001 - Cadastro")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("C1 - Realizar Cadastro")
    @Description("Verifica se um usuário pode se registrar com dados válidos")
    public void validateRegisterValidData() {
        RegisterDTO registerDTO = registerData.registerWithFixedData(true);
        registerPage.doRegisterAndGoToHomepage(registerDTO.getEmail(), registerDTO.getName(), registerDTO.getPassword(), registerDTO.getPasswordConfirmation(), true);
    }
}
