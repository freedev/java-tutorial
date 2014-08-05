/**
 * 
 */
package com.damore.tutorial.generics;

import java.util.List;
import java.util.ArrayList;

/**
 * @author freedev
 *
 */
public class TestInterface {
	
	/**
	 * 
	 * @author freedev
	 *
	 * @param <T>
	 */
	
	interface MyInterface<T> {
		void execute(T t);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();

		list.add("Prova");
		list.add("Riprova");
		list.add("Riprova 2");
		
		executer(list, new MyInterface<String>() {
			public void execute(String s) {
				System.out.println(s);
			}
		});
		
	}
	
	/**
	 * 
	 * @param list<T>
	 * @param my<T>
	 */
	public static <T> void executer(List<T> list, MyInterface<T> my) {
		for (T e : list) {
			my.execute(e);
		}
	}
	

}
