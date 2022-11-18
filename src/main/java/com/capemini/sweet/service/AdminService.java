package com.capemini.sweet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capemini.sweet.entity.Admin;
import com.capemini.sweet.repository.AdminRepository;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public void Addadmin(Admin admin) {
        adminRepository.save(admin);
    }

    public Admin GetAdmin(long id) {
        return adminRepository.findById(id).get();
    }

    public List<Admin> GetAlladmin() {
        return adminRepository.findAll();
    }

    public String Deleteadmin(long id) {
        adminRepository.deleteById(id);
        return "admin deleted successfully";
    }
    public String UpdateAdmin(long id, Admin admin) {
        
        admin.setAdminId(id);
        adminRepository.save(admin);
        return "admin updated successfully";
    }
}
