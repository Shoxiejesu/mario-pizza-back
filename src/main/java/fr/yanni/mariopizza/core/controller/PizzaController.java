package fr.yanni.mariopizza.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.yanni.mariopizza.core.dto.PizzaDTO;
import fr.yanni.mariopizza.core.dto.mapper.PizzaMapper;
import fr.yanni.mariopizza.core.service.IPizzaService;

@RestController
@CrossOrigin
@RequestMapping("/pizza")

public class PizzaController {

	/**
	 * The order service.
	 */
	@Autowired
	private IPizzaService pizzaService;

	/**
	 * Get a pizza.
	 *
	 * @param pizza the pizza as a PizzaDTO
	 * @return the updated pizza
	 */

	@GetMapping("/")
	public List<PizzaDTO> getAll() {
		return PizzaMapper.pizzasToDtos(pizzaService.getAllPizzas());
	}

	/**
	 * Find a pizza from its id.
	 *
	 * @param id the id of the pizza
	 * @return the pizza with the given id
	 */
	@GetMapping("/{id}")
	public PizzaDTO getOne(@PathVariable("id") final Short id) {
		return PizzaMapper.pizzaToDto(pizzaService.getOne(id));
	}

}
