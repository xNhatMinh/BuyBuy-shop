package com.buybuy.project.repositories;

import com.buybuy.project.model.AppRole;
import com.buybuy.project.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
