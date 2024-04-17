package fr.yanni.mariopizza.core.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Short id;

	/** User ID of the user placing the order. */
	@Column(name = "usr_id")
	private Short usr_id;

	/** Date of the order. */
	@Column(name = "date", insertable = false, updatable = false)
	private String date;

	/** Total_amount of the order. */
	@Column(name = "total_amount")
	private Double total_amount;

	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private List<Order_line> orderLines = new ArrayList<>();

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(Short id, Short usr_id, String date, Double total_amount, List<Order_line> orderLines) {
		super();
		this.id = id;
		this.usr_id = usr_id;
		this.date = date;
		this.total_amount = total_amount;
		this.orderLines = orderLines;
	}

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public Short getUsr_id() {
		return usr_id;
	}

	public void setUsr_id(Short usr_id) {
		this.usr_id = usr_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(Double total_amount) {
		this.total_amount = total_amount;
	}

	public List<Order_line> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<Order_line> orderLines) {
		this.orderLines = orderLines;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", usr_id=" + usr_id + ", date=" + date + ", total_amount=" + total_amount
				+ ", orderLines=" + orderLines + "]";
	}

}
