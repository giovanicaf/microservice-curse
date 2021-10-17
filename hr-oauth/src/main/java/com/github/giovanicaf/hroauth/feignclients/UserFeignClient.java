package com.github.giovanicaf.hroauth.feignclients;

import com.github.giovanicaf.hroauth.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "hr-user", path = "/users")
@Component
public interface UserFeignClient {

    @GetMapping(value = "/search")
    ResponseEntity<UserDto> findByEmail(@RequestParam String email);
}
