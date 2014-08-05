package com.damore.tutorial.generics.test2;

public enum Singleton implements ListenerInterface<Object> {
	
	INSTANCE;

	public static <T> ListenerInterface<T> getListener() {
        return (ListenerInterface<T>) INSTANCE;
    }
	
	@Override
	public void handleEvent(Object event) {
		
		// TODO Auto-generated method stub
		
	}
}