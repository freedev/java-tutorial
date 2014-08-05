package com.damore.tutorial.generics.test4;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSetCollection {

    public static void main(String[] args) {
        Collection<Integer> c1 = new HashSet<>();
        Collection<Integer> c2 = new HashSet<>();
        for(int i = 0; i < 100; i ++) {
            c1.add(i);
        }
        for(int i = 99; i >= 0; i--) {
            c2.add(i);
        }

        System.out.println(c2.equals(c1));
        for (Iterator<Integer> iterator = c2.iterator(); iterator.hasNext(); ) {
            Integer i = iterator.next();
            System.out.println(i);
        }
    }
}
