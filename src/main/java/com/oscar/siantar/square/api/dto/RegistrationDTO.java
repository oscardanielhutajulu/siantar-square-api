package com.oscar.siantar.square.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class RegistrationDTO implements Serializable {
    private String fullName;
    private String image;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String fullAddress;
}
