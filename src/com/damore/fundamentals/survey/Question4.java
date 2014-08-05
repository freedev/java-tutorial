/**
 * 
 */
package com.damore.fundamentals.survey;

/**
 * @author freedev
 * 
 */
class Question4 {
	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		outer: while (i < j) {
			++i;
			inner: do {
				++j;
				if (i++ % 3 == 2)
					break inner;
				else if (j++ % 3 == 1)
					break outer;
				System.out.println(i * j);
			} while (j < i);
			System.out.println(i + j);
		}
	}
}
