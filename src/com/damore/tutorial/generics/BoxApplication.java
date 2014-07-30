/**
 * 
 */
package com.damore.tutorial.generics;

/**
 * @author freedev
 *
 */
public class BoxApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> b0 = new Box<>("");
//		Box<Number> b1 = new Box<>(new Integer(0));
//		Box<Number> b3 = new Box<>(new String("ciao"));
		Box<Integer> b4 = new Box("1212");
		Box<Integer> b5 = new Box<>(new Integer(12));

		Integer i = b4.get();
		System.out.print(i);
		
	}

}
