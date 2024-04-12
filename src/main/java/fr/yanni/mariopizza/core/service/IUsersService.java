package fr.yanni.mariopizza.core.service;

import fr.yanni.mariopizza.core.domain.Users;

public interface IUsersService {
	/**
	 * create or update a users.
	 *
	 * @param users
	 * @return the updated users
	 */
	Users save(Users users);

	Users getUserByUsername(String username);

}
