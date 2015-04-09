package com.company.day3.lab01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServerStarter {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ServerAppConfig.class);
    }
}
