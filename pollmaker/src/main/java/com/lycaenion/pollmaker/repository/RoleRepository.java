package com.lycaenion.pollmaker.repository;


import com.lycaenion.pollmaker.model.Role;
import com.lycaenion.pollmaker.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName roleName);

}
