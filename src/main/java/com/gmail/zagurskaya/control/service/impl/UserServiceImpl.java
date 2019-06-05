package com.gmail.zagurskaya.control.service.impl;

import com.gmail.zagurskaya.control.repository.UserRepository;
import com.gmail.zagurskaya.control.repository.model.User;
import com.gmail.zagurskaya.control.service.UserService;
import com.gmail.zagurskaya.control.service.converter.UserConverter;
import com.gmail.zagurskaya.control.service.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {


    private final UserConverter userConverter;
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserConverter userConverter, UserRepository userRepository) {
        this.userConverter = userConverter;
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public UserDTO loadUserByUsername(String name) {
        User loaded = userRepository.loadUserByUsername(name);
        UserDTO userDTO = userConverter.toDTO(loaded);
        return userDTO;
    }


}
