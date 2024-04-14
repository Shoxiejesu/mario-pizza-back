package fr.yanni.mariopizza.core.dto.mapper;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fr.yanni.mariopizza.core.domain.User_roles;
import fr.yanni.mariopizza.core.dto.User_rolesDTO;

public class User_rolesMapper {
	/**
	 *
	 * @param User_roles a User_roles
	 * @return the User_roles turned into its sibling User_rolesDTO
	 */
	public static User_rolesDTO user_rolesToDto(final User_roles user_roles) {
		User_rolesDTO dto = null;

		if (user_roles != null) {
			dto = new User_rolesDTO();
			dto.setRole_id(user_roles.getRole_id());
			dto.setUser_id(user_roles.getUser_id());
		}

		return dto;
	}

	/**
	 * Create a User_roles from a User_rolesDTO.
	 *
	 * @param dto the dto used as a source
	 * @return a User_roles filled with datas from dto
	 */
	public static User_roles dtoToEntity(final User_rolesDTO dto) {
		User_roles entity = null;

		if (dto != null) {
			entity = new User_roles();
			entity.setRole_id(dto.getRole_id());
			entity.setUser_id(dto.getUser_id());
		}

		return entity;
	}

	/**
	 * Example of a boolean method that returns null.
	 *
	 * @return Always returns null (example)
	 */
	public Boolean booleanMethod() {
		return null;
	}

	@Test
	public void testUser_rolesToDto() {
		// Créer une instance de User_roles pour tester
		User_roles user_roles = new User_roles();
		user_roles.setRole_id((short) 1);
		user_roles.setUser_id((short) 101);

		// Appeler la méthode à tester
		User_rolesDTO dto = User_rolesMapper.user_rolesToDto(user_roles);

		// Vérifier si le DTO est correctement créé à partir de l'entité User_roles
		assertNotNull(dto);
		assertEquals(1, dto.getRole_id());
		assertEquals(101, dto.getUser_id().intValue());
	}

	@Test
	public void testDtoToEntity() {
		// Créer une instance de User_rolesDTO pour tester
		User_rolesDTO dto = new User_rolesDTO();
		dto.setRole_id((short) 2);
		dto.setUser_id((short) 202);

		// Appeler la méthode à tester
		User_roles entity = User_rolesMapper.dtoToEntity(dto);

		// Vérifier si l'entité User_roles est correctement créée à partir du DTO
		assertNotNull(entity);
		assertEquals(2, entity.getRole_id());
		assertEquals((short) 202, entity.getUser_id());

	}

	@Test
	public void testUser_rolesToDtoWithNullInput() {
		// Appeler la méthode à tester avec une entrée nulle
		User_rolesDTO dto = User_rolesMapper.user_rolesToDto(null);

		// Vérifier si le résultat est null
		assertNull(dto);
	}

	@Test
	public void testDtoToEntityWithNullInput() {
		// Appeler la méthode à tester avec une entrée nulle
		User_roles entity = User_rolesMapper.dtoToEntity(null);

		// Vérifier si le résultat est null
		assertNull(entity);
	}
}
