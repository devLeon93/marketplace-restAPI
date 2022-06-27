package com.marketplace.marketplace.controllers;


import com.marketplace.marketplace.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {



    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

  /*  @GetMapping
    public List<UserDto> getUsers() {
        return userService.getAllUsers();
    }*/

   /* private final UserRepo userRepository;
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
    }*/

}









