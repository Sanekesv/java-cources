package com.company.day1.lab05;

/**
 * Created by Александр on 06.04.2015.
 */
class BenchmarkProxySubject implements Subject {

    private RealSubject subject;
//    private long startTime;

    public BenchmarkProxySubject() {
        subject = new RealSubject();
    }

    @Override
    public int longMethod() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        int count = subject.longMethod();
        System.out.println("Time: "+ (System.currentTimeMillis()-startTime));
        return count;
    }
}
