package com.marketplace.marketplace.security;

import com.marketplace.marketplace.models.Users;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class UserInfo implements UserDetails {

    private final Users user;

    public UserInfo(Users users) {
        this.user = users;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;  // collections roles for user
    }

    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public String getUsername() {
        return this.user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public Users getUser(){
        return this.user;
    }
}
