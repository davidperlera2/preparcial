package securifytech.com.preparcial.domain.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "prparcial_roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "role_id")
    private UUID id;

    private String role;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    //al parecer aqui van getter y setters lo estudiare luego
}
