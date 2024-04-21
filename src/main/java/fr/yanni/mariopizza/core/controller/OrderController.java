package fr.yanni.mariopizza.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.yanni.mariopizza.core.domain.Order;
import fr.yanni.mariopizza.core.dto.OrderDTO;
import fr.yanni.mariopizza.core.dto.mapper.OrderMapper;
import fr.yanni.mariopizza.core.service.IOrderService;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private IOrderService orderService;

	@Autowired
	private OrderMapper orderMapper;

	@PostMapping("/")
	public OrderDTO save(@RequestBody final OrderDTO order) {
		Order newOrder = orderMapper.dtoToEntity(order);
		Order savedOrder = orderService.save(newOrder);
		return orderMapper.orderToDto(savedOrder);
	}
}