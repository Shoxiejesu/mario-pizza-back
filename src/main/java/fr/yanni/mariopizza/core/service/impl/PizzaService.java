package fr.yanni.mariopizza.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.yanni.mariopizza.core.domain.Pizza;
import fr.yanni.mariopizza.core.repository.IPizzaRepository;
import fr.yanni.mariopizza.core.service.IPizzaService;

@Service
@CrossOrigin
public final class PizzaService implements IPizzaService {

	/** repository for the Pizza. */
	@Autowired
	private IPizzaRepository pizzaRepo;

	@Override
	public List<Pizza> getAllPizzas() {
		return pizzaRepo.findAll();
	}

	@Override
	public List<Pizza> getAllPizzasFilteredByName(final String name) {
		return pizzaRepo.findByNameStartingWith(name);
	}

	@Override
	public Pizza getOne(final Short id) {
		return pizzaRepo.getReferenceById(id);
	}

	@Override
	public Pizza save(final Pizza pizza) {
		return pizzaRepo.saveAndFlush(pizza);
	}

}
