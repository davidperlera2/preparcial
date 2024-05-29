package securifytech.com.preparcial.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.security.PrivateKey;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@Table(name = "prparcial_courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String title;

    //Date


}
