package securifytech.com.preparcial.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import securifytech.com.preparcial.Services.UserService;
import securifytech.com.preparcial.domain.Dtos.UserRegisterDto;
import securifytech.com.preparcial.domain.Entities.User;
//paso 6 crear el controlador de usuario
@RestController
@RequestMapping("/api/auth/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody UserRegisterDto userRegisterDto){
        User registeredUser = userService.registerUser(userRegisterDto);
        return ResponseEntity.ok(registeredUser);
    }
}
