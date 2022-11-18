package com.capemini.sweet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tablecart")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Cart {
    @Id
    @Column(name="CartId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cartId;
    @Column(name="UserId")
    private String userid;
    @Column(name="SweetId")
    private String sweetid;
    @Column(name="SweetName")
    private String sweetname;
    @Column(name="Price")
    private int price;
    
}
