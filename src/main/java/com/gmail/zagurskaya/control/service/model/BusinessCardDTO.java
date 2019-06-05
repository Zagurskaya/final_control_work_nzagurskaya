package com.gmail.zagurskaya.control.service.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class BusinessCardDTO {

    @NotNull
    private Long id;

    @NotNull
    private Long title;

    @NotNull
    private String fullName;

    @NotNull
    @Size(min = 1, max = 20)
    private String workingTelephone;

    @NotNull
    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTitle() {
        return title;
    }

    public void setTitle(Long title) {
        this.title = title;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getWorkingTelephone() {
        return workingTelephone;
    }

    public void setWorkingTelephone(String workingTelephone) {
        this.workingTelephone = workingTelephone;
    }

    @Override
    public String toString() {
        return "BusinessCardDTO{" +
                "id=" + id +
                ", title=" + title +
                ", fullName='" + fullName + '\'' +
                ", workingTelephone='" + workingTelephone + '\'' +
                ", user=" + userId +
                '}';
    }
}
