package fr.yanni.mariopizza.core.dto;

public class User_rolesDTO {
	/** user_id of a users. */
	private Short user_id;

	/** role_id of the users. */
	private Short role_id;

	public User_rolesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User_rolesDTO(Short user_id, Short role_id) {
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
		return "User_rolesDTO [user_id=" + user_id + ", role_id=" + role_id + "]";
	}

}
