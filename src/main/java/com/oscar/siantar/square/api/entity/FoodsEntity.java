package com.oscar.siantar.square.api.entity;

import com.oscar.siantar.square.api.dto.ImagesDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "foods", schema = "public", catalog = "siantar_square_db")
public class FoodsEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "images")
    private ImagesDTO images;
    @Basic
    @Column(name = "price")
    private BigDecimal price;
    @Basic
    @Column(name = "availability")
    private Boolean availability;
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
