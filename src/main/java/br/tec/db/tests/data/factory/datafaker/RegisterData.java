package br.tec.db.tests.data.factory.datafaker;

import br.tec.db.tests.data.dto.RegisterDTO;
import br.tec.db.tests.utils.DataFakerGenerator;

public class RegisterData {
    static DataFakerGenerator dataFakerGenerator = new DataFakerGenerator();

    public static RegisterDTO registerValidData(boolean withBalance) {
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

    public static RegisterDTO registerWithFixedData(boolean withBalance) {
        RegisterDTO registerDTO = new RegisterDTO();

        registerDTO.setEmail("brunoomoraes686@gmail.com");
        registerDTO.setName("Bruno Scarpari");
        registerDTO.setPassword("123");
        registerDTO.setPasswordConfirmation("123");

        if (!withBalance) registerDTO.setToggleAddBalance(false);

        return registerDTO;
    }
}
