package fr.yanni.mariopizza.core.service;

import fr.yanni.mariopizza.core.domain.User_roles;

public interface IUser_rolesService {

	/**
	 * create or update a user_roles.
	 *
	 * @param user_roles
	 * @return the updated user_roles
	 */
	User_roles save(User_roles user_roles);

}
