package fr.yanni.mariopizza.core.domain;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Represents a pizza entity.
 */
@Entity
@Table(name = "pizza")
@CrossOrigin
public class Pizza {

	/** Unique ID of a pizza. */
	@Id
	@Column(name = "id")
	private Short id;

	/** Name of the pizza. */
	@Column(name = "name")
	private String name;

	/** Description of the pizza. */
	@Column(name = "description")
	private String description;

	/** URL for retrieving the picture of the pizza. */
	@Column(name = "image")
	private String image;

	/** price of the pizza. */
	@Column(name = "price")
	private Double price;

	/**
	 * Parameterized constructor.
	 *
	 * @param id          The unique ID of the pizza.
	 * @param name        The name of the pizza.
	 * @param description The description of the pizza.
	 * @param image       The URL for retrieving the picture of the pizza.
	 * @param price       The price of the pizza.
	 */
	public Pizza(final Short id, String name, String description, String image, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
		this.price = price;
	}

	/**
	 * Default constructor.
	 */
	public Pizza() {
		super();
	}

	/**
	 * Getter for ID.
	 *
	 * @return The ID of the pizza.
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
	 * Getter for name.
	 *
	 * @return The name of the pizza.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for name.
	 *
	 * @param name The name to set.
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Getter for description.
	 *
	 * @return The description of the pizza.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter for description.
	 *
	 * @param description The description to set.
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * Getter for image URL.
	 *
	 * @return The URL for retrieving the picture of the pizza.
	 */
	public String getImage() {
		return image;
	}

	/**
	 * Setter for image URL.
	 *
	 * @param image The URL to set.
	 */
	public void setImage(final String image) {
		this.image = image;
	}

	/**
	 * Getter for price.
	 *
	 * @return The price of the pizza.
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * Setter for price.
	 *
	 * @param price The price to set.
	 */
	public void setPrice(final Double price) {
		this.price = price;
	}

	/**
	 * String representation of the object.
	 *
	 * @return String representation of the pizza.
	 */
	@Override
	public String toString() {
		return "Pizza [id=" + id + ", name=" + name + ", description=" + description + ", image=" + image + ", price="
				+ price + "]";
	}

}
