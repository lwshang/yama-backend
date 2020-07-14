package team.yama.yama.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
}