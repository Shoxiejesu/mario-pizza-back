package fr.yanni.mariopizza.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.yanni.mariopizza.core.domain.Order_line;
import fr.yanni.mariopizza.core.repository.IOrder_lineRepository;
import fr.yanni.mariopizza.core.service.IOrder_lineService;

@Service
@CrossOrigin
public class Order_lineService implements IOrder_lineService {

	@Autowired
	private IOrder_lineRepository order_lineRepo;

	@Override
	public final Order_line save(final Order_line order_line) {
		return order_lineRepo.saveAndFlush(order_line);
	}
}
