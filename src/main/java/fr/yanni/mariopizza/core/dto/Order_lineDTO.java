package fr.yanni.mariopizza.core.dto;

public class Order_lineDTO {
	/** unique Id of a order. */

	private Short id;

	/** ord_id of the user. */
	private Short ord_id;

	/** ord_id of the user. */
	private Short piz_id;

	/** ord_id of the user. */
	private Short quantity;

	public Order_lineDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order_lineDTO(Short id, Short ord_id, Short piz_id, Short quantity) {
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
		return "Order_lineDTO [id=" + id + ", ord_id=" + ord_id + ", piz_id=" + piz_id + ", quantity=" + quantity + "]";
	}

}
