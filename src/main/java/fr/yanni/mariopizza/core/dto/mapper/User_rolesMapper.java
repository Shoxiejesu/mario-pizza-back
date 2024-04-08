package fr.yanni.mariopizza.core.dto.mapper;

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
	 * Create a Pokemon from a PokemonDTO.
	 *
	 * @param dto the dto used as a source
	 * @return a Pokemon filled with datas from dto
	 */
	public static User_roles dtoToEntity(User_rolesDTO dto) {
		User_roles entity = null;

		if (dto != null) {
			entity = new User_roles();
			entity.setRole_id(dto.getRole_id());
			entity.setUser_id(dto.getUser_id());
		}

		return entity;
	}

	public Boolean booleanMethod() {
		return null;
	}
}
