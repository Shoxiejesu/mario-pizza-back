package fr.yanni.mariopizza.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.yanni.mariopizza.core.dto.OrderDTO;
import fr.yanni.mariopizza.core.dto.mapper.OrderMapper;
import fr.yanni.mariopizza.core.service.IOrderService;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrderController {

	/**
	 * The order service.
	 */
	@Autowired
	private IOrderService orderService;

	/**
	 * Create or update a order.
	 *
	 * @param order the order as a OrderDTO
	 * @return the updated order
	 */
	@PostMapping("/")
	public OrderDTO save(@RequestBody final OrderDTO order) {
		return OrderMapper.orderToDto(orderService.save(OrderMapper.dtoToEntity(order)));
	}
}
