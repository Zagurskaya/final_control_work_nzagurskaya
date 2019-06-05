package com.gmail.zagurskaya.control.service.converter.impl;

import com.gmail.zagurskaya.control.repository.UserRepository;
import com.gmail.zagurskaya.control.repository.model.BusinessCard;
import com.gmail.zagurskaya.control.service.converter.BusinessCardConverter;
import com.gmail.zagurskaya.control.service.model.BusinessCardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessCardConverterImpl implements BusinessCardConverter {

    @Autowired
    private UserRepository userRepository;

    @Override
    public BusinessCardDTO toDTO(BusinessCard card) {
        BusinessCardDTO cardDTO = new BusinessCardDTO();
        cardDTO.setId(card.getId());
        cardDTO.setTitle(card.getTitle());
        cardDTO.setFullName(card.getFullName());
        cardDTO.setWorkingTelephone(card.getWorkingTelephone());
        cardDTO.setUserId(card.getUser().getId());

        return cardDTO;
    }

    @Override
    public BusinessCard toEntity(BusinessCardDTO cardDTO) {
        BusinessCard card = new BusinessCard();
        card.setTitle(cardDTO.getTitle());
        card.setFullName(cardDTO.getFullName());
        card.setWorkingTelephone(cardDTO.getWorkingTelephone());
        card.setUser(userRepository.findById(cardDTO.getUserId()));
        return card;
    }
}
