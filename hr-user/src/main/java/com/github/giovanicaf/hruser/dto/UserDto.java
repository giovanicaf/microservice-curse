package com.github.giovanicaf.hruser.dto;

import com.github.giovanicaf.hruser.entities.Role;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String email;

    private Set<Role> roles = new HashSet<>();
}
