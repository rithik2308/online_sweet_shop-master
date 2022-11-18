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

import com.capemini.sweet.entity.User;
import com.capemini.sweet.service.UserService;

@RestController
@RequestMapping("/home")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/welcome")
    public @ResponseBody String HelloWorld(){
        return "Hello world";
    }
    @GetMapping("/user/{userId}")
    public @ResponseBody String ShowUser(@PathVariable String userId){
        return "Welcome "+userId;
    }

    @PostMapping("/user/add")
    public @ResponseBody String AddUser(@RequestBody User user){
        userService.AddUser(user);
        return "User Added";
    }

    @GetMapping("/user/get/{id}")
    public @ResponseBody User GetUser(@PathVariable long id){
        return userService.GetUser(id);
    }

    @GetMapping("/user/getAll")
    public @ResponseBody List<User> GetAllUser(){
        return userService.GetAllUser();
    }
    @GetMapping("/user/del/{id}")
    public @ResponseBody String DelUser(@PathVariable long id){
        return userService.DeleteUser(id);
    }

    @PutMapping("/user/update/{id}")
    public @ResponseBody String UpdateUser(@PathVariable long id, @RequestBody User user){
        return userService.UpdateUser(id, user);
    }

}
