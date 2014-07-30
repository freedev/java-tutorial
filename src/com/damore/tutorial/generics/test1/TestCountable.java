package com.damore.tutorial.generics.test1;

import java.util.ArrayList;
import java.util.List;

public class TestCountable {
		
	/*
	 * Write a generic method to count the number of elements in a collection that have 
	 * a specific property (for example, odd integers, prime numbers, palindromes).
	 */
	
	public class OddCountable implements Countable<Integer> {
		public boolean isCountable(Integer t) {
			return (t % 2) > 0;
		}
	}
	
	
	public static <T> int countElements(java.util.List<T> list, Countable<T> test) {
		int counter = 0;
		for (T t : list) {
			if (test.isCountable(t)) {
				counter ++;
			}
		}
		return counter;
	}

	public static int countElementsWildcard(java.util.List<? extends Number>  list) {
		int counter = 0;
		for (Number t : list) {
			if ((t instanceof Integer) && ((Integer)t % 2) > 0) {
				counter ++;
			} else if ((t instanceof Long) && ((Long)t % 2) > 0) {
				counter ++;
			} else if ((t instanceof Double) && ((Double)t % 2) > 0) {
				counter ++;
			} else if ((t instanceof Float) && ((Float)t % 2) > 0) {
				counter ++;
			}
		}
		return counter;
	}


	public static void main(String[] args) {
		
		TestCountable t = new TestCountable();		
		OddCountable oc = t.new OddCountable();
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			int a = (int) Math.floor( Math.random() * 1000 ) + 1;
			list.add(a);
		}
		
		int counter = TestCountable.countElements(list, oc);
		
		System.out.println(counter);

	}

}
