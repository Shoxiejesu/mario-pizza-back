package fr.yanni.mariopizza.core.dto.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;

import fr.yanni.mariopizza.core.domain.Order_line;
import fr.yanni.mariopizza.core.dto.Order_lineDTO;

public class Order_lineMapper {
	/**
	 *
	 * @param Order_line a Order_line
	 * @return the Order_line turned into its sibling Order_lineDTO
	 */
	public static Order_lineDTO order_lineToDto(final Order_line order_line) {
		Order_lineDTO dto = null;

		if (order_line != null) {
			dto = new Order_lineDTO();

			dto.setId(order_line.getId());
			dto.setOrd_id(order_line.getOrd_id());
			dto.setPiz_id(order_line.getPiz_id());
			dto.setQuantity(order_line.getQuantity());

		}

		return dto;
	}

	/**
	 * Create a Pizza from a PizzaDTO.
	 *
	 * @param dto the dto used as a source
	 * @return a Pizza filled with datas from dto
	 */
	public static Order_line dtoToEntity(Order_lineDTO dto) {
		Order_line entity = null;

		if (dto != null) {
			entity = new Order_line();
			entity.setId(dto.getId());
			entity.setOrd_id(dto.getOrd_id());
			entity.setPiz_id(dto.getPiz_id());
			entity.setQuantity(dto.getQuantity());
		}

		return entity;
	}

	public Boolean booleanMethod() {
		return null;
	}

	@Test
	public void testOrder_lineToDto() {
		// Given
		Order_line order_line = new Order_line();
		order_line.setId((short) 1);
		order_line.setOrd_id((short) 2);
		order_line.setPiz_id((short) 3);
		order_line.setQuantity((short) 4);

		// When
		Order_lineDTO dto = Order_lineMapper.order_lineToDto(order_line);

		// Then
		assertNotNull(dto);
		assertEquals(order_line.getId(), dto.getId());
		assertEquals(order_line.getOrd_id(), dto.getOrd_id());
		assertEquals(order_line.getPiz_id(), dto.getPiz_id());
		assertEquals(order_line.getQuantity(), dto.getQuantity());
	}

	@Test
	public void testDtoToEntity() {
		// Given
		Order_lineDTO dto = new Order_lineDTO();
		dto.setId((short) 1);
		dto.setOrd_id((short) 2);
		dto.setPiz_id((short) 3);
		dto.setQuantity((short) 4);

		// When
		Order_line entity = Order_lineMapper.dtoToEntity(dto);

		// Then
		assertNotNull(entity);
		assertEquals(dto.getId(), entity.getId());
		assertEquals(dto.getOrd_id(), entity.getOrd_id());
		assertEquals(dto.getPiz_id(), entity.getPiz_id());
		assertEquals(dto.getQuantity(), entity.getQuantity());
	}

	@Test
	public void testDtoToEntityWithNull() {
		// Given
		Order_lineDTO dto = null;

		// When
		Order_line entity = Order_lineMapper.dtoToEntity(dto);

		// Then
		assertNull(entity);
	}
}
