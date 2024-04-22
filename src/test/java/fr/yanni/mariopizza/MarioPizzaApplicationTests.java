package fr.yanni.mariopizza;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import fr.yanni.mariopizza.core.domain.Order;
import fr.yanni.mariopizza.core.domain.Order_line;
import fr.yanni.mariopizza.core.domain.Pizza;
import fr.yanni.mariopizza.core.domain.Users;
import fr.yanni.mariopizza.core.dto.PizzaDTO;
import fr.yanni.mariopizza.core.dto.UsersDTO;
import fr.yanni.mariopizza.core.dto.mapper.PizzaMapper;
import fr.yanni.mariopizza.core.dto.mapper.UsersMapper;

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
	public void testDtoToEntity1() {
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

	@Test
	public void testUsersToDto() {
		Users users = new Users();
		users.setId((short) 1);
		users.setUsername("john_doe");
		users.setPassword("password");
		users.setFirstname("John");
		users.setLastname("Doe");
		users.setAddress("123 Main St");

		UsersDTO dto = UsersMapper.usersToDto(users);

		assertNotNull(dto);
		assertEquals((short) 1, dto.getId());
		assertEquals("john_doe", dto.getUsername());
		assertNull(dto.getPassword());
		assertEquals("John", dto.getFirstname());
		assertEquals("Doe", dto.getLastname());
		assertEquals("123 Main St", dto.getAddress());
	}

	@Test
	public void testDtoToEntity() {
		UsersDTO dto = new UsersDTO();
		dto.setId((short) 2);
		dto.setUsername("jane_smith");
		dto.setPassword("password");
		dto.setFirstname("Jane");
		dto.setLastname("Smith");
		dto.setAddress("456 Elm St");

		Users entity = UsersMapper.dtoToEntity(dto);

		// Verification creation Users
		assertNotNull(entity);
		assertEquals((short) 2, entity.getId());
		assertEquals("jane_smith", entity.getUsername());
		assertEquals("password", entity.getPassword());
		assertEquals("Jane", entity.getFirstname());
		assertEquals("Smith", entity.getLastname());
		assertEquals("456 Elm St", entity.getAddress());
	}

	@Test
	public void testDtoToEntityWithNullInput() {
		Users entity = UsersMapper.dtoToEntity(null);

		assertNull(entity);
	}

	@Test
	void testOrderToDto() {
		Order order = new Order();
		order.setUsr_id((short) 1);
		order.setTotal_amount(25.0);

		// Créer des orders
		List<Order_line> orderLines = new ArrayList<>();
		Order_line orderLine1 = new Order_line();
		orderLine1.setPiz_id((short) 1);
		orderLine1.setQuantity((short) 2);
		orderLines.add(orderLine1);

		Order_line orderLine2 = new Order_line();
		orderLine2.setPiz_id((short) 2);
		orderLine2.setQuantity((short) 3);
		orderLines.add(orderLine2);

	}

}
