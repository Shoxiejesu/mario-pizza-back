package fr.yanni.mariopizza.core.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import fr.yanni.mariopizza.core.domain.Pizza;
import fr.yanni.mariopizza.core.dto.PizzaDTO;

public class PizzaMapper {

	/**
	 *
	 * @param pokemons a List of Pizza
	 * @return the List of Pizza turned into its sibling List of PokemonDTOs
	 */
	public static List<PizzaDTO> pizzasToDtos(final List<Pizza> pizzas) {
		List<PizzaDTO> dtos = null;

		if ((pizzas != null)) {
			dtos = new ArrayList<>();

			for (Pizza pizza : pizzas) {
				dtos.add(pizzaToDto(pizza));
			}
		}

		return dtos;
	}

	/**
	 *
	 * @param pizza a Pizza
	 * @return the Pizza turned into its sibling PizzaDTO
	 */
	public static PizzaDTO pizzaToDto(final Pizza pizza) {
		PizzaDTO dto = null;

		if (pizza != null) {
			dto = new PizzaDTO();

			dto.setId(pizza.getId());
			dto.setDescription(pizza.getDescription());
			dto.setPrice(pizza.getPrice());
			dto.setName(pizza.getName());
			dto.setImage(pizza.getImage());

		}

		return dto;
	}

	/**
	 * Create a Pizza from a PizzaDTO.
	 *
	 * @param dto the dto used as a source
	 * @return a Pizza filled with datas from dto
	 */
	public static Pizza dtoToEntity(PizzaDTO dto) {
		Pizza entity = null;

		if (dto != null) {
			entity = new Pizza();
			entity.setId(dto.getId());
			entity.setImage(dto.getImage());
			entity.setDescription(dto.getDescription());
			entity.setName(dto.getName());

		}

		return entity;
	}

	public Boolean booleanMethod() {
		return null;
	}

}
