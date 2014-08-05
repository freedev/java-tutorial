package com.damore.tutorial.generics.test4;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class TestHashSetCollection4 {
    public static void main(String[] args) {
        Integer[] list1 = { 10, 20, 30, 40 };
        Integer[] list2 = { 11, 20, 30, 41 };
        Collection<Integer> set1 = new HashSet<>(Arrays.asList(list1));
        Collection<Integer> set2 = new HashSet<>(Arrays.asList(list2));
        
        Collection<Integer> rest = new HashSet<>();
        Collection<Integer> diff = new HashSet<>();

        System.out.println(set1);        
        System.out.println(set2);        
        
        rest.addAll(set1);
        rest.retainAll(set2);
        System.out.println(rest);        

        diff.addAll(set1);
        diff.addAll(set2);
        diff.removeAll(rest);
        // 20, 30
        System.out.println(diff);
        // Collection<Integer> rest2 = set1.retainsAll(set2);
    }
}
