package com.company.day1.lab05;

/**
 * Created by Александр on 06.04.2015.
 */
public class RealSubject implements Subject {
    @Override
    public int longMethod() throws InterruptedException {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            count++;
        }
        return count;
    }
}
