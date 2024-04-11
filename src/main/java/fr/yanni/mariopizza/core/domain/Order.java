package fr.yanni.mariopizza.core.domain;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = ("`order`"))
@CrossOrigin
public class Order {

	/** unique Id of a order. */
	@Id
	@Column(name = "id")
	private Short id;

	/** usr_id of the user. */
	@Column(name = "usr_id")
	private Short usr_id;

	/** date order. */
	@Column(name = "date")
	private String date;

	/** total_amount order. */
	@Column(name = "total_amount")
	private Double total_amount;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(Short id, Short usr_id, String date, Double total_amount) {
		super();
		this.id = id;
		this.usr_id = usr_id;
		this.date = date;
		this.total_amount = total_amount;
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

	@Override
	public String toString() {
		return "Order [id=" + id + ", usr_id=" + usr_id + ", date=" + date + ", total_amount=" + total_amount + "]";
	}

}
