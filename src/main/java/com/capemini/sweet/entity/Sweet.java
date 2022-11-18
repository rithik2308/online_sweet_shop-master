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
@Table(name="tablesweet")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Sweet {
    @Id
    @Column(name="SweetId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sweetId;
    @Column(name="SweetName")
    private String sweetname;
    @Column(name="SweetPrice")
    private double sweetprice;
    @Column(name="SweetStock")
    private int sweetstock;
}
