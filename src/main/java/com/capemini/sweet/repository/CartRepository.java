package com.capemini.sweet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capemini.sweet.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    
}
