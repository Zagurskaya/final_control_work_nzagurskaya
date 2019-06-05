package com.gmail.zagurskaya.control.controller;

import com.gmail.zagurskaya.control.service.BusinessCardService;
import com.gmail.zagurskaya.control.service.model.BusinessCardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustemerController {


    private final BusinessCardService businessCardService;

    @Autowired
    public CustemerController(BusinessCardService businessCardService) {
        this.businessCardService = businessCardService;
    }

    @GetMapping(
            value = "/get",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    public ResponseEntity<List<BusinessCardDTO>> getBusinessCard() {
        List<BusinessCardDTO> cardDTOS = businessCardService.getBusinessCards();
        return new ResponseEntity<>(cardDTOS, HttpStatus.OK);
    }


}
