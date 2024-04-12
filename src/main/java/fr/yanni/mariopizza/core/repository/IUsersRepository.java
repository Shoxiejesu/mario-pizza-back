package fr.yanni.mariopizza.core.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.yanni.mariopizza.core.domain.Users;

@Repository
public interface IUsersRepository extends JpaRepository<Users, Short> {

	/**
	 *
	 * @param name a filter
	 * @return all pokemons whose name starts with the given name
	 */
	List<Users> findByUsernameStartingWith(String username);

	Optional<Users> findByUsername(String username);

}
