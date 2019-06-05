package com.gmail.zagurskaya.control.service.impl;

import com.gmail.zagurskaya.control.service.UserService;
import com.gmail.zagurskaya.control.service.model.AppUserPrincipal;
import com.gmail.zagurskaya.control.service.model.UserDTO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AppUserDetailsService implements UserDetailsService {

    private final UserService userService;

    public AppUserDetailsService(UserService userService) {

        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        UserDTO user = userService.loadUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User is not found");
        }
        return new AppUserPrincipal(user);
    }
}


