package fr.yanni.mariopizza.core.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import fr.yanni.mariopizza.core.domain.Order;
import fr.yanni.mariopizza.core.domain.Order_line;
import fr.yanni.mariopizza.core.dto.OrderDTO;
import fr.yanni.mariopizza.core.dto.Order_lineDTO;
import fr.yanni.mariopizza.core.service.impl.OrderService;
import fr.yanni.mariopizza.security.service.impl.UserDetailsServiceImpl;

@Component

public class OrderMapper {
	public OrderDTO orderToDto(final Order order) {
		OrderDTO dto = null;
		if (order != null) {
			dto = new OrderDTO();
			dto.setUsr_id(order.getUsr_id());
			dto.setTotal_amount(order.getTotal_amount());
			dto.setOrderLines(orderLinesToDtos(order.getOrderLines()));
		}
		return dto;
	}

	@Autowired
	private UserDetailsServiceImpl userService;

	public Order dtoToEntity(OrderDTO dto) {
		Order entity = null;
		if (dto != null) {
			entity = new Order();
			Long userId = getLoggedInUserId();
			if (userId != null) {
				entity.setUsr_id(userId.shortValue());
			}
			entity.setTotal_amount(dto.getTotal_amount());
			entity.setOrderLines(dtosToOrderLines(dto.getOrderLines(), entity));
		}
		return entity;
	}

	private Long getLoggedInUserId() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
			UserDetails userDetails = (UserDetails) principal;
			return userService.getUserIdByUsername(userDetails.getUsername());
		}
		return null;
	}

	public static Order_lineDTO orderLineToDto(final Order_line orderLine) {
		Order_lineDTO dto = null;
		if (orderLine != null) {
			dto = new Order_lineDTO();
			dto.setPiz_id(orderLine.getPiz_id());
			dto.setQuantity(orderLine.getQuantity());
			// Vous pouvez également définir l'identifiant de l'ordre dans la ligne de
			// commande si nécessaire
			dto.setOrd_id(orderLine.getOrder().getId());
		}
		return dto;
	}

	public Order_line dtoToOrderLine(Order_lineDTO dto) {
		Order_line entity = null;
		if (dto != null) {
			entity = new Order_line();
			entity.setPiz_id(dto.getPiz_id());
			entity.setQuantity(dto.getQuantity());
			// Assurez-vous de gérer l'association avec l'ordre ici si nécessaire
		}
		return entity;
	}

	public Order getOrderById(Short id) {
		// Code pour récupérer l'objet Order à partir de son ID
		OrderService orderService = new OrderService(); // Supposons que vous avez un service OrderService

		Order order = orderService.getOrderById(id);

		return order;
	}

	private List<Order_lineDTO> orderLinesToDtos(List<Order_line> orderLines) {
		List<Order_lineDTO> dtos = new ArrayList<>();
		if (orderLines != null) {
			for (Order_line orderLine : orderLines) {
				dtos.add(orderLineToDto(orderLine));
			}
		}
		return dtos;
	}

	private List<Order_line> dtosToOrderLines(List<Order_lineDTO> dtos, Order order) {
		List<Order_line> orderLines = new ArrayList<>();
		if (dtos != null) {
			for (Order_lineDTO dto : dtos) {
				Order_line orderLine = dtoToOrderLine(dto);
				// Assurez-vous que chaque ligne de commande est associée à l'ordre
				orderLine.setOrder(order);
				orderLines.add(orderLine);
			}
		}
		return orderLines;
	}
}
