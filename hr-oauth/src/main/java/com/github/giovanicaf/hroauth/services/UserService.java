package com.github.giovanicaf.hroauth.services;

import com.github.giovanicaf.hroauth.entities.User;
import com.github.giovanicaf.hroauth.feignclients.UserFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserFeignClient userFeignClient;

    public User findByEmail(String email){
        User dto = userFeignClient.findByEmail(email).getBody();
        if (dto == null){
            logger.error("Email not found: " + email);
            throw new IllegalArgumentException("Email not found!");
        }
        logger.info("Email found: " + email);
        return dto;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User dto = userFeignClient.findByEmail(email).getBody();
        if (dto == null){
            logger.error("Email not found: " + email);
            throw new UsernameNotFoundException("Email not found!");
        }
        logger.info("Email found: " + email);
        return dto;
    }
}
