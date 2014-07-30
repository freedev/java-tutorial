/**
 * 
 */
package com.damore.tutorial.generics;

/**
 * @author freedev
 *
 */
public class Box<T> {

	T t;
	/**
	 * 
	 */
	public Box(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}

}
