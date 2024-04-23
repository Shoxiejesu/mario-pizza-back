package fr.yanni.mariopizza.core.service;

import fr.yanni.mariopizza.core.domain.Order;

public interface IOrderService {

	/**
	 * Saves the given order to the repository.
	 *
	 * @param order The order to be saved.
	 * @return The saved order.
	 */

	Order save(Order order);

	/**
	 * Retrieves an order by its unique identifier.
	 *
	 * @param id The unique identifier of the order to retrieve.
	 * @return The order with the specified ID, or null if no such order exists.
	 */

	Order getOrderById(Short id);

}
