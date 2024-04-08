package fr.yanni.mariopizza.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.yanni.mariopizza.core.dto.User_rolesDTO;
import fr.yanni.mariopizza.core.dto.mapper.User_rolesMapper;
import fr.yanni.mariopizza.core.service.IUser_rolesService;

@RestController
@CrossOrigin
@RequestMapping("/user_roles")
public class User_rolesController {

	@Autowired
	private IUser_rolesService user_rolesService;

	/**
	 * Create or update a users.
	 *
	 * @param users the users as a UsersDTO
	 * @return the updated users
	 */
	@PostMapping("/")
	public User_rolesDTO save(@RequestBody final User_rolesDTO user_roles) {
		return User_rolesMapper.user_rolesToDto(user_rolesService.save(User_rolesMapper.dtoToEntity(user_roles)));
	}
}
