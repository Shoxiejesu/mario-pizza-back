package fr.yanni.mariopizza.core.domain;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = ("order_line"))
@CrossOrigin
public class Order_line {
	/** unique Id of a order. */
	@Id
	@Column(name = "id")
	private Short id;

	/** usr_id of the user. */
	@Column(name = "ord_id")
	private Short ord_id;

	/** usr_id of the user. */
	@Column(name = "piz_id")
	private Short piz_id;

	/** usr_id of the user. */
	@Column(name = "quantity")
	private Short quantity;

	public Order_line() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order_line(Short id, Short ord_id, Short piz_id, Short quantity) {
		super();
		this.id = id;
		this.ord_id = ord_id;
		this.piz_id = piz_id;
		this.quantity = quantity;
	}

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public Short getOrd_id() {
		return ord_id;
	}

	public void setOrd_id(Short ord_id) {
		this.ord_id = ord_id;
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
		return "Order_line [id=" + id + ", ord_id=" + ord_id + ", piz_id=" + piz_id + ", quantity=" + quantity + "]";
	}

}
