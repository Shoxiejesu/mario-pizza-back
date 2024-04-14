package fr.yanni.mariopizza.core.dto.mapper;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import fr.yanni.mariopizza.core.domain.Order;
import fr.yanni.mariopizza.core.dto.OrderDTO;

public class OrderMapper {
	public static OrderDTO orderToDto(final Order order) {
		OrderDTO dto = null;
		if (order != null) {
			dto = new OrderDTO();
			dto.setId(order.getId());
			dto.setUsr_id(order.getUsr_id());
			dto.setDate(order.getDate());
			dto.setTotal_amount(order.getTotal_amount());
		}
		return dto;
	}

	public static Order dtoToEntity(OrderDTO dto) {
		Order entity = null;
		if (dto != null) {
			entity = new Order();
			entity.setId(dto.getId());
			entity.setUsr_id(dto.getUsr_id());
			entity.setDate(dto.getDate());
			entity.setTotal_amount(dto.getTotal_amount());
		}
		return entity;
	}

	public static Boolean booleanMethod() {
		return null;
	}

	@Test
	public void testOrderToDto() {
		Order order = new Order();
		order.setId((short) 1);
		order.setUsr_id((short) 101);
		order.setDate("2024-04-16");
		order.setTotal_amount(25.0);
		OrderDTO dto = OrderMapper.orderToDto(order);
		assertNotNull(dto);
		assertEquals((short) 1, dto.getId());
		assertEquals((short) 101, dto.getUsr_id());
		assertEquals("2024-04-16", dto.getDate());
		assertEquals(25.0, dto.getTotal_amount(), 0.001);
	}

	@Test
	public void testDtoToEntity() {
		OrderDTO dto = new OrderDTO();
		dto.setId((short) 2);
		dto.setUsr_id((short) 202);
		dto.setDate("2024-04-17");
		dto.setTotal_amount(30.0);
		Order entity = OrderMapper.dtoToEntity(dto);
		assertNotNull(entity);
		assertEquals((short) 2, entity.getId());
		assertEquals((short) 202, entity.getUsr_id());
		assertEquals("2024-04-17", entity.getDate());
		assertEquals(30.0, entity.getTotal_amount(), 0.001);
	}

	@Test
	public void testBooleanMethod() {
		Boolean result = OrderMapper.booleanMethod();
		assertNull(result);
	}
}
