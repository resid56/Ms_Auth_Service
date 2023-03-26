package az.big3.ms_auth_service.Dao.Repository;

import az.big3.ms_auth_service.Dao.Entity.ERole;
import az.big3.ms_auth_service.Dao.Entity.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}