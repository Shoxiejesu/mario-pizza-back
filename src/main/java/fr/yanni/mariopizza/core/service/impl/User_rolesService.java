package fr.yanni.mariopizza.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.yanni.mariopizza.core.domain.User_roles;
import fr.yanni.mariopizza.core.repository.IUser_rolesRepository;
import fr.yanni.mariopizza.core.service.IUser_rolesService;

@Service
@CrossOrigin
public class User_rolesService implements IUser_rolesService {

	@Autowired
	private IUser_rolesRepository user_rolesRepo;

	@Override
	public User_roles save(final User_roles user_roles) {
		return user_rolesRepo.saveAndFlush(user_roles);
	}
}
