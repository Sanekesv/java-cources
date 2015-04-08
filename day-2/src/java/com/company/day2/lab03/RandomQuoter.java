package com.company.day2.lab03;

import java.util.Random;

public class RandomQuoter {
    private String num;

    public RandomQuoter() {
        Random random = new Random();
        num = Integer.toHexString(random.nextInt());
    }


    public String getRandomQuote() {
        return num;
    }
}