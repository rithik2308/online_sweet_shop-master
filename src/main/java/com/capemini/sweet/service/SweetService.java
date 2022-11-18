package com.capemini.sweet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capemini.sweet.entity.Sweet;
import com.capemini.sweet.repository.SweetRepository;

@Service
public class SweetService {
    @Autowired
    private SweetRepository sweetRepository;
    public void AddSweet(Sweet sweet) {
        sweetRepository.save(sweet);
    }
    public Sweet GetSweet(long id) {
        return sweetRepository.findById(id).get();
    }
    public List<Sweet> GetAllSweet() {
        return sweetRepository.findAll();
    }
    public String DeleteSweet(long id) {
        sweetRepository.deleteById(id);
        return "Sweet deleted successfully";
    }
    public String UpdateSweet(long id, Sweet sweet) {
        
        sweet.setSweetId(id);
        sweetRepository.save(sweet);
        return "Sweet updated successfully";
    }
    
}
