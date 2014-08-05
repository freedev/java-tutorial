package com.damore.effective.sample5;

import java.util.Calendar;

public class AvoidAutoboxing {
    public static void main(String[] args) {
        System.out.println("Started");
    	long start = Calendar.getInstance().getTimeInMillis();
        // Long sum = 0L;
        long sum = 0L;
        for(long l = 0; l < Integer.MAX_VALUE ; l++) {
            sum += l;
        }
        long end = Calendar.getInstance().getTimeInMillis();
        System.out.println(end - start);
        System.out.println(sum);
    }
}
