package fr.yanni.mariopizza.core.domain;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Represents a user entity.
 */
@Entity
@Table(name = "users")
@CrossOrigin
public class Users {

	/** Unique ID of a user. */
	@Id
	@Column(name = "id")
	private Short id;

	/** Username of the user. */
	@Column(name = "username")
	private String username;

	/** Password of the user. */
	@Column(name = "password")
	private String password;

	/** First name of the user. */
	@Column(name = "firstname")
	private String firstname;

	/** Last name of the user. */
	@Column(name = "lastname")
	private String lastname;

	/** Address of the user. */
	@Column(name = "address")
	private String address;

	/**
	 * Default constructor.
	 */
	public Users() {
		super();
	}

	/**
	 * Parameterized constructor.
	 *
	 * @param id        The unique ID of the user.
	 * @param username  The username of the user.
	 * @param password  The password of the user.
	 * @param firstname The first name of the user.
	 * @param lastname  The last name of the user.
	 * @param address   The address of the user.
	 */
	public Users(final Short id, String username, String password, String firstname, String lastname, String address) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}

	/**
	 * Getter for ID.
	 *
	 * @return The ID of the user.
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
	 * Getter for username.
	 *
	 * @return The username of the user.
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Setter for username.
	 *
	 * @param username The username to set.
	 */
	public void setUsername(final String username) {
		this.username = username;
	}

	/**
	 * Getter for password.
	 *
	 * @return The password of the user.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Setter for password.
	 *
	 * @param password The password to set.
	 */
	public void setPassword(final String password) {
		this.password = password;
	}

	/**
	 * Getter for first name.
	 *
	 * @return The first name of the user.
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * Setter for first name.
	 *
	 * @param firstname The first name to set.
	 */
	public void setFirstname(final String firstname) {
		this.firstname = firstname;
	}

	/**
	 * Getter for last name.
	 *
	 * @return The last name of the user.
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * Setter for last name.
	 *
	 * @param lastname The last name to set.
	 */
	public void setLastname(final String lastname) {
		this.lastname = lastname;
	}

	/**
	 * Getter for address.
	 *
	 * @return The address of the user.
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Setter for address.
	 *
	 * @param address The address to set.
	 */
	public void setAddress(final String address) {
		this.address = address;
	}

	/**
	 * String representation of the object.
	 *
	 * @return String representation of the user.
	 */
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", address=" + address + "]";
	}

}
