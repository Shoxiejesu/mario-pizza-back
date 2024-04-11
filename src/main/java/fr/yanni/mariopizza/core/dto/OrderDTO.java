package fr.yanni.mariopizza.core.dto;

public class OrderDTO {

	/** unique Id of a order. */
	private Short id;

	/** usr_id of the user. */
	private Short usr_id;

	/** date order. */
	private String date;

	/** total_amount order. */
	private Double total_amount;

	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDTO(Short id, Short usr_id, String date, Double total_amount) {
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
		return "OrderDTO [id=" + id + ", usr_id=" + usr_id + ", date=" + date + ", total_amount=" + total_amount + "]";
	}

}
