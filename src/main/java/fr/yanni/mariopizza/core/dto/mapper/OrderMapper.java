package fr.yanni.mariopizza.core.dto.mapper;

import fr.yanni.mariopizza.core.domain.Order;
import fr.yanni.mariopizza.core.dto.OrderDTO;

public class OrderMapper {
	/**
	 *
	 * @param pizza a Pizza
	 * @return the Pizza turned into its sibling PizzaDTO
	 */
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

	/**
	 * Create a Pizza from a PizzaDTO.
	 *
	 * @param dto the dto used as a source
	 * @return a Pizza filled with datas from dto
	 */
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

	public Boolean booleanMethod() {
		return null;
	}

}
