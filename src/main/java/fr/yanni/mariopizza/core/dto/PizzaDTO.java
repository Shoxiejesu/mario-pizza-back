package fr.yanni.mariopizza.core.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PizzaDTO {

	/** unique Id of a pizza. */
	private Short id;

	/** name of the pizza. */
	private String name;

	/** description pizza. */
	private String description;

	/** url for retrieving the picture of the pizza. */
	private String image;

	/** health point of the pizza. */
	private Short price;

	public PizzaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PizzaDTO(Short id, String name, String description, String image, Short price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
		this.price = price;
	}

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Short getPrice() {
		return price;
	}

	public void setPrice(Short price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PizzaDTO [id=" + id + ", name=" + name + ", description=" + description + ", image=" + image
				+ ", price=" + price + "]";
	}

}
