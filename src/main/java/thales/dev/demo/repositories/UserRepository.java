package thales.dev.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import thales.dev.demo.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
