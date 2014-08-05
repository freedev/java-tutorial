/**
 * 
 */
package com.damore.fundamentals.survey;

/**
 * @author freedev
 * 
 */
class Outer {
	String s = "Outer";

	public static void main(String[] args) {
		new Outer().new Inner();
	}

	Outer() {
		System.out.print(s);
	}

	class Inner {
		String s = "Inner";

		Inner() {
			System.out.print(s);
		}
	}
}