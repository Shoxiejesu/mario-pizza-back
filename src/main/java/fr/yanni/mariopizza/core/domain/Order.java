package fr.yanni.mariopizza.core.domain;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Represents an order entity.
 */
@Entity
@Table(name = ("`order`"))
@CrossOrigin
public class Order {

	/** Unique ID of an order. */
	@Id
	@Column(name = "id")
	private Short id;

	/** User ID of the user placing the order. */
	@Column(name = "usr_id")
	private Short usr_id;

	/** Date of the order. */
	@Column(name = "date")
	private String date;

	/** Total_amount of the order. */
	@Column(name = "total_amount")
	private Double total_amount;

	/**
	 * Default constructor.
	 */
	public Order() {
		super();
	}

	/**
	 * Parameterized constructor.
	 *
	 * @param id           The unique ID of the order.
	 * @param usr_id       The user ID placing the order.
	 * @param date         The date of the order.
	 * @param total_amount The total amount of the order.
	 */
	public Order(final Short id, Short usr_id, String date, Double total_amount) {
		super();
		this.id = id;
		this.usr_id = usr_id;
		this.date = date;
		this.total_amount = total_amount;
	}

	/**
	 * Getter for ID.
	 *
	 * @return The ID of the order.
	 */
	public Short getId() {
		return id;
	}

	/**
	 * Setter for ID.
	 *
	 * @param id The ID to set.
	 */
	public void setId(final Short id) {
		this.id = id;
	}

	/**
	 * Getter for user ID.
	 *
	 * @return The user ID placing the order.
	 */
	public Short getUsr_id() {
		return usr_id;
	}

	/**
	 * Setter for user ID.
	 *
	 * @param usr_id The user ID to set.
	 */
	public void setUsr_id(final Short usr_id) {
		this.usr_id = usr_id;
	}

	/**
	 * Getter for date.
	 *
	 * @return The date of the order.
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Setter for date.
	 *
	 * @param date The date to set.
	 */
	public void setDate(final String date) {
		this.date = date;
	}

	/**
	 * Getter for total amount.
	 *
	 * @return The total amount of the order.
	 */
	public Double getTotal_amount() {
		return total_amount;
	}

	/**
	 * Setter for total amount.
	 *
	 * @param total_amount The total amount to set.
	 */
	public void setTotal_amount(final Double total_amount) {
		this.total_amount = total_amount;
	}

	/**
	 * String representation of the object.
	 *
	 * @return String representation of the order.
	 */
	@Override
	public String toString() {
		return "Order [id=" + id + ", usr_id=" + usr_id + ", date=" + date + ", total_amount=" + total_amount + "]";
	}

}
