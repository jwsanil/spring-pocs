package org.example;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LoginMapper{

    LoginMapper LOGIN_MAPPER  = Mappers.getMapper(LoginMapper.class);

    LoginEntity loginDtoToLoginEntity(LoginDto loginDto);

    LoginDto loginEntityToLoginDto(LoginEntity loginEntity);

}
