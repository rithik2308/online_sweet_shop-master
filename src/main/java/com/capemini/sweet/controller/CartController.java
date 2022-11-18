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

import com.capemini.sweet.entity.Cart;
import com.capemini.sweet.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/welcome")
    public @ResponseBody String HelloWorld(){
        return "Hello world";
    }

    @PostMapping("/add")
    public @ResponseBody String AddUser(@RequestBody Cart cart){
        cartService.Addcart(cart);
        return "cartitem Added";
    }

    @GetMapping("/get/{id}")
    public @ResponseBody Cart GetSweet(@PathVariable long id){
        return cartService.GetCart(id);
    }

    @GetMapping("/getAll")
    public @ResponseBody List<Cart> GetAllSweet(){
        return cartService.GetAllCart();
    }

    @GetMapping("/del/{id}")
    public @ResponseBody String DelSweet(@PathVariable long id){
        return cartService.DeleteCart(id);
    }

    @PutMapping("/update/{id}")
    public @ResponseBody String updateCart(@PathVariable long id, @RequestBody Cart cart){
        return cartService.UpdateCart(id, cart);
    }
}
