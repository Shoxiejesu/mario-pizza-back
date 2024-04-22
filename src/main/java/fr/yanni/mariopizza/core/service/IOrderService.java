package fr.yanni.mariopizza.core.service;

import fr.yanni.mariopizza.core.domain.Order;

public interface IOrderService {

	Order save(Order order);

	Order getOrderById(Short id);

}
