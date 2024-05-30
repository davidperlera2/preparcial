package securifytech.com.preparcial.Entities;


import jakarta.persistence.*;
import lombok.Data;

import java.security.Principal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "prparcial_assigments")
public class Assigment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String title;

    private Date submissionDate;
    private String grade;

    @ManyToOne(fetch = FetchType.EAGER)
    private Course course;

    @ManyToMany(mappedBy = "assigment")
    private List<User> users;
}
