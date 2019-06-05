package com.gmail.zagurskaya.control.repository;

import com.gmail.zagurskaya.control.repository.model.User;

public interface UserRepository extends GenericRepository<Long, User> {

    User loadUserByUsername(String name);

}
