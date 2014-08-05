package com.damore.tutorial.generics.test4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSetCollection2 {

    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        for(int i = 0; i < 100000; i ++) {
        	int n = (int)Math.floor(Math.random() * 10);
        	list.add(n);
        }
        
        long start = Calendar.getInstance().getTimeInMillis();
        // Collection<Integer> set = new TreeSet<>(list);
        Collection<Integer> set = new HashSet<>(list);
        // Collection<Integer> set = new LinkedHashSet<>(list);
        for(Iterator<Integer> iterator = set.iterator(); iterator.hasNext();) {
        	System.out.println(iterator.next());
        }
    	System.out.println(set);
        long end = Calendar.getInstance().getTimeInMillis();
        System.out.println("take "+ (end - start) + " millis");
    }
}
