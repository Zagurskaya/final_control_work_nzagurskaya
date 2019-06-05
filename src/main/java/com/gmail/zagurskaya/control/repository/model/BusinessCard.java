package com.gmail.zagurskaya.control.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "businesscard")
public class BusinessCard {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "title")
        private Long title;

        @Column(name = "fullName")
        private String fullName;

        @Column(name = "workingTelephone")
        private String workingTelephone;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id", nullable = false)
        private User user;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
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

        public User getUser() {
                return user;
        }

        public void setUser(User user) {
                this.user = user;
        }

        @Override
        public String toString() {
                return "BusinessCard{" +
                        "id=" + id +
                        ", title=" + title +
                        ", fullName='" + fullName + '\'' +
                        ", workingTelephone='" + workingTelephone + '\'' +
                        ", user=" + user.getId() +
                        '}';
        }
}
