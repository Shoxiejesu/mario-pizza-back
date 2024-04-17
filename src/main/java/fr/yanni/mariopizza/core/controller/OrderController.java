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
		// Créer une nouvelle instance d'Order
		Order newOrder = new Order();

		// Mapper l'OrderDTO reçu à l'entité Order
		Order mappedOrder = OrderMapper.dtoToEntity(order);

		// Enregistrer la commande
		Order savedOrder = orderService.save(mappedOrder);

		// Mapper l'entité Order sauvegardée à un OrderDTO
		return OrderMapper.orderToDto(savedOrder);
	}
}
