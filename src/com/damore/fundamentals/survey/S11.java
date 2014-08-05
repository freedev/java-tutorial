/**
 * 
 */
package com.damore.fundamentals.survey;

/**
 * @author freedev
 * 
 */
class S11 {
	public static void main(String[] args) {
		new S22();
	}

	S11() {
		System.out.print("S1");
	}
}

class S22 extends S11 {
	S22() {
		System.out.print("S2");
	}
}
