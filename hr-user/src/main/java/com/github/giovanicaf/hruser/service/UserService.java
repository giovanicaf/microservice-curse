package com.github.giovanicaf.hruser.service;

import com.github.giovanicaf.hruser.dto.UserDto;
import com.github.giovanicaf.hruser.entities.User;
import com.github.giovanicaf.hruser.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

	private final UserMapper userMapper;

	public List<UserDto> findByUser(List<User> user) {
		return userMapper.toListUserDto(user);
	}

	public UserDto findByUser(User user) {
		return userMapper.toUserDto(user);
	}

}
