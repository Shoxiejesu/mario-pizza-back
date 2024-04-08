package fr.yanni.mariopizza.core.dto.mapper;

import fr.yanni.mariopizza.core.domain.Users;
import fr.yanni.mariopizza.core.dto.UsersDTO;

public class UsersMapper {

	/**
	 *
	 * @param pizza a Pizza
	 * @return the Pizza turned into its sibling PizzaDTO
	 */
	public static UsersDTO usersToDto(final Users users) {
		UsersDTO dto = null;

		if (users != null) {
			dto = new UsersDTO();

			dto.setId(users.getId());
			dto.setUsername(users.getUsername());
			dto.setPassword(users.getPassword());
			dto.setFirstname(users.getFirstname());
			dto.setLastname(users.getLastname());
			dto.setAddress(users.getAddress());

		}

		return dto;
	}

	/**
	 * Create a Pokemon from a PokemonDTO.
	 *
	 * @param dto the dto used as a source
	 * @return a Pokemon filled with datas from dto
	 */
	public static Users dtoToEntity(UsersDTO dto) {
		Users entity = null;

		if (dto != null) {
			entity = new Users();
			entity.setId(dto.getId());
			entity.setUsername(dto.getUsername());
			entity.setPassword(dto.getPassword());
			entity.setFirstname(dto.getFirstname());
			entity.setLastname(dto.getLastname());
			entity.setAddress(dto.getAddress());

		}

		return entity;
	}

	public Boolean booleanMethod() {
		return null;
	}

}
