package fr.yanni.mariopizza.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.yanni.mariopizza.core.domain.Pizza;

@Repository
public interface IPizzaRepository extends JpaRepository<Pizza, Short> {

	/**
	 *
	 * @param name a filter
	 * @return all pokemons whose name starts with the given name
	 */
	List<Pizza> findByNameStartingWith(String name);

}
