package com.company.day3.lab02;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ClientServerTest {

    @Test
    @org.junit.Ignore
    public void test(){
        AnnotationConfigApplicationContext contextClient = new AnnotationConfigApplicationContext(ClientAppConfig.class);
        Greeter obj = contextClient.getBean(Greeter.class);
        System.out.println(obj.greet());
    }
}