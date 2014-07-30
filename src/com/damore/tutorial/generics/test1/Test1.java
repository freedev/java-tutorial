package com.damore.tutorial.generics.test1;

public class Test1 {
	
	public class OddCountable<T> implements Countable {
		public boolean isCountable() {
			return false;
		}
	}
	
	/*
	 * Write a generic method to count the number of elements in a collection that have 
	 * a specific property (for example, odd integers, prime numbers, palindromes).
	 */
	
	public <T> int countElements(java.util.List<T> list) {
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
