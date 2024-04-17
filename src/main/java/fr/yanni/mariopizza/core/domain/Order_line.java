package fr.yanni.mariopizza.core.domain;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Represents an order line entity.
 */
@Entity
@Table(name = ("order_line"))
@CrossOrigin
public class Order_line {
	/** Unique ID of an order line. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Short id;

	@ManyToOne
	@JoinColumn(name = "ord_id", referencedColumnName = "id")
	private Order order;

	/** Pizza ID of the ordered pizza. */
	@Column(name = "piz_id")
	private Short piz_id;

	/** Quantity of the ordered pizza. */
	@Column(name = "quantity")
	private Short quantity;

	public Order_line() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order_line(Short id, Order order, Short piz_id, Short quantity) {
		super();
		this.id = id;
		this.order = order;
		this.piz_id = piz_id;
		this.quantity = quantity;
	}

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Short getPiz_id() {
		return piz_id;
	}

	public void setPiz_id(Short piz_id) {
		this.piz_id = piz_id;
	}

	public Short getQuantity() {
		return quantity;
	}

	public void setQuantity(Short quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Order_line [id=" + id + ", order=" + order + ", piz_id=" + piz_id + ", quantity=" + quantity + "]";
	}

}
