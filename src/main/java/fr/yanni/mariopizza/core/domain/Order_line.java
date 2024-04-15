package fr.yanni.mariopizza.core.domain;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
	@Column(name = "id")
	private Short id;

	/** Order ID of the order. */
	@Column(name = "ord_id")
	private Short ord_id;

	/** Pizza ID of the ordered pizza. */
	@Column(name = "piz_id")
	private Short piz_id;

	/** Quantity of the ordered pizza. */
	@Column(name = "quantity")
	private Short quantity;

	/**
	 * Default constructor.
	 */
	public Order_line() {
		super();
	}

	/**
	 * Parameterized constructor.
	 *
	 * @param id       The unique ID of the order line (Short).
	 * @param ord_id   The order ID (Short).
	 * @param piz_id   The pizza ID (Short).
	 * @param quantity The quantity of the ordered pizza (Short).
	 */
	public Order_line(final Short id, Short ord_id, Short piz_id, Short quantity) {
		super();
		this.id = id;
		this.ord_id = ord_id;
		this.piz_id = piz_id;
		this.quantity = quantity;
	}

	/**
	 * Getter for ID.
	 *
	 * @return The ID of the order line (Short).
	 */
	public Short getId() {
		return id;
	}

	/**
	 * Setter for ID.
	 *
	 * @param id The ID to set (Short).
	 */
	public void setId(final Short id) {
		this.id = id;
	}

	/**
	 * Getter for order ID.
	 *
	 * @return The order ID (Short).
	 */
	public Short getOrd_id() {
		return ord_id;
	}

	/**
	 * Setter for order ID.
	 *
	 * @param ord_id The order ID to set (Short).
	 */
	public void setOrd_id(final Short ord_id) {
		this.ord_id = ord_id;
	}

	/**
	 * Getter for pizza ID.
	 *
	 * @return The pizza ID (Short).
	 */
	public Short getPiz_id() {
		return piz_id;
	}

	/**
	 * Setter for pizza ID.
	 *
	 * @param piz_id The pizza ID to set (Short).
	 */
	public void setPiz_id(final Short piz_id) {
		this.piz_id = piz_id;
	}

	/**
	 * Getter for quantity.
	 *
	 * @return The quantity of the ordered pizza (Short).
	 */
	public Short getQuantity() {
		return quantity;
	}

	/**
	 * Setter for quantity.
	 *
	 * @param quantity The quantity to set (Short).
	 */
	public void setQuantity(final Short quantity) {
		this.quantity = quantity;
	}

	/**
	 * String representation of the object.
	 *
	 * @return String representation of the order line.
	 */
	@Override
	public String toString() {
		return "Order_line [id=" + id + ", ord_id=" + ord_id + ", piz_id=" + piz_id + ", quantity=" + quantity + "]";
	}
}
