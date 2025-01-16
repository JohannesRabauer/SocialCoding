package de.johannes_rabauer.copilot_test.repository;

import de.johannes_rabauer.copilot_test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
