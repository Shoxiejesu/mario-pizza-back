package fr.yanni.mariopizza.core.dto.mapper;

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
}
