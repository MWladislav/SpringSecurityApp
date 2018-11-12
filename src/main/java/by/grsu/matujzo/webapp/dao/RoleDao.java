package by.grsu.matujzo.webapp.dao;

import by.grsu.matujzo.webapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
