package securifytech.com.preparcial.domain.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "prparcial_token")
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID code;

    private String content;

    private Date timestamp;

    private Boolean active;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name= "user_id")
    @JsonIgnore
    private User user;

    public Token(String content, User user){
        super();
        this.content = content;
        this.user = user;
        this.timestamp = Date.from(Instant.now());
        this.active = true;
    }
}
