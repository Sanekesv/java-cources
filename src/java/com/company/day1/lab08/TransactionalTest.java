package com.company.day1.lab08;

import com.company.day1.lab05.Subject;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Александр on 06.04.2015.
 */
public class TransactionalTest {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context07.xml");
        Subject subject = context.getBean(Subject.class);
        subject.longMethod();
    }
}
