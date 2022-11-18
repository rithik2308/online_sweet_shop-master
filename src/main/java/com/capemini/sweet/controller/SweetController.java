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

import com.capemini.sweet.entity.Sweet;
import com.capemini.sweet.service.SweetService;

@RestController
@RequestMapping("/sweet")
public class SweetController {
    @Autowired
    private SweetService sweetService;

    @GetMapping("/welcome")
    public @ResponseBody String HelloWorld(){
        return "Hello world";
    }

    @PostMapping("/add")
    public @ResponseBody String AddUser(@RequestBody Sweet sweet){
        sweetService.AddSweet(sweet);
        return "Sweet Added";
    }

    @GetMapping("/get/{id}")
    public @ResponseBody Sweet GetSweet(@PathVariable long id){
        return sweetService.GetSweet(id);
    }

    @GetMapping("/getAll")
    public @ResponseBody List<Sweet> GetAllSweet(){
        return sweetService.GetAllSweet();
    }

    @GetMapping("/del/{id}")
    public @ResponseBody String DelSweet(@PathVariable long id){
        return sweetService.DeleteSweet(id);
    }

    @PutMapping("update/{id}")
    public @ResponseBody String UpdateSweet(@PathVariable long id, @RequestBody Sweet sweet){
        return sweetService.UpdateSweet(id, sweet);
    }
}
