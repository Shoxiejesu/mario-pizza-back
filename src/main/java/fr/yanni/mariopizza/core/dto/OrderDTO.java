package fr.yanni.mariopizza.core.dto;

/**
 * Data Transfer Object (DTO) représentant une commande.
 */
public class OrderDTO {

	/** Identifiant unique de la commande. */
	private Short id;

	/** Identifiant de l'utilisateur associé à cette commande. */
	private Short usr_id;

	/** Date de la commande. */
	private String date;

	/** Montant total de la commande. */
	private Double total_amount;

	/**
	 * Constructeur par défaut.
	 */
	public OrderDTO() {
		super();
	}

	/**
	 * Constructeur avec paramètres.
	 *
	 * @param id           Identifiant unique de la commande
	 * @param usr_id       Identifiant de l'utilisateur associé
	 * @param date         Date de la commande
	 * @param total_amount Montant total de la commande
	 */
	public OrderDTO(final Short id, Short usr_id, String date, Double total_amount) {
		super();
		this.id = id;
		this.usr_id = usr_id;
		this.date = date;
		this.total_amount = total_amount;
	}

	/**
	 * Obtient l'identifiant de la commande.
	 *
	 * @return L'identifiant de la commande
	 */
	public Short getId() {
		return id;
	}

	/**
	 * Définit l'identifiant de la commande.
	 *
	 * @param id L'identifiant de la commande à définir
	 */
	public void setId(final Short id) {
		this.id = id;
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
		return "OrderDTO [id=" + id + ", usr_id=" + usr_id + ", date=" + date + ", total_amount=" + total_amount + "]";
	}

}
