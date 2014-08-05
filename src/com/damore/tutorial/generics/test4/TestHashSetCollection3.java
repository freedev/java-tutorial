package com.damore.tutorial.generics.test4;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class TestHashSetCollection3 {
    public static void main(String[] args) {
        Collection<String> c = new HashSet<>(Arrays.asList(args));
        Collection<String> c1 = new HashSet<>();
        Collection<String> dups = new HashSet<>();
        System.out.println(c);

        for(String s : args) {
            if (!c1.add(s)) {
                dups.add(s);
            }
        }
        System.out.println(dups);
    }
}
