package com.gmail.zagurskaya.control.repository.impl;

import com.gmail.zagurskaya.control.repository.BusinessCardRepository;
import com.gmail.zagurskaya.control.repository.model.BusinessCard;
import org.springframework.stereotype.Repository;

@Repository
public class BusinessCardRepositoryImpl extends  GenericRepositoryImpl<Long, BusinessCard> implements BusinessCardRepository {


}
