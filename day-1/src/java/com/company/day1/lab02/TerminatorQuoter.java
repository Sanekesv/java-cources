package com.company.day1.lab02;

import com.company.day1.lab01.RunThisMethod;

import java.util.List;

/**
 * Created by Александр on 06.04.2015.
 */
public class TerminatorQuoter implements Quoter {
    List<String> quotes;

    public List<String> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<String> quotes) {
        this.quotes = quotes;
    }

    @Override
    @RunThisMethod(repeat = 4)
    public void sayQuote() {
        System.out.println(quotes);
    }
}