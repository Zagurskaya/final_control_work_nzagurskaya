package com.gmail.zagurskaya.control.service.converter;


import com.gmail.zagurskaya.control.repository.model.BusinessCard;
import com.gmail.zagurskaya.control.service.model.BusinessCardDTO;

public interface BusinessCardConverter {

    BusinessCardDTO toDTO(BusinessCard businessCard);

    BusinessCard toEntity(BusinessCardDTO cardDTO);

}
