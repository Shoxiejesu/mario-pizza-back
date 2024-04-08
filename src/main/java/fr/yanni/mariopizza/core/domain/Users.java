package fr.yanni.mariopizza.core.domain;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
@CrossOrigin
public class Users {

	/** unique Id of a users. */
	@Id
	@Column(name = "id")
	private Short id;

	/** username of the users. */
	@Column(name = "username")
	private String username;

	/** password users. */
	@Column(name = "password")
	private String password;

	/** firstname users. */
	@Column(name = "firstname")
	private String firstname;

	/** lastname users. */
	@Column(name = "lastname")
	private String lastname;

	/** address users. */
	@Column(name = "address")
	private String address;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(Short id, String username, String password, String firstname, String lastname, String address) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", address=" + address + "]";
	}

}
