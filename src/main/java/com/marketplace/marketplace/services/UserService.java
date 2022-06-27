package com.marketplace.marketplace.services;


import com.marketplace.marketplace.models.Users;
import com.marketplace.marketplace.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{


    private final UserRepo userRepository;


    @Autowired
    public UserService(UserRepo userRepository) {
        this.userRepository = userRepository;
    }


   /* public List<UserDto> getAllUsers(){
        List<Users> userList = userRepository.findAll();
        List<UserDto> udt = new ArrayList<>();
        for(Users us : userList){
            udt.add(UserMapper.mapUser(us));
        }
        return udt;
    }*/


    @Override
    public Users getUser(Long id) {
        return userRepository.findById(id).orElseThrow(()->
                new IllegalArgumentException(
                        "user with id " + id + "could not be find"));
    }
}
