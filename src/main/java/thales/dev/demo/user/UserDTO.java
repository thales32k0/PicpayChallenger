package thales.dev.demo.user;

import java.math.BigDecimal;

public record UserDTO(
    String name,
    String document,
    BigDecimal balance,
    String email,
    String password,
    UserType userType



){
}
