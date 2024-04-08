package fr.yanni.mariopizza.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

}
