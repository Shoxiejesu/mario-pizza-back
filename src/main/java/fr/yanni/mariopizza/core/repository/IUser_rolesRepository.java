package fr.yanni.mariopizza.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.yanni.mariopizza.core.domain.User_roles;

@Repository
public interface IUser_rolesRepository extends JpaRepository<User_roles, Long> {

}
