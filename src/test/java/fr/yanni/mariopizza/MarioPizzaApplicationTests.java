package fr.yanni.mariopizza;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import fr.yanni.mariopizza.core.domain.Pizza;
import fr.yanni.mariopizza.core.dto.PizzaDTO;
import fr.yanni.mariopizza.core.dto.mapper.PizzaMapper;

@SpringBootTest
class MarioPizzaApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testPizzasToDtos() {
		List<Pizza> pizzas = new ArrayList<>();
		Pizza pizza1 = new Pizza();
		pizza1.setId((short) 1);
		pizza1.setName("Margherita");
		pizza1.setDescription("Tomato, mozzarella, basil");
		pizza1.setPrice(10.0);
		pizza1.setImage("margherita.jpg");
		pizzas.add(pizza1);

		Pizza pizza2 = new Pizza();
		pizza2.setId((short) 2);
		pizza2.setName("Pepperoni");
		pizza2.setDescription("Tomato, mozzarella, pepperoni");
		pizza2.setPrice(12.0);
		pizza2.setImage("pepperoni.jpg");
		pizzas.add(pizza2);

		List<PizzaDTO> dtos = PizzaMapper.pizzasToDtos(pizzas);

		assertNotNull(dtos);
		assertEquals(2, dtos.size());
		assertEquals("Margherita", dtos.get(0).getName());
		assertEquals("Pepperoni", dtos.get(1).getName());
	}

	@Test
	public void testPizzaToDto() {
		Pizza pizza = new Pizza();
		pizza.setId((short) 1);
		pizza.setName("Margherita");
		pizza.setDescription("Tomato, mozzarella, basil");
		pizza.setPrice(10.0);
		pizza.setImage("margherita.jpg");

		PizzaDTO dto = PizzaMapper.pizzaToDto(pizza);

		assertNotNull(dto);
		assertEquals((short) 2, dto.getId());
		assertEquals("Margherita", dto.getName());
		assertEquals("Tomato, mozzarella, basil", dto.getDescription());
		assertEquals(10.0, dto.getPrice(), 0.001);
		assertEquals("margherita.jpg", dto.getImage());
	}

	@Test
	public void testDtoToEntity() {
		PizzaDTO dto = new PizzaDTO();
		dto.setId((short) 2);
		dto.setName("Pepperoni");
		dto.setDescription("Tomato, mozzarella, pepperoni");
		dto.setPrice(12.0);
		dto.setImage("pepperoni.jpg");

		Pizza entity = PizzaMapper.dtoToEntity(dto);

		assertNotNull(entity);
		assertEquals((short) 2, entity.getId());
		assertEquals("Pepperoni", entity.getName());
		assertEquals("Tomato, mozzarella, pepperoni", entity.getDescription());
		assertEquals(12.0, entity.getPrice(), 0.001);
		assertEquals("pepperoni.jpg", entity.getImage());
	}

	@Test
	public void testBooleanMethod() {
		Boolean result = PizzaMapper.booleanMethod();
		assertNull(result);
	}
}
