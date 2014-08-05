package com.damore.tutorial.generics.test3;

public class AlgorithmCounter {
    public static <T> int counter(java.util.List<T> list, UnaryPredicate<T> predicate) {
        int counter = 0;
        for (T t : list) {
            if (predicate.test(t))
                counter ++;
        }
        return counter;
    } 

    public static <T> int remover(java.util.List<T> list, UnaryPredicate<T> predicate) {
        for (java.util.Iterator<T> iterator = list.iterator(); iterator.hasNext(); ) {
        	if (predicate.test(iterator.next()))
        		iterator.remove();
        }
        return list.size();
    } 

}
