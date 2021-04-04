package com.oscar.siantar.square.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "users", schema = "public", catalog = "siantar_square_db")
public class UsersEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "full_name")
    private String fullName;
    @Basic
    @Column(name = "image")
    private String image;
    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "previous_password1")
    private String previousPassword1;
    @Basic
    @Column(name = "previous_password2")
    private String previousPassword2;
    @Basic
    @Column(name = "previous_password3")
    private String previousPassword3;
    @Basic
    @Column(name = "previous_password4")
    private String previousPassword4;
    @Basic
    @Column(name = "previous_password5")
    private String previousPassword5;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "phone_number")
    private String phoneNumber;
    @Basic
    @Column(name = "full_address")
    private String fullAddress;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "otp")
    private String otp;
    @Basic
    @Column(name = "otp_expire_time")
    private LocalDateTime otpExpireTime;
    @Basic
    @Column(name = "fcm_token")
    private String fcmToken;
    @Basic
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Basic
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    @Basic
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}
