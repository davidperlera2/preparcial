package securifytech.com.preparcial.Services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import securifytech.com.preparcial.Repositories.UserRepository;
import securifytech.com.preparcial.Services.UserService;
import securifytech.com.preparcial.domain.Dtos.UserRegisterDto;
import securifytech.com.preparcial.domain.Entities.User;

//paso 4 implementacion del servicio

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public User registerUser(UserRegisterDto userRegisterDto) {
        if(userRepository.findByUsername(userRegisterDto.getUsername()) != null){
            throw new RuntimeException("Username already exist");
        }

        if(userRepository.findByEmail(userRegisterDto.getEmail()) != null){
            throw new RuntimeException("Email already exist");
        }

        User user = new User();
        user.setUsername(userRegisterDto.getUsername());
        user.setEmail(userRegisterDto.getEmail());
        user.setPassword(userRegisterDto.getPassword());

        return userRepository.save(user);
    }
}
