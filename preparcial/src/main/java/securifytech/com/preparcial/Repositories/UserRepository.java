package securifytech.com.preparcial.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import securifytech.com.preparcial.domain.Entities.User;

import java.util.UUID;
//paso 2: crear el repositorio para la entidad user
public interface UserRepository extends JpaRepository<User, UUID> {
    User findByUsername(String username);
    User findByEmail(String email);
}
