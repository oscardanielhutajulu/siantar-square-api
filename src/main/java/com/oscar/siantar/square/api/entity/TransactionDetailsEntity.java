package com.oscar.siantar.square.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(name = "transaction_details", schema = "public", catalog = "siantar_square_db")
public class TransactionDetailsEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "transaction_id")
    private Integer transactionId;
    @Basic
    @Column(name = "food_or_beverage")
    private Integer foodOrBeverage;
    @Basic
    @Column(name = "amount")
    private Integer amount;
}
