package com.gmail.zagurskaya.control.service;

import com.gmail.zagurskaya.control.service.model.UserDTO;


public interface UserService {

    UserDTO loadUserByUsername(String name);

}
