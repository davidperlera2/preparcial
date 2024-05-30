package securifytech.com.preparcial.Services;

import securifytech.com.preparcial.domain.Dtos.UserRegisterDto;
import securifytech.com.preparcial.domain.Entities.User;
//paso 3: crear servicio de usuario para manejar la logica de negocio relacionada
public interface UserService {
    User registerUser(UserRegisterDto userRegisterDto);
}
