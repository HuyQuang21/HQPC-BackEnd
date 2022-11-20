package com.hq2145.hqpc.mapper;

import com.hq2145.hqpc.dto.UserDto;
import com.hq2145.hqpc.entity.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User dtoToEntity(UserDto userDto);
    UserDto entityToDTO(User user);
}
