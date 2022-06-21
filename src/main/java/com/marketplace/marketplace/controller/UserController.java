package com.marketplace.marketplace.controller;


import com.marketplace.marketplace.model.Users;
import com.marketplace.marketplace.repository.ProductsRepository;
import com.marketplace.marketplace.repository.UserRepo;
import com.marketplace.marketplace.security.UserInfo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {
    private final UserRepo userRepository;
    @Autowired
    public UserController(UserRepo userRepository) {
        this.userRepository = userRepository;
    }
    @GetMapping("/users")
    public List<Users> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/showUserInfo")
    public String showUserInfo(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserInfo userInfo =  (UserInfo) authentication.getPrincipal();
        System.out.println(userInfo.getUser());
        return "Ok";
    }

    @PostMapping("/registerUser")
    public String createNewUser(@RequestBody Users user){
        userRepository.save(user);
        return "The user has been successfully registered";
    }

}









