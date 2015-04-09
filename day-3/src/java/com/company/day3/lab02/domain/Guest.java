package com.company.day3.lab02.domain;

import com.company.day3.lab02.annotation.Table;

@Table("guest")
public class Guest extends BaseEntity {
    private String login;
    private String city;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
