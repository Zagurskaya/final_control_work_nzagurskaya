package com.gmail.zagurskaya.control.service;

import java.util.List;

import com.gmail.zagurskaya.control.service.model.BusinessCardDTO;

public interface BusinessCardService {

    void add(BusinessCardDTO cardDTO);

    List<BusinessCardDTO> getBusinessCards();

    void delete(Long id);
}
