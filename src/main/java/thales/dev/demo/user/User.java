package thales.dev.demo.user;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity(name = "users")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String document;

    @Column(unique = true)
    private String email;

    private String password;

    private UserType userType;

    private BigDecimal balance;

    public User(UserDTO dto){
        this.name = dto.name();
        this.document = dto.document();
        this.email = dto.email();
        this.password = dto.password();
        this.userType = dto.userType();
        this.balance = dto.balance();

    }
}
