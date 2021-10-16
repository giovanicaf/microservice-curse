package com.github.giovanicaf.hruser.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String roleName;

}
