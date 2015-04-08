package com.company.day1.lab09;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Александр on 06.04.2015.
 */
public class BenFactoryPostProcessorTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context09.xml");
        DestroyablePrototype bean = context.getBean(DestroyablePrototype.class);
    }
}
