package pl.robo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.robo.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}