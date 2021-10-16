package com.github.giovanicaf.hruser.service;

import com.github.giovanicaf.hruser.dto.RoleDto;
import com.github.giovanicaf.hruser.dto.UserDto;
import com.github.giovanicaf.hruser.entities.Role;
import com.github.giovanicaf.hruser.entities.User;
import com.github.giovanicaf.hruser.mappers.RoleMapper;
import com.github.giovanicaf.hruser.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RoleService {

	private final RoleMapper roleMapper;

	public List<RoleDto> findByUser(List<Role> role) {
		return roleMapper.toListRoleDto(role);
	}

	public RoleDto findByUser(Role role) {
		return roleMapper.toRoleDto(role);
	}

}
