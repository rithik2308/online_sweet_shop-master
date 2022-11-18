package com.capemini.sweet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capemini.sweet.entity.Sweet;

@Repository
public interface SweetRepository extends JpaRepository<Sweet, Long> {
    
}
