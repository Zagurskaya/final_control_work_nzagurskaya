package com.gmail.zagurskaya.control.controller;

import com.gmail.zagurskaya.control.service.BusinessCardService;
import com.gmail.zagurskaya.control.service.model.BusinessCardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {


    private final BusinessCardService businessCardService;

    @Autowired
    public AdminController(BusinessCardService businessCardService) {
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
    @PostMapping("/delete")
    public ResponseEntity saveUser(@RequestBody @Valid BusinessCardDTO cardDTO) {
        businessCardService.delete(cardDTO.getId());
        return new ResponseEntity(HttpStatus.OK);
    }

}
