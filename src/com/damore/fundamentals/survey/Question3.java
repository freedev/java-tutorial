/**
 * 
 */
package com.damore.fundamentals.survey;

/**
 * @author freedev
 * 
 */
public class Question3 {
	String s = "Outer";

	public static void main(String[] args) {
		Boolean b = new Boolean("TRUE");

		if (b) {
			for (Integer i = 0; i < 10; ++i) {
				System.out.println(i);
			}
		}

		S2 s2 = new S2();
		s2.display();
	}
}

class S1 {
	private String s = "S1";
	
	public S1() {
		s = "Constructor";
		display();
	}

	void display() {
		System.out.println(s);
	}
}

class S2 extends S1 {
	private String s = "S2";

}