package com.gmail.zagurskaya.control.service.converter.impl;

import com.gmail.zagurskaya.control.repository.model.User;
import com.gmail.zagurskaya.control.service.converter.UserConverter;
import com.gmail.zagurskaya.control.service.model.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserConverterImpl implements UserConverter {

    @Override
    public UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();
        return userDTO;
    }
}
