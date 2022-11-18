package com.capemini.sweet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capemini.sweet.entity.User;
import com.capemini.sweet.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void AddUser(User user) {
        userRepository.save(user);
    }

    public User GetUser(long id) {
        return userRepository.findById(id).get();
    }

    public List<User> GetAllUser() {
        return userRepository.findAll();
    }

    public String DeleteUser(long id) {
        userRepository.deleteById(id);
        return "user deleted successfully";
    }
    public String UpdateUser(long id, User user) {
        
        user.setUserId(id);
        userRepository.save(user);
        return "User updated successfully";
    }
}
