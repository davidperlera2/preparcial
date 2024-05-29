package securifytech.com.preparcial.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Data
@Table(name = "prparcial_roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String role;

    //@ManyToMany(mappedBy = "role")
    //private Set<User> users = new HashSet<>();

    //al parecer aqui van getter y setters lo estudiare luego
}
