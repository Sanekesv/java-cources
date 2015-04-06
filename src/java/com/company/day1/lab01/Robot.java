package com.company.day1.lab01;

import com.company.day1.lab01.RunThisMethod;

/**
 * Created by Александр on 06.04.2015.
 */
public class Robot {

    @Override
    public String toString () {
        return "I am robot";
    }

    @RunThisMethod(repeat = 10)
    public void clean(){
        System.out.println("cleaning!");
    }
}
