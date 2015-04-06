package com.company.day1.lab09;

/**
 * Created by Александр on 06.04.2015.
 */
public class DestroyablePrototype {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void destroy() {
        System.out.println("Finalize object");
    }
}
