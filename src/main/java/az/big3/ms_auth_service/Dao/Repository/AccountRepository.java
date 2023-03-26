package az.big3.ms_auth_service.Dao.Repository;

import az.big3.ms_auth_service.Dao.Entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
}