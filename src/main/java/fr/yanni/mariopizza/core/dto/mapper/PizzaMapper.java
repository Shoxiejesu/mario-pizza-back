package fr.yanni.mariopizza.core.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import fr.yanni.mariopizza.core.domain.Pizza;
import fr.yanni.mariopizza.core.dto.PizzaDTO;

public class PizzaMapper {
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

	public static Pizza dtoToEntity(final PizzaDTO dto) {
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

	public static Boolean booleanMethod() {
		return null;
	}

}
