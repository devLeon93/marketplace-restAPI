package com.marketplace.marketplace.services;


import com.marketplace.marketplace.models.Users;
import com.marketplace.marketplace.repositories.UserRepo;
import com.marketplace.marketplace.security.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserInfoService implements UserDetailsService {

    private final UserRepo userRepo;

    @Autowired
    public UserInfoService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }




    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Users> user = userRepo.findByUsername(username);

        if(!user.isPresent()) {
            throw new UsernameNotFoundException("User not found!!");

        } else {
            return new UserInfo(user.get());
        }
    }
}

