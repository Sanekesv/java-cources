package com.company.day3.lab01;

import java.io.Serializable;

public class Account implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}