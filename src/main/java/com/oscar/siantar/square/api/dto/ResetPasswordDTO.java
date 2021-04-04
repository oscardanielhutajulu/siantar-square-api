package com.oscar.siantar.square.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class ResetPasswordDTO implements Serializable {
    private String currentPassword;
    private String newPassword;
    private String verifyNewPassword;
}
