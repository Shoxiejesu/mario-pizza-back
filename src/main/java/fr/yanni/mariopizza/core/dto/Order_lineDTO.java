package fr.yanni.mariopizza.core.dto;

/**
 * Data Transfer Object (DTO) représentant une ligne de commande d'une commande.
 */
public class Order_lineDTO {
	/** Identifiant unique de la ligne de commande. */
	private Short id;

	/** Identifiant de la commande associée à cette ligne. */
	private Short ord_id;

	/** Identifiant de la pizza associée à cette ligne. */
	private Short piz_id;

	/** Quantité de pizzas commandées dans cette ligne. */
	private Short quantity;

	/**
	 * Constructeur par défaut.
	 */
	public Order_lineDTO() {
		super();
	}

	/**
	 * Constructeur avec paramètres.
	 *
	 * @param id       Identifiant unique de la ligne de commande
	 * @param ord_id   Identifiant de la commande associée
	 * @param piz_id   Identifiant de la pizza associée
	 * @param quantity Quantité de pizzas commandées
	 */
	public Order_lineDTO(Short id, Short ord_id, Short piz_id, Short quantity) {
		super();
		this.id = id;
		this.ord_id = ord_id;
		this.piz_id = piz_id;
		this.quantity = quantity;
	}

	/**
	 * Obtient l'identifiant de la ligne de commande.
	 *
	 * @return L'identifiant de la ligne de commande
	 */
	public Short getId() {
		return id;
	}

	/**
	 * Définit l'identifiant de la ligne de commande.
	 *
	 * @param id L'identifiant de la ligne de commande à définir
	 */
	public void setId(final Short id) {
		this.id = id;
	}

	/**
	 * Obtient l'identifiant de la commande associée à cette ligne.
	 *
	 * @return L'identifiant de la commande associée
	 */
	public Short getOrd_id() {
		return ord_id;
	}

	/**
	 * Définit l'identifiant de la commande associée à cette ligne.
	 *
	 * @param ord_id L'identifiant de la commande associée à définir
	 */
	public void setOrd_id(final Short ord_id) {
		this.ord_id = ord_id;
	}

	/**
	 * Obtient l'identifiant de la pizza associée à cette ligne.
	 *
	 * @return L'identifiant de la pizza associée
	 */
	public Short getPiz_id() {
		return piz_id;
	}

	/**
	 * Définit l'identifiant de la pizza associée à cette ligne.
	 *
	 * @param piz_id L'identifiant de la pizza associée à définir
	 */
	public void setPiz_id(final Short piz_id) {
		this.piz_id = piz_id;
	}

	/**
	 * Obtient la quantité de pizzas commandées dans cette ligne.
	 *
	 * @return La quantité de pizzas commandées
	 */
	public Short getQuantity() {
		return quantity;
	}

	/**
	 * Définit la quantité de pizzas commandées dans cette ligne.
	 *
	 * @param quantity La quantité de pizzas commandées à définir
	 */
	public void setQuantity(final Short quantity) {
		this.quantity = quantity;
	}

	/**
	 * String representation of the object.
	 *
	 * @return String representation of the order_line.
	 */
	@Override
	public String toString() {
		return "Order_lineDTO [id=" + id + ", ord_id=" + ord_id + ", piz_id=" + piz_id + ", quantity=" + quantity + "]";
	}
}
