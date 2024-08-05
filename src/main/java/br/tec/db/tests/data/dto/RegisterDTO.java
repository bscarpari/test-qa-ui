package br.tec.db.tests.data.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegisterDTO {
    private String email;
    private String name;
    private String password;
    private String passwordConfirmation;
    private Boolean toggleAddBalance;
}
