package fr.yanni.mariopizza.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.yanni.mariopizza.core.domain.Order;
import fr.yanni.mariopizza.core.repository.IOrderRepository;
import fr.yanni.mariopizza.core.service.IOrderService;

@Service
@CrossOrigin
public class OrderService implements IOrderService {

	@Autowired
	private IOrderRepository orderRepo;

	@Override
	public Order save(final Order order) {
		return orderRepo.saveAndFlush(order);
	}
}
