package fr.yanni.mariopizza.core.dto;

import java.util.List;

/**
 * Data Transfer Object (DTO) représentant une commande.
 */
public class OrderDTO {

	/** Identifiant de l'utilisateur associé à cette commande. */
	private Short usr_id;

	/** Date de la commande. */
	private String date;

	/** Montant total de la commande. */
	private Double total_amount;

	private List<Order_lineDTO> orderLines;

	public List<Order_lineDTO> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<Order_lineDTO> orderLines) {
		this.orderLines = orderLines;
	}

	public OrderDTO(Short usr_id, String date, Double total_amount, List<Order_lineDTO> orderLines) {
		super();
		this.usr_id = usr_id;
		this.date = date;
		this.total_amount = total_amount;
		this.orderLines = orderLines;
	}

	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Obtient l'identifiant de l'utilisateur associé à cette commande.
	 *
	 * @return L'identifiant de l'utilisateur associé
	 */
	public Short getUsr_id() {
		return usr_id;
	}

	/**
	 * Définit l'identifiant de l'utilisateur associé à cette commande.
	 *
	 * @param usr_id L'identifiant de l'utilisateur associé à définir
	 */
	public void setUsr_id(final Short usr_id) {
		this.usr_id = usr_id;
	}

	/**
	 * Obtient la date de la commande.
	 *
	 * @return La date de la commande
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Définit la date de la commande.
	 *
	 * @param date La date de la commande à définir
	 */
	public void setDate(final String date) {
		this.date = date;
	}

	/**
	 * Obtient le montant total de la commande.
	 *
	 * @return Le montant total de la commande
	 */
	public Double getTotal_amount() {
		return total_amount;
	}

	/**
	 * Définit le montant total de la commande.
	 *
	 * @param total_amount Le montant total de la commande à définir
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
		return "OrderDTO [usr_id=" + usr_id + ", date=" + date + ", total_amount=" + total_amount + "]";
	}

}
