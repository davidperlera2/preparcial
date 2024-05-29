package securifytech.com.preparcial.Entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
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
}
