package infrastructure;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import domain.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}