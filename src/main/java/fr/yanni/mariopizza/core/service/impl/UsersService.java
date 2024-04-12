package fr.yanni.mariopizza.core.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.yanni.mariopizza.core.domain.Users;
import fr.yanni.mariopizza.core.repository.IUsersRepository;
import fr.yanni.mariopizza.core.service.IUsersService;

@Service
@CrossOrigin
public class UsersService implements IUsersService {

	@Autowired
	private IUsersRepository usersRepo;

	@Override
	public Users save(final Users users) {
		return usersRepo.saveAndFlush(users);
	}

	@Override
	public Users getUserByUsername(String username) {
		Optional<Users> userOptional = usersRepo.findByUsername(username);
		return userOptional.orElse(null);
	}
}
