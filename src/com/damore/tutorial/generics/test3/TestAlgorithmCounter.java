package com.damore.tutorial.generics.test3;

public class TestAlgorithmCounter {
    public static void main(String[] args) {
        java.util.List<Long> list = new java.util.ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            long n = Math.round(Math.random() * 10000) + 1;
            list.add(n);
        }
        int count = AlgorithmCounter.counter(list, new OddPredicate() );
        System.out.println(count);
        int removed = AlgorithmCounter.remover(list, new OddPredicate() );
        System.out.println(removed);
        System.out.println(list.size());
    }
}

