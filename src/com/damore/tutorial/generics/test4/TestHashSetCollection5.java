package com.damore.tutorial.generics.test4;

import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;

public class TestHashSetCollection5 {

    public static void main(String[] args) {
        // Collection<Integer> set = new TreeSet<>(list);
    	Collection<Integer> set = new HashSet<>();
        // Collection<Integer> set = new LinkedHashSet<>(list);
        long start = Calendar.getInstance().getTimeInMillis();

        for(int i = 0; i < 100000000; i ++) {
        	int n = (int)Math.floor(Math.random() * 10);
        	set.add(n);
        }
        
    	System.out.println(set);
        long end = Calendar.getInstance().getTimeInMillis();
        System.out.println("take "+ (end - start) + " millis");
    }
}
