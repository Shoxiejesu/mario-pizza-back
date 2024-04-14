package fr.yanni.mariopizza.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.yanni.mariopizza.core.dto.Order_lineDTO;
import fr.yanni.mariopizza.core.dto.mapper.Order_lineMapper;
import fr.yanni.mariopizza.core.service.IOrder_lineService;

@RestController
@CrossOrigin
@RequestMapping("/order_line")
public class Order_lineController {

	@Autowired
	private IOrder_lineService order_lineService;

	/**
	 * Create or update a order_line.
	 *
	 * @param order_line the order_line as a Order_lineDTO
	 * @return the updated order_line
	 */
	@PostMapping("/")
	public Order_lineDTO save(@RequestBody final Order_lineDTO order_line) {
		return Order_lineMapper.order_lineToDto(order_lineService.save(Order_lineMapper.dtoToEntity(order_line)));
	}
}
