package fr.yanni.mariopizza.security.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.yanni.mariopizza.security.models.Role;
import fr.yanni.mariopizza.security.models.User;
import fr.yanni.mariopizza.security.repository.UserRepository;
import fr.yanni.mariopizza.security.utils.UserMapper;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {
	/** import the userRepository. */
	@Autowired
	private UserRepository userRepository;

	/**
	 * Load user's details from the DB.
	 */
	@Override
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User NOT Found"));
		return UserMapper.userToPrincipal(user);
	}

	/**
	 *
	 * @param username a username
	 * @return the detail of the given user
	 * @throws UsernameNotFoundException
	 */
	public User loadUserDetails(final String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User NOT Found"));
		return user;
	}

	public Long getUserIdByUsername(String username) {
		User user = userRepository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
		return user.getId();
	}

	/**
	 * Update or create a user.
	 *
	 * @param user a user to save
	 * @return the updated user
	 */
	public User update(final User user) {

		return userRepository.save(user);
	}

	public boolean existsByUsername(String username) {
		return userRepository.existsByUsername(username);

	}

	public void save(User user) {
		userRepository.save(user);

	}

	public void addUserToRole(Long userId, Long roleId) {
		User user = userRepository.findById(userId)
				.orElseThrow(() -> new UsernameNotFoundException("User not found with ID: " + userId));

		// Créez un objet Role avec l'ID spécifié
		Role role = new Role();
		role.setId(roleId.intValue()); // Convertissez Long en Integer

		// Ajoutez le rôle à l'utilisateur
		Set<Role> roles = user.getRoles();
		roles.add(role);
		user.setRoles(roles);

		// Enregistrez les modifications dans la base de données
		userRepository.save(user);
	}

}
