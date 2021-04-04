package com.oscar.siantar.square.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class LoginDTO implements Serializable {
    private String usernameOrEmailOrPhoneNumber;
    private String password;
}
