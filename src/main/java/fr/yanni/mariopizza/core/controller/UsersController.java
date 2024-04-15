package fr.yanni.mariopizza.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.yanni.mariopizza.core.dto.UsersDTO;
import fr.yanni.mariopizza.core.dto.mapper.UsersMapper;
import fr.yanni.mariopizza.core.service.IUsersService;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UsersController {

	/**
	 * The order service.
	 */
	@Autowired
	private IUsersService usersService;

	/**
	 * Create or update a users.
	 *
	 * @param users the users as a UsersDTO
	 * @return the updated users
	 */
	@PostMapping("/")
	public UsersDTO save(@RequestBody final UsersDTO users) {
		return UsersMapper.usersToDto(usersService.save(UsersMapper.dtoToEntity(users)));
	}

	/**
	 * Get a user by username.
	 *
	 * @param username the username of the user
	 * @return the user with the specified username
	 */
	@GetMapping("/{username}")
	public ResponseEntity<UsersDTO> getUserByUsername(@PathVariable final String username) {
		UsersDTO user = UsersMapper.usersToDto(usersService.getUserByUsername(username));
		if (user != null) {
			return new ResponseEntity<>(user, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
