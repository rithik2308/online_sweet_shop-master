package com.capemini.sweet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capemini.sweet.entity.Admin;
import com.capemini.sweet.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/welcome")
    public @ResponseBody String HelloWorld(){
        return "Hello world";
    }

    @PostMapping("/add")
    public @ResponseBody String AddUser(@RequestBody Admin admin){
        adminService.Addadmin(admin);
        return "Admin added";
    }

    @GetMapping("/get/{id}")
    public @ResponseBody Admin GetSweet(@PathVariable long id){
        return adminService.GetAdmin(id);
    }

    @GetMapping("/getAll")
    public @ResponseBody List<Admin> GetAllSweet(){
        return adminService.GetAlladmin();
    }

    @GetMapping("/del/{id}")
    public @ResponseBody String DelSweet(@PathVariable long id){
        return adminService.Deleteadmin(id);
    }

    @PutMapping("/update/{id}")
    public @ResponseBody String UpdateAdmin(@PathVariable long id, @RequestBody Admin admin){
        return adminService.UpdateAdmin(id, admin);
    }
}

