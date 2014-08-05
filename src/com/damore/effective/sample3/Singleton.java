package com.damore.effective.sample3;
/**
 * 
 * @author freedev
 *
 */
public class Singleton {

	private static final Singleton INSTANCE = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return INSTANCE;
	}
	
	// Enforce singleton when deserialized 
	private Object readResolve() {
		return INSTANCE;
	}
	
	public void handleGenericEvent() {
		System.out.println("handled");
	}
	
	public static void main(String[] args) {
		Singleton.getInstance().handleGenericEvent();;
	}	
	
}
