package br.tec.db.tests.data.factory.datafaker;

import br.tec.db.tests.data.dto.RegisterDTO;
import br.tec.db.tests.utils.DataFakerGenerator;

public class RegisterData {
    DataFakerGenerator dataFakerGenerator = new DataFakerGenerator();

    public RegisterDTO registerValidData(boolean withBalance) {
        RegisterDTO registerDTO = new RegisterDTO();

        registerDTO.setEmail(dataFakerGenerator.emailFaker());
        registerDTO.setName(dataFakerGenerator.nameFaker());

        String password = dataFakerGenerator.passwordFaker();
        registerDTO.setPassword(password);
        registerDTO.setPasswordConfirmation(password);

        if (!withBalance) registerDTO.setToggleAddBalance(false);
        registerDTO.setToggleAddBalance(true);

        return registerDTO;
    }

    public RegisterDTO registerWithFixedData(boolean withBalance) {
        RegisterDTO registerDTO = new RegisterDTO();

        registerDTO.setEmail("brunoomoraes686@gmail.com");
        registerDTO.setName("Bruno Scarpari");
        registerDTO.setPassword("123456789");
        registerDTO.setPasswordConfirmation("123456789");

        if (!withBalance) registerDTO.setToggleAddBalance(false);

        return registerDTO;
    }
}
