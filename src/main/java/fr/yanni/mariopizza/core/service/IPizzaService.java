package fr.yanni.mariopizza.core.service;

import java.util.List;

import fr.yanni.mariopizza.core.domain.Pizza;

public interface IPizzaService {

	/**
	 *
	 * @return all known pizzas
	 */

	List<Pizza> getAllPokemons();

	/**
	 *
	 * @param name a filter
	 * @return all pizza whose name starts with the given name
	 */
	List<Pizza> getAllPokemonsFilteredByName(String name);

	/**
	 * Find a pokemon from its id.
	 *
	 * @param id the id of the pokemon
	 * @return athe pokemon with the given id
	 */
	Pizza getOne(Short id);

	/**
	 * create or update a pizza.
	 *
	 * @param pizza
	 * @return the updated pizza
	 */
	Pizza save(Pizza pizza);

}
