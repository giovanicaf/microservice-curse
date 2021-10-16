package com.github.giovanicaf.hruser.mappers;

import com.github.giovanicaf.hruser.dto.UserDto;
import com.github.giovanicaf.hruser.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "roles", target = "roles")

    UserDto toUserDto(User user);
    List<UserDto> toListUserDto(List<User> user);


}