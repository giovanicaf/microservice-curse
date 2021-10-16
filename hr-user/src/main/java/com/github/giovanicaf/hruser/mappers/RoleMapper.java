package com.github.giovanicaf.hruser.mappers;

import com.github.giovanicaf.hruser.dto.RoleDto;
import com.github.giovanicaf.hruser.entities.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {
  
    @Mapping(source = "id", target = "id")
    @Mapping(source = "roleName", target = "roleName")

    RoleDto toRoleDto(Role role);
    List<RoleDto> toListRoleDto(List<Role> role);


}