package com.damore.tutorial.generics.test1;

import java.util.ArrayList;
import java.util.List;

class Wrapper<T extends Comparable <T> > implements Comparable <Wrapper<T>> { 

	private final T theObject; 
	
	public Wrapper(T t) { theObject = t; } 
	
	public T get() { return theObject; } 
	
	public int compareTo(Wrapper <T> other) { 
		return theObject.compareTo(other.theObject); 
	} 
	
	public static void main(String[] args) {
//		Wrapper <? extends Number> w1 = new Wrapper<Long>(new Long(1));
		List<Wrapper <? extends Number>> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			long a = Math.round(Math.random()*100)+ 1;
			Wrapper <? extends Number> w = new Wrapper<Long>(new Long(a));
			list.add(w);
		}
	}

}
