package securifytech.com.preparcial.domain.Dtos;

import lombok.Data;
//paso 1: crear dto para el registro

@Data
public class UserRegisterDto {

    private String username;
    private String password;
    private String email;
}
