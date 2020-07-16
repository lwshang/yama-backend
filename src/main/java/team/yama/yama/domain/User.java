package team.yama.yama.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    private UserType userType;
    private String firstName;
    private String lastName;
}