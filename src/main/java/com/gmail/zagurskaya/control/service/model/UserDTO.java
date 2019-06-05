package com.gmail.zagurskaya.control.service.model;

import com.gmail.zagurskaya.control.repository.enums.RoleEnum;
import com.gmail.zagurskaya.control.repository.model.BusinessCard;

import javax.validation.constraints.NotNull;
import java.util.List;

public class UserDTO {
    @NotNull
    private Long id;
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private String role;
    @NotNull
    private List<BusinessCardDTO> businessCards;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<BusinessCardDTO> getBusinessCards() {
        return businessCards;
    }

    public void setBusinessCards(List<BusinessCardDTO> businessCards) {
        this.businessCards = businessCards;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
