package com.oscar.siantar.square.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "transactions", schema = "public", catalog = "siantar_square_db")
public class TransactionsEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "user_id")
    private Integer userId;
    @Basic
    @Column(name = "invoice_number")
    private String invoiceNumber;
    @Basic
    @Column(name = "total_price")
    private BigDecimal totalPrice;
    @Basic
    @Column(name = "status")
    private String status;
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
