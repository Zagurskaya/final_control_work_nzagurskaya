package com.gmail.zagurskaya.control.service.converter;

import com.gmail.zagurskaya.control.repository.model.User;
import com.gmail.zagurskaya.control.service.model.UserDTO;

public interface UserConverter {

    UserDTO toDTO(User user);
}
