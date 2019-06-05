package com.gmail.zagurskaya.control.repository.impl;

import com.gmail.zagurskaya.control.repository.UserRepository;
import com.gmail.zagurskaya.control.repository.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;

@Repository
public class UserRepositoryImpl extends  GenericRepositoryImpl<Long, User> implements UserRepository{
    @Override
    public User loadUserByUsername(String name) {
        String query = "select u from  User u WHERE u.username like :name";
        Query q = entityManager.createQuery(query).setParameter( "name", name);
        return (User) q.getSingleResult();
    }
}
