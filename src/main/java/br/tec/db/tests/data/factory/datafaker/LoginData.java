package br.tec.db.tests.data.factory.datafaker;

import br.tec.db.tests.data.dto.LoginDto;
import br.tec.db.tests.utils.DataFakerGenerator;

public class LoginData {
    DataFakerGenerator dataFakeGenerator = new DataFakerGenerator();

    public LoginDto loginWithFixedData() {
        LoginDto loginDto = new LoginDto();
        loginDto.setEmail("brunoomoraes686@gmail.com");
        loginDto.setPassword("123456789");
        return loginDto;
    }

    public LoginDto loginWithValidData() {
        LoginDto loginDto = new LoginDto();
        loginDto.setEmail(dataFakeGenerator.emailFaker());
        loginDto.setPassword(dataFakeGenerator.passwordFaker());
        return loginDto;
    }

    public LoginDto loginWithInvalidData() {
        LoginDto loginDto = new LoginDto();
        loginDto.setEmail(dataFakeGenerator.emailFaker());
        loginDto.setPassword(dataFakeGenerator.passwordFaker());
        return loginDto;
    }

    public LoginDto loginWithEmptyData() {
        LoginDto loginDto = new LoginDto();
        loginDto.setEmail("");
        loginDto.setPassword("");
        return loginDto;
    }

    public LoginDto loginWithEmptyPassword() {
        LoginDto loginDto = new LoginDto();
        loginDto.setEmail("brunoomoraes686@gmail.com");
        loginDto.setPassword("");
        return loginDto;
    }
}