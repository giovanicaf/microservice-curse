package com.github.giovanicaf.hroauth.services;

import com.github.giovanicaf.hroauth.dto.UserDto;
import com.github.giovanicaf.hroauth.feignclients.UserFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserFeignClient userFeignClient;

    public UserDto findByEmail(String email){
        UserDto dto = userFeignClient.findByEmail(email).getBody();
        if (dto == null){
            logger.error("Email not found: " + email);
            throw new IllegalArgumentException("Email not found!");
        }
        logger.info("Email found: " + email);
        return dto;
    }

}
