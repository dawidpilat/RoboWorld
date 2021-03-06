package pl.robo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.robo.model.UserRole;


public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    UserRole findByRole(String role);
}