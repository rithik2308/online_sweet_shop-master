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
@Table(name="tableadmin")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Admin {
    @Id
    @Column(name="AdminId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long AdminId;
    @Column(name="Username")
    private String username;
    @Column(name="password")
    private String password;
    
}