package com.hq2145.hqpc.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.hq2145.hqpc.entity.User} entity
 */
@Data
public class UserDto implements Serializable {
    private Long id;
    private String name;
    private String username;
    private String password;
    private String role;
    private String gender;
    private String address;
    private String phone;
    private String email;
    private String avatar;
    private Boolean enable;

}