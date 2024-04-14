package fr.yanni.mariopizza.core.dto.mapper;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import fr.yanni.mariopizza.core.domain.Users;
import fr.yanni.mariopizza.core.dto.UsersDTO;

public class UsersMapper {

	private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	public static UsersDTO usersToDto(final Users users) {
		UsersDTO dto = null;

		if (users != null) {
			dto = new UsersDTO();

			dto.setId(users.getId());
			dto.setUsername(users.getUsername());
			dto.setPassword(null);
			dto.setFirstname(users.getFirstname());
			dto.setLastname(users.getLastname());
			dto.setAddress(users.getAddress());
		}

		return dto;
	}

	public static Users dtoToEntity(UsersDTO dto) {
		Users entity = null;

		if (dto != null && allInfoFilled(dto)) {
			entity = new Users();
			entity.setId(dto.getId());
			entity.setUsername(dto.getUsername());
			entity.setPassword(hashPassword(dto.getPassword()));
			entity.setFirstname(dto.getFirstname());
			entity.setLastname(dto.getLastname());
			entity.setAddress(dto.getAddress());
		}

		return entity;
	}

	private static String hashPassword(String plainPassword) {
		return encoder.encode(plainPassword);
	}

	public static boolean checkPassword(String plainPassword, String hashedPassword) {
		return encoder.matches(plainPassword, hashedPassword);
	}

	private static boolean allInfoFilled(UsersDTO dto) {
		return dto.getUsername() != null && dto.getPassword() != null && dto.getFirstname() != null
				&& dto.getLastname() != null && dto.getAddress() != null;
	}

	@Test
	public void testUsersToDto() {
		// Créer une instance de Users pour tester
		Users users = new Users();
		users.setId((short) 1);
		users.setUsername("john_doe");
		users.setPassword("password");
		users.setFirstname("John");
		users.setLastname("Doe");
		users.setAddress("123 Main St");

		// Appeler la méthode à tester
		UsersDTO dto = UsersMapper.usersToDto(users);

		// Vérifier si le DTO est correctement créé à partir de l'entité Users
		assertNotNull(dto);
		assertEquals((short) 1, dto.getId());
		assertEquals("john_doe", dto.getUsername());
		assertNull(dto.getPassword());
		assertEquals("John", dto.getFirstname());
		assertEquals("Doe", dto.getLastname());
		assertEquals("123 Main St", dto.getAddress());
	}

	@Test
	public void testDtoToEntity() {
		// Créer une instance de UsersDTO pour tester
		UsersDTO dto = new UsersDTO();
		dto.setId((short) 2);
		dto.setUsername("jane_smith");
		dto.setPassword("password");
		dto.setFirstname("Jane");
		dto.setLastname("Smith");
		dto.setAddress("456 Elm St");

		// Appeler la méthode à tester
		Users entity = UsersMapper.dtoToEntity(dto);

		// Vérifier si l'entité Users est correctement créée à partir du DTO
		assertNotNull(entity);
		assertEquals((short) 2, entity.getId());
		assertEquals("jane_smith", entity.getUsername());
		assertEquals("password", entity.getPassword());
		assertEquals("Jane", entity.getFirstname());
		assertEquals("Smith", entity.getLastname());
		assertEquals("456 Elm St", entity.getAddress());
	}

	@Test
	public void testDtoToEntityWithNullInput() {
		// Appeler la méthode à tester avec une entrée nulle
		Users entity = UsersMapper.dtoToEntity(null);

		// Vérifier si le résultat est null
		assertNull(entity);
	}
}
