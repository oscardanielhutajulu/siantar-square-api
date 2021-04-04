package com.oscar.siantar.square.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "roles", schema = "public", catalog = "siantar_square_db")
public class RolesEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "role")
    private String role;
    @Basic
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Basic
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    @Basic
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
    @Basic
    @Column(name = "created_by")
    private Integer createdBy;
    @Basic
    @Column(name = "updated_by")
    private Integer updatedBy;
    @Basic
    @Column(name = "deleted_by")
    private Integer deletedBy;
}
