package com.gmail.zagurskaya.control.service.impl;

import com.gmail.zagurskaya.control.repository.BusinessCardRepository;
import com.gmail.zagurskaya.control.repository.model.BusinessCard;
import com.gmail.zagurskaya.control.service.BusinessCardService;
import com.gmail.zagurskaya.control.service.converter.BusinessCardConverter;
import com.gmail.zagurskaya.control.service.model.BusinessCardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class BusinessCardServiceImpl implements BusinessCardService {

    private final BusinessCardRepository businessCardRepository;
    private final BusinessCardConverter businessCardConverter;

    @Autowired
    public BusinessCardServiceImpl(BusinessCardRepository businessCardRepository, BusinessCardConverter businessCardConverter) {
        this.businessCardRepository = businessCardRepository;
        this.businessCardConverter = businessCardConverter;
    }

    @Override
    public void add(BusinessCardDTO cardDTO) {
        BusinessCard card = businessCardConverter.toEntity(cardDTO);
        businessCardRepository.persist(card);
    }

    @Override
    public List<BusinessCardDTO> getBusinessCards() {

        List<BusinessCard> cards = businessCardRepository.findAll(0, Integer.MAX_VALUE);
        List<BusinessCardDTO> cardDTOs = cards.stream()
                .map(businessCardConverter::toDTO)
                .collect(Collectors.toList());
        return cardDTOs;
    }

    @Override
    public void delete(Long id) {
        businessCardRepository.remove(businessCardRepository.findById(id));

    }
}
