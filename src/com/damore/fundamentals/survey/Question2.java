/**
 * 
 */
package com.damore.fundamentals.survey;

/**
 * @author freedev
 * 
 */
class Question2 {
	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		outer: while (i < j) {
			++i;
			inner: do {
				++j;
				if (j % 3 == 0)
					continue outer;
				if (i % 3 == 0)
					break inner;
				if (i % 3 == 1)
					break outer;
				System.out.println(i * j);
			} while (j < i);
			System.out.println(i + j);
		}
	}
}
