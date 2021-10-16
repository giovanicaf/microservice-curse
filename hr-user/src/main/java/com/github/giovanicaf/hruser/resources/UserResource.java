package com.github.giovanicaf.hruser.resources;

import com.github.giovanicaf.hruser.dto.UserDto;
import com.github.giovanicaf.hruser.repositories.UserRepository;
import com.github.giovanicaf.hruser.service.UserService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserResource {

    public final UserRepository repository;
    public final UserService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDto> findById(@PathVariable Long id){

        UserDto dto = service.findByUser( repository.findById(id).get() );
        return ResponseEntity.ok( dto );
    }

    @GetMapping(value = "/search")
    public ResponseEntity<UserDto> findById(@RequestParam String email){

        UserDto dto = service.findByUser( repository.findByEmail(email) );
        return ResponseEntity.ok( dto );
    }
}