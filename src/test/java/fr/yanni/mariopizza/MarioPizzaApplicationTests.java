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
		pizza1.setDescription("Sauce tomate à l'origan et mozzarella");
		pizza1.setPrice(7.9);
		pizza1.setImage("margherita.jpg");
		pizzas.add(pizza1);

		Pizza pizza2 = new Pizza();
		pizza2.setId((short) 2);
		pizza2.setName("Campagnarde");
		pizza2.setDescription("Crème fraîche légère, mozzarella, lardons, oignons rouges frais et champignons frais");
		pizza2.setPrice(10.0);
		pizza2.setImage("campagnard.jpg");
		pizzas.add(pizza2);

		List<PizzaDTO> dtos = PizzaMapper.pizzasToDtos(pizzas);

		assertNotNull(dtos);
		assertEquals(2, dtos.size());
		assertEquals("Margherita", dtos.get(0).getName());
		assertEquals("Campagnarde", dtos.get(1).getName());
	}

	@Test
	public void testPizzaToDto() {
		Pizza pizza = new Pizza();
		pizza.setId((short) 1);
		pizza.setName("Margherita");
		pizza.setDescription("Sauce tomate à l'origan et mozzarella");
		pizza.setPrice(7.9);
		pizza.setImage("margherita.jpg");

		PizzaDTO dto = PizzaMapper.pizzaToDto(pizza);

		assertNotNull(dto);
		assertEquals((short) 2, dto.getId());
		assertEquals("Margherita", dto.getName());
		assertEquals("Sauce tomate à l'origan et mozzarella", dto.getDescription());
		assertEquals(7.9, dto.getPrice(), 0.001);
		assertEquals("margherita.jpg", dto.getImage());
	}

	@Test
	public void testDtoToEntity1() {
		PizzaDTO dto = new PizzaDTO();
		dto.setId((short) 2);
		dto.setName("Campagnarde");
		dto.setDescription("Crème fraîche légère, mozzarella, lardons, oignons rouges frais et champignons frais");
		dto.setPrice(12.0);
		dto.setImage("pepperoni.jpg");

		Pizza entity = PizzaMapper.dtoToEntity(dto);

		assertNotNull(entity);
		assertEquals((short) 2, entity.getId());
		assertEquals("Campagnarde", entity.getName());
		assertEquals("Crème fraîche légère, mozzarella, lardons, oignons rouges frais et champignons frais",
				entity.getDescription());
		assertEquals(12.0, entity.getPrice(), 0.001);
		assertEquals("campagnarde.jpg", entity.getImage());
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
		users.setUsername("PiotS");
		users.setPassword("piot12345");
		users.setFirstname("Stephane");
		users.setLastname("Piotrowski");
		users.setAddress("17 rue Fenelon");

		UsersDTO dto = UsersMapper.usersToDto(users);

		assertNotNull(dto);
		assertEquals((short) 1, dto.getId());
		assertEquals("PiotS", dto.getUsername());
		assertNull(dto.getPassword());
		assertEquals("Stephane", dto.getFirstname());
		assertEquals("Piotrowski", dto.getLastname());
		assertEquals("17 rue Fenelon", dto.getAddress());
	}

	@Test
	public void testDtoToEntity() {
		UsersDTO dto = new UsersDTO();
		dto.setId((short) 2);
		dto.setUsername("kb9");
		dto.setPassword("kb912345");
		dto.setFirstname("Karim");
		dto.setLastname("Benzema");
		dto.setAddress("36 rue de Tournai");

		Users entity = UsersMapper.dtoToEntity(dto);

		// Verification creation Users
		assertNotNull(entity);
		assertEquals((short) 2, entity.getId());
		assertEquals("kb9", entity.getUsername());
		assertEquals("kb912345", entity.getPassword());
		assertEquals("Karim", entity.getFirstname());
		assertEquals("Benzema", entity.getLastname());
		assertEquals("36 rue de Tournai", entity.getAddress());
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
