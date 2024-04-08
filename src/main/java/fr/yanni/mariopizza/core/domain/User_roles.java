package fr.yanni.mariopizza.core.domain;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_roles")
@CrossOrigin
public class User_roles {
	/** user_id of a users. */
	@Id
	@Column(name = "user_id")
	private Short user_id;

	/** role_id of the users. */
	@Column(name = "role_id")
	private Short role_id;

	public User_roles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User_roles(Short user_id, Short role_id) {
		super();
		this.user_id = user_id;
		this.role_id = role_id;
	}

	public Short getUser_id() {
		return user_id;
	}

	public void setUser_id(Short user_id) {
		this.user_id = user_id;
	}

	public short getRole_id() {
		return role_id;
	}

	public void setRole_id(Short role_id) {
		this.role_id = role_id;
	}

	@Override
	public String toString() {
		return "User_roles [user_id=" + user_id + ", role_id=" + role_id + "]";
	}

}
